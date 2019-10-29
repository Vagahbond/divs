package com.company;

public class Fraction {
    private int denominateur;
    private int numerateur;
    public  Fraction(int aDen, int aNum)
    {
        this.denominateur = aDen;
        this.numerateur = aNum;
    }

    public Fraction addFraction(Fraction aFrac)
    {
        if (this.denominateur == aFrac.denominateur)
        {
            this.numerateur+= aFrac.numerateur;
        }
        else
        {
            this.numerateur = this.numerateur*aFrac.denominateur + aFrac.numerateur*this.denominateur;
            this.denominateur = this.denominateur*aFrac.denominateur;
        }

        return this;
    }

    public Fraction productFraction(Fraction aFrac)
    {
        if (this.denominateur == aFrac.denominateur)
        {
            this.numerateur+= aFrac.numerateur;
        }
        else
        {
            this.numerateur = this.numerateur*aFrac.denominateur + aFrac.numerateur*this.denominateur;
            this.denominateur = this.denominateur*aFrac.denominateur;
        }

        return this;
    }

}
