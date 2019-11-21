package com.company;

import java.util.Objects;

public class Fraction {
<<<<<<< HEAD
    private int denominateur;
    private int numerateur;
    Fraction(int aDen, int aNum)
=======
    private double denominateur;
    private double numerateur;
    private  Fraction(double aDen, double aNum)
>>>>>>> master
    {
        this.denominateur = aDen;
        this.numerateur = aNum;
    }

<<<<<<< HEAD
    Fraction addFraction(Fraction aFrac)
=======
    private Fraction addFraction(Fraction aFrac)
>>>>>>> master
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

    private Fraction divideFraction(Fraction aFrac)
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

    private Fraction factorFraction(Fraction aFrac)
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return denominateur == fraction.denominateur &&
                numerateur == fraction.numerateur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominateur, numerateur);
    }
}
