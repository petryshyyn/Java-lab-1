package com.company;

public class CreditСard
{
    private long number;
    private String CardType;
    private String CurrencyType;
    private double PaymentCommission;
    private String CardHolder ;
    public static int ExpirationDate = 2026;
    protected int CVC;
    protected String CardName;

    public long getNumber(){ return  Number; }
    public String getCardType() { return CardType; }
    public String getCurrencyType() { return CurrencyType; }
    public double getPaymentCommission() { return PaymentCommission; }
    public String getCardHolder() { return CardHolder; }

    public void setNumber(long Number) { this.Number = Number; }
    public void  setCardType(String CardType) { this.CardType = CardType; }
    public void setCurrencytype(String CurrencyType) { this.CurrencyType = CurrencyType; }
    public void setPaymentCommission(double PaymentCommission){ this.PaymentCommission = PaymentCommission; }
    public void setCardHolder(String CardHolder) { this.CardHolder = CardHolder; }

    public CreditСard()
    {
        this(1419568667893412L, "MasrerCard", "Dollar",2.2f,"Petryshyn", 2024, 908,"monobank");
    }
    public CreditСard(long Number, String CardType, int CVC, String CardName)
    {
        this(Number, CardType, "Dollar",2.2f, "Petryshyn", 2024, CVC, CardName);
    }
    public CreditСard(long Number, String CardType, String CurrencyType, double PaymentCommission, String CardHolder, int ExpirationDate, int CVC, String CardName)
    {
    this.Number = Number;
    this.CardType = CardType;
    this.CurrencyType = CurrencyType;
    this.PaymentCommission = PaymentCommission;
    this.CardHolder = CardHolder;
    this.ExpirationDate = ExpirationDate;
    this.CVC = CVC;
    this.CardName = CardName;
    }
    public String toString ()
    {
        return    "\n"+" Card number: " + Number +"\n"
                + "Card type: " + CardType + "\n"
                + "Currency Type: " + CurrencyType + "\n"
                + "Payment Commission: " + PaymentCommission + "%\n"
                + "Card Holder: " + CardHolder + "\n"
                + "ExpirationDate" + ExpirationDate + "\n"
                + "CVC: " + CVC + "\n"
                + "Card Name: " + CardName + "\n";
    }
    public void resetValues(long Number, String CardType, String CurrencyType, double PaymentCommission, String CardHolder, int ExpirationDate, int CVC, String CardName)
    {
        this.Number = Number;
        this.CardType = CardType;
        this.CurrencyType = CurrencyType;
        this.PaymentCommission = PaymentCommission;
        this.CardHolder = CardHolder;
        this.ExpirationDate = ExpirationDate;
        this.CVC = CVC;
        this.CardName = CardName;
    }
    public int printStaticExpirationDate()
    {
        return ExpirationDate;
    }
}
