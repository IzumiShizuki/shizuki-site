package s8;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f19658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f19659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8.f f19660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.b f19661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19664g;

    public o(Drawable drawable, i iVar, j8.f fVar, q8.b bVar, String str, boolean z10, boolean z11) {
        this.f19658a = drawable;
        this.f19659b = iVar;
        this.f19660c = fVar;
        this.f19661d = bVar;
        this.f19662e = str;
        this.f19663f = z10;
        this.f19664g = z11;
    }

    @Override // s8.j
    public final Drawable a() {
        return this.f19658a;
    }

    @Override // s8.j
    public final i b() {
        return this.f19659b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jc.l.a(this.f19658a, oVar.f19658a) && jc.l.a(this.f19659b, oVar.f19659b) && this.f19660c == oVar.f19660c && jc.l.a(this.f19661d, oVar.f19661d) && jc.l.a(this.f19662e, oVar.f19662e) && this.f19663f == oVar.f19663f && this.f19664g == oVar.f19664g;
    }

    public final int hashCode() {
        int iHashCode = (this.f19660c.hashCode() + ((this.f19659b.hashCode() + (this.f19658a.hashCode() * 31)) * 31)) * 31;
        q8.b bVar = this.f19661d;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f19662e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f19663f ? 1231 : 1237)) * 31) + (this.f19664g ? 1231 : 1237);
    }
}
