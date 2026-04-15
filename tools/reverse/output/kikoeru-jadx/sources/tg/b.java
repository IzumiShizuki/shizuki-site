package tg;

import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f20754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f20755b;

    static {
        String str = File.separator;
        Charset charsetForName = Charset.forName("UTF-8");
        f20754a = charsetForName;
        f20755b = charsetForName;
    }
}
