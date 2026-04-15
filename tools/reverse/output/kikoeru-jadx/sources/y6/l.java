package y6;

import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f25688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25695h;

    public l(h0 h0Var) {
        this.f25688a = h0Var;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f25690c) {
            int i12 = this.f25693f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f25693f = (i11 - i10) + i12;
            } else {
                this.f25691d = ((bArr[i13] & 192) >> 6) == 0;
                this.f25690c = false;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i10, boolean z10, long j10) {
        p4.c.i(this.f25695h != -9223372036854775807L);
        if (this.f25692e == 182 && z10 && this.f25689b) {
            this.f25688a.a(this.f25695h, this.f25691d ? 1 : 0, (int) (j10 - this.f25694g), i10, null);
        }
        if (this.f25692e != 179) {
            this.f25694g = j10;
        }
    }
}
