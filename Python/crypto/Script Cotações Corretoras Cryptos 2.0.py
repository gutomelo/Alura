import requests, json
import time, os

# Cotações das corretoras: BitcoinTrade, NovaDax, MercadoBitCoin, BitPreco, BitcoinToYou
Cotacoes = {}
# Lista das Cryptos analisadas
lista_crypto = ['BTC','ETH','BCH','LTC','XRP','EOS','DAI']

def bitcointrade():
    lista = {'BTC':'BRLBTC','ETH':'BRLETH','BCH':'BRLBCH','LTC':'BRLLTC','XRP':'BRLXRP','EOS':'BRLEOS','DAI':'BRLDAI'}
    corretora = {'BitcoinTrade':{}}
    
    for i in lista:
        try:
            requisicao = requests.get('https://api.bitcointrade.com.br/v3/public/'+lista[i]+'/ticker', timeout=(1,1))
        except:
            continue
        finally:        
            Symbol = json.loads(requisicao.text)
            if 'data' in Symbol:
                Crypto = {i:{'bid':float(Symbol['data']['buy']),'ask':float(Symbol['data']['sell'])}}
                corretora['BitcoinTrade'].update(Crypto)
            
    Cotacoes.update(corretora)
    

def novadax():
    lista = {'BTC':'BTC_BRL','ETH':'ETH_BRL','BCH':'BCH_BRL','LTC':'LTC_BRL','XRP':'XRP_BRL','EOS':'EOS_BRL','DAI':'DAI_BRL'}
    corretora = {'NovaDax':{}}
    
    for i in lista:
        try:
            requisicao = requests.get('https://api.novadax.com/v1/market/ticker?symbol='+lista[i],timeout=(1,1))
        except:
            continue        
        finally:
            Symbol = json.loads(requisicao.text)
            if 'data' in Symbol:
                Crypto = {i:{'bid':float(Symbol['data']['bid']),'ask':float(Symbol['data']['ask'])}}
                corretora['NovaDax'].update(Crypto)

    Cotacoes.update(corretora)
    

def mercadobitcoin():
    lista = {'BTC':'BTC','ETH':'ETH','BCH':'BCH','LTC':'LTC','XRP':'XRP'}
    corretora = {'MercadoBitCoin':{}}
    
    for i in lista:
        try:
            requisicao = requests.get('https://www.mercadobitcoin.net/api/'+lista[i]+'/ticker/',timeout=(1,1))
        except:
            continue        
        finally:
            Symbol = json.loads(requisicao.text)
            if 'ticker' in Symbol:
                Crypto = {i:{'bid':float(Symbol['ticker']['buy']),'ask':float(Symbol['ticker']['sell'])}}
                corretora['MercadoBitCoin'].update(Crypto)

    Cotacoes.update(corretora)

def binance():
    lista = {'BTC':'BTCBRL','ETH':'ETHBRL','XRP':'XRPBRL'}
    corretora = {'Binance':{}}
    
    for i in lista:
        try:
            requisicao = requests.get('https://api2.binance.com/api/v3/depth?symbol='+lista[i]+'&limit=5',timeout=(1,1))
        except:
            continue
        finally:
            Symbol = json.loads(requisicao.text)
            if 'bids' and 'asks' in Symbol:
                Crypto = {i:{'bid':float(Symbol['bids'][0][0]),'ask':float(Symbol['asks'][0][0])}}
                corretora['Binance'].update(Crypto)
                    
    #print(corretora)
    Cotacoes.update(corretora)


def bitpreco():
    lista = {'BTC':'btc-brl','ETH':'eth-brl'}
    corretora = {'BitPreco':{}}
    
    for i in lista:
        try:
            requisicao = requests.get('https://api.bitpreco.com/'+lista[i]+'/ticker',timeout=(1,1))
        except:
            continue
        finally:
            Symbol = json.loads(requisicao.text)
            if 'buy' and 'sell' in Symbol:
                Crypto = {i:{'bid':float(Symbol['buy']),'ask':float(Symbol['sell'])}}
                corretora['BitPreco'].update(Crypto)

    Cotacoes.update(corretora)

def bitcointoyou():
    lista = {'BTC':'BTC_BRLC','ETH':'ETH_BRLC','LTC':'LTC_BRLC'}
    corretora = {'BitcoinToYou':{}}
    
    for i in lista:
        try:
            requisicao = requests.get('https://back.bitcointoyou.com/API/orderbook?pair='+lista[i]+'&depth=1',timeout=(1,1))
        except:
            continue
        finally:
            Symbol = json.loads(requisicao.text)
            if 'bids' and 'asks' in Symbol:
                Crypto = {i:{'bid':float(Symbol['bids'][0][0]),'ask':float(Symbol['asks'][0][0])}}
                corretora['BitcoinToYou'].update(Crypto)
    
    Cotacoes.update(corretora)        

while True:
    #Atualizando todas as cotações
    #Cotacoes = {}
    bitcointrade()
    novadax()
    mercadobitcoin()
    #binance()
    bitpreco()
    bitcointoyou()
    #print(Cotacoes)

    os.system('clear') or None
    #Cotações do Bitcoin
    for crypto in lista_crypto:
        print('|>>> '+crypto+' <<<|')
        for corretora in Cotacoes:
            if crypto in Cotacoes[corretora]:
                bid = Cotacoes[corretora][crypto]['bid']
                ask = Cotacoes[corretora][crypto]['ask']
                print('-'*100)
                string = f'Cotação de {crypto} em {corretora} >> Preço de compra: {ask:.2f}, Preço de venda: {bid:.2f} |'
                tam_string = 99 - len(string)
                print('|'+' '*tam_string+string)
        print('-'*100)
    
    time.sleep(0.2)     

