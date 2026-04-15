package v4;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends m4.r0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f22569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f22570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m4.q f22571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f22572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j5.d0 f22573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f22574p;

    public m(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    @Override // m4.r0
    public final boolean a(m4.r0 r0Var) {
        if (!super.a(r0Var)) {
            return false;
        }
        int i10 = p4.c0.f16548a;
        m mVar = (m) r0Var;
        return this.f22568j == mVar.f22568j && Objects.equals(this.f22569k, mVar.f22569k) && this.f22570l == mVar.f22570l && Objects.equals(this.f22571m, mVar.f22571m) && this.f22572n == mVar.f22572n && Objects.equals(this.f22573o, mVar.f22573o) && this.f22574p == mVar.f22574p;
    }

    public final m c(j5.d0 d0Var) {
        String message = getMessage();
        int i10 = p4.c0.f16548a;
        return new m(message, getCause(), this.f14570a, this.f22568j, this.f22569k, this.f22570l, this.f22571m, this.f22572n, d0Var, this.f14571b, this.f22574p);
    }

    public m(String str, Throwable th2, int i10, int i11, String str2, int i12, m4.q qVar, int i13, j5.d0 d0Var, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        p4.c.c(!z10 || i11 == 1);
        p4.c.c(th2 != null || i11 == 3);
        this.f22568j = i11;
        this.f22569k = str2;
        this.f22570l = i12;
        this.f22571m = qVar;
        this.f22572n = i13;
        this.f22573o = d0Var;
        this.f22574p = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(int i10, Exception exc, int i11, String str, int i12, m4.q qVar, int i13, boolean z10) {
        String str2;
        int i14;
        m4.q qVar2;
        String string;
        String str3;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            qVar2 = qVar;
            string = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i14 = i12;
            qVar2 = qVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i14 = i12;
            sb.append(i14);
            sb.append(", format=");
            qVar2 = qVar;
            sb.append(qVar2);
            sb.append(", format_supported=");
            int i15 = p4.c0.f16548a;
            if (i13 == 0) {
                str3 = "NO";
            } else if (i13 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i13 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : j2.h0.j(string, ": null"), exc, i11, i10, str2, i14, qVar2, i13, null, SystemClock.elapsedRealtime(), z10);
    }
}
