package ef;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f6542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f6543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Charset f6544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Charset f6545e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        jc.l.d(charsetForName, "forName(...)");
        f6541a = charsetForName;
        jc.l.d(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        jc.l.d(charsetForName2, "forName(...)");
        f6542b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        jc.l.d(charsetForName3, "forName(...)");
        f6543c = charsetForName3;
        jc.l.d(Charset.forName("US-ASCII"), "forName(...)");
        jc.l.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
