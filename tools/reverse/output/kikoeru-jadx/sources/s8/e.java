package s8;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f19584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f19585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f19586c;

    public e(Drawable drawable, i iVar, Throwable th2) {
        this.f19584a = drawable;
        this.f19585b = iVar;
        this.f19586c = th2;
    }

    @Override // s8.j
    public final Drawable a() {
        return this.f19584a;
    }

    @Override // s8.j
    public final i b() {
        return this.f19585b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jc.l.a(this.f19584a, eVar.f19584a) && jc.l.a(this.f19585b, eVar.f19585b) && jc.l.a(this.f19586c, eVar.f19586c);
    }

    public final int hashCode() {
        Drawable drawable = this.f19584a;
        return this.f19586c.hashCode() + ((this.f19585b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
