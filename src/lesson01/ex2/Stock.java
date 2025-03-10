package lesson01.ex2;

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePrecent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
