package r8;

import android.graphics.Bitmap;
import b7.b1;
import ef.u;
import java.util.Date;
import ug.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f18923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f18925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Date f18927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f18929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f18931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f18932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18933k;

    public c(b1 b1Var, b bVar) {
        int i10;
        this.f18923a = b1Var;
        this.f18924b = bVar;
        this.f18933k = -1;
        if (bVar != null) {
            this.f18930h = bVar.f18919c;
            this.f18931i = bVar.f18920d;
            r rVar = bVar.f18922f;
            int size = rVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String strI = rVar.i(i11);
                if (strI.equalsIgnoreCase("Date")) {
                    String strA = rVar.a("Date");
                    this.f18925c = strA != null ? ah.d.a(strA) : null;
                    this.f18926d = rVar.k(i11);
                } else if (strI.equalsIgnoreCase("Expires")) {
                    String strA2 = rVar.a("Expires");
                    this.f18929g = strA2 != null ? ah.d.a(strA2) : null;
                } else if (strI.equalsIgnoreCase("Last-Modified")) {
                    String strA3 = rVar.a("Last-Modified");
                    this.f18927e = strA3 != null ? ah.d.a(strA3) : null;
                    this.f18928f = rVar.k(i11);
                } else if (strI.equalsIgnoreCase("ETag")) {
                    this.f18932j = rVar.k(i11);
                } else if (strI.equalsIgnoreCase("Age")) {
                    String strK = rVar.k(i11);
                    Bitmap.Config[] configArr = x8.d.f24838a;
                    Long lM0 = u.m0(strK);
                    if (lM0 != null) {
                        long jLongValue = lM0.longValue();
                        i10 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i10 = -1;
                    }
                    this.f18933k = i10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ub.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r8.d a() {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.c.a():r8.d");
    }
}
