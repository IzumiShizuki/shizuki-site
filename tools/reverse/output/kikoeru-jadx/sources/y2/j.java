package y2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f25409g = new j(false, 0, true, 1, 1, a3.c.f195c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a3.c f25415f;

    public j(boolean z10, int i10, boolean z11, int i11, int i12, a3.c cVar) {
        this.f25410a = z10;
        this.f25411b = i10;
        this.f25412c = z11;
        this.f25413d = i11;
        this.f25414e = i12;
        this.f25415f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f25410a == jVar.f25410a && this.f25411b == jVar.f25411b && this.f25412c == jVar.f25412c && this.f25413d == jVar.f25413d && this.f25414e == jVar.f25414e && jc.l.a(this.f25415f, jVar.f25415f);
    }

    public final int hashCode() {
        return this.f25415f.f196a.hashCode() + ((((((((((this.f25410a ? 1231 : 1237) * 31) + this.f25411b) * 31) + (this.f25412c ? 1231 : 1237)) * 31) + this.f25413d) * 31) + this.f25414e) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f25410a);
        sb.append(", capitalization=");
        int i10 = this.f25411b;
        sb.append((Object) (i10 == -1 ? "Unspecified" : i10 == 0 ? "None" : i10 == 1 ? "Characters" : i10 == 2 ? "Words" : i10 == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f25412c);
        sb.append(", keyboardType=");
        sb.append((Object) k.a(this.f25413d));
        sb.append(", imeAction=");
        sb.append((Object) i.a(this.f25414e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f25415f);
        sb.append(')');
        return sb.toString();
    }
}
