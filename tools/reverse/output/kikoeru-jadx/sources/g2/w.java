package g2;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f7304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f7305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f7306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f7307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f7308f;

    public w(String str) {
        this.f7303a = 1;
        this.f7308f = str;
        this.f7304b = new v(1, null);
        this.f7305c = new v(0, null);
        this.f7306d = new v(1, null);
        this.f7307e = new v(0, null);
    }

    public final v a() {
        switch (this.f7303a) {
        }
        return this.f7307e;
    }

    public final v b() {
        switch (this.f7303a) {
        }
        return this.f7304b;
    }

    public final v c() {
        switch (this.f7303a) {
        }
        return this.f7306d;
    }

    public final v d() {
        switch (this.f7303a) {
        }
        return this.f7305c;
    }

    public final String toString() {
        switch (this.f7303a) {
            case 0:
                return vb.l.D0((w[]) this.f7308f, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) this.f7308f;
                return str != null ? a0.c.G(')', "RectRulers(", str) : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(w[] wVarArr) {
        this.f7303a = 0;
        this.f7308f = wVarArr;
        int length = wVarArr.length;
        v[] vVarArr = new v[length];
        for (int i10 = 0; i10 < length; i10++) {
            vVarArr[i10] = ((w[]) this.f7308f)[i10].b();
        }
        this.f7304b = new v(1, new u1(vVarArr, 0));
        int length2 = ((w[]) this.f7308f).length;
        v[] vVarArr2 = new v[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            vVarArr2[i11] = ((w[]) this.f7308f)[i11].d();
        }
        this.f7305c = new v(0, new u(vVarArr2, 0));
        int length3 = ((w[]) this.f7308f).length;
        v[] vVarArr3 = new v[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            vVarArr3[i12] = ((w[]) this.f7308f)[i12].c();
        }
        this.f7306d = new v(1, new u1(vVarArr3, 1));
        int length4 = ((w[]) this.f7308f).length;
        v[] vVarArr4 = new v[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            vVarArr4[i13] = ((w[]) this.f7308f)[i13].a();
        }
        this.f7307e = new v(0, new u(vVarArr4, 1));
    }
}
