package com.company;

public class CreditСard
{
    private long number;
    private String cardType;
    private String currencyType;
    private double paymentCommission;
    private int CVC;
    public static int expirationDate = 2026;
    protected String cardHolder;
    protected String cardName;

    public long getNumber()
    {
        return number;
    }

    public String getCardType()
    {
        return cardType;
    }

    public String getCurrencyType()
    {
        return currencyType;
    }

    public double getPaymentCommission()
    {
        return paymentCommission;
    }

    public String getCardHolder()
    {
        return cardHolder;
    }

    public void setNumber(long number)
    {
        this.number = number;
    }

    public void setCardType(String CardType)
    {
        this.cardType = CardType;
    }

    public void setCurrencyType(String CurrencyType)
    {
        this.currencyType = CurrencyType;
    }

    public void setPaymentCommission(double PaymentCommission)
    {
        this.paymentCommission = PaymentCommission;
    }

    public void setCardHolder(String CardHolder)
    {
        this.cardHolder = CardHolder;
    }

    public CreditСard()
    {
        this(1419568667893412L, "MasrerCard", "Dollar", 2.2f, "Petryshyn", 2024, 908, "monobank");
    }

    public CreditСard(long number, String cardType, int CVC, String cardName)
    {
        this(number, cardType, "Dollar", 2.2f, "Petryshyn", 2024, CVC, cardName);
    }

    public CreditСard(long number, String cardType, String currencyType, double paymentCommission, String cardHolder, int expirationDate, int CVC, String cardName)
    {
        this.number = number;
        this.cardType = cardType;
        this.currencyType = currencyType;
        this.paymentCommission = paymentCommission;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.CVC = CVC;
        this.cardName = cardName;
    }

    public String toString()
    {
        return "\n" + " Card number: " + number + "\n"
                + "Card type: " + cardType + "\n"
                + "Currency Type: " + currencyType + "\n"
                + "Payment Commission: " + paymentCommission + "%\n"
                + "Card Holder: " + cardHolder + "\n"
                + "ExpirationDate" + expirationDate + "\n"
                + "CVC: " + CVC + "\n"
                + "Card Name: " + cardName + "\n";
    }

    public void resetValues(long number, String cardType, String currencyType, double paymentCommission, String cardHolder, int expirationDate, int CVC, String cardName) {
        this.number = number;
        this.cardType = cardType;
        this.currencyType = currencyType;
        this.paymentCommission = paymentCommission;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.CVC = CVC;
        this.cardName = cardName;
    }

    public int printStaticExpirationDate()
    {
        return expirationDate;
    }
}

