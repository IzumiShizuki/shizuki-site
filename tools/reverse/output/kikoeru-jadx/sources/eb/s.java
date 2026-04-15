package eb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f6471a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f6471a = bool;
    }

    public static boolean k(s sVar) {
        Serializable serializable = sVar.f6471a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger a() {
        Serializable serializable = this.f6471a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (k(this)) {
            return BigInteger.valueOf(i().longValue());
        }
        String strJ = j();
        gb.d.d(strJ);
        return new BigInteger(strJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = sVar.f6471a;
        Serializable serializable2 = this.f6471a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (k(this) && k(sVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? a().equals(sVar.a()) : i().longValue() == sVar.i().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : gb.d.i(j())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : gb.d.i(sVar.j())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? i().doubleValue() : Double.parseDouble(j());
        double dDoubleValue2 = serializable instanceof Number ? sVar.i().doubleValue() : Double.parseDouble(sVar.j());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f6471a;
        if (serializable == null) {
            return 31;
        }
        if (k(this)) {
            jDoubleToLongBits = i().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final Number i() {
        Serializable serializable = this.f6471a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new gb.i((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String j() {
        Serializable serializable = this.f6471a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return i().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f6471a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f6471a = str;
    }
}
