package vc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum r {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(lc.b.v("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(lc.b.v("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(lc.b.v("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(lc.b.v("kotlin/ULong", false));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.b f22923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.e f22924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be.b f22925c;

    r(be.b bVar) {
        this.f22923a = bVar;
        be.e eVarF = bVar.f();
        this.f22924b = eVarF;
        this.f22925c = new be.b(bVar.f2740a, be.e.e(eVarF.b() + "Array"));
    }
}
