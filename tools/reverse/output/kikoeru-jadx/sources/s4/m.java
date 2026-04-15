package s4;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m4.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f19442j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f19443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f19446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f19447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19451i;

    static {
        j0.a("media3.datasource");
    }

    public m(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11) {
        p4.c.c(j10 + j11 >= 0);
        p4.c.c(j11 >= 0);
        p4.c.c(j12 > 0 || j12 == -1);
        uri.getClass();
        this.f19443a = uri;
        this.f19444b = j10;
        this.f19445c = i10;
        this.f19446d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f19447e = Collections.unmodifiableMap(new HashMap(map));
        this.f19448f = j11;
        this.f19449g = j12;
        this.f19450h = str;
        this.f19451i = i11;
    }

    public final l a() {
        l lVar = new l();
        lVar.f19433a = this.f19443a;
        lVar.f19434b = this.f19444b;
        lVar.f19435c = this.f19445c;
        lVar.f19436d = this.f19446d;
        lVar.f19437e = this.f19447e;
        lVar.f19438f = this.f19448f;
        lVar.f19439g = this.f19449g;
        lVar.f19440h = this.f19450h;
        lVar.f19441i = this.f19451i;
        return lVar;
    }

    public final m b(long j10) {
        long j11 = this.f19449g;
        return c(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public final m c(long j10, long j11) {
        if (j10 == 0 && this.f19449g == j11) {
            return this;
        }
        return new m(this.f19443a, this.f19444b, this.f19445c, this.f19446d, this.f19447e, this.f19448f + j10, j11, this.f19450h, this.f19451i);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i10 = this.f19445c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f19443a);
        sb.append(", ");
        sb.append(this.f19448f);
        sb.append(", ");
        sb.append(this.f19449g);
        sb.append(", ");
        sb.append(this.f19450h);
        sb.append(", ");
        sb.append(this.f19451i);
        sb.append("]");
        return sb.toString();
    }
}
