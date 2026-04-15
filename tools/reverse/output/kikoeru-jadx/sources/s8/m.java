package s8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import ug.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f19642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f19643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t8.h f19644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t8.g f19645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f19650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f19651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f19652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f19653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f19654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f19655o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, t8.h hVar, t8.g gVar, boolean z10, boolean z11, boolean z12, String str, r rVar, p pVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f19641a = context;
        this.f19642b = config;
        this.f19643c = colorSpace;
        this.f19644d = hVar;
        this.f19645e = gVar;
        this.f19646f = z10;
        this.f19647g = z11;
        this.f19648h = z12;
        this.f19649i = str;
        this.f19650j = rVar;
        this.f19651k = pVar;
        this.f19652l = nVar;
        this.f19653m = bVar;
        this.f19654n = bVar2;
        this.f19655o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (jc.l.a(this.f19641a, mVar.f19641a) && this.f19642b == mVar.f19642b) {
            return (Build.VERSION.SDK_INT < 26 || jc.l.a(this.f19643c, mVar.f19643c)) && jc.l.a(this.f19644d, mVar.f19644d) && this.f19645e == mVar.f19645e && this.f19646f == mVar.f19646f && this.f19647g == mVar.f19647g && this.f19648h == mVar.f19648h && jc.l.a(this.f19649i, mVar.f19649i) && jc.l.a(this.f19650j, mVar.f19650j) && jc.l.a(this.f19651k, mVar.f19651k) && jc.l.a(this.f19652l, mVar.f19652l) && this.f19653m == mVar.f19653m && this.f19654n == mVar.f19654n && this.f19655o == mVar.f19655o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f19642b.hashCode() + (this.f19641a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f19643c;
        int iHashCode2 = (((((((this.f19645e.hashCode() + ((this.f19644d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31) + (this.f19646f ? 1231 : 1237)) * 31) + (this.f19647g ? 1231 : 1237)) * 31) + (this.f19648h ? 1231 : 1237)) * 31;
        String str = this.f19649i;
        return this.f19655o.hashCode() + ((this.f19654n.hashCode() + ((this.f19653m.hashCode() + ((this.f19652l.f19657a.hashCode() + ((this.f19651k.f19666a.hashCode() + ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19650j.f21860a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
