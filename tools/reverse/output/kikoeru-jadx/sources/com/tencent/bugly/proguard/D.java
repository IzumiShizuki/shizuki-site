package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static sa f4847a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static B f4848b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f4849c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sa f4850d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B f4851e = null;

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        sa saVar = this.f4850d;
        if (saVar != null) {
            c0009l.a((AbstractC0010m) saVar, 0);
        }
        B b10 = this.f4851e;
        if (b10 != null) {
            c0009l.a((AbstractC0010m) b10, 1);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4849c) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        D d10 = (D) obj;
        return n.a(this.f4850d, d10.f4850d) && n.a(this.f4851e, d10.f4851e);
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        if (f4847a == null) {
            f4847a = new sa();
        }
        this.f4850d = (sa) c0008k.a((AbstractC0010m) f4847a, 0, false);
        if (f4848b == null) {
            f4848b = new B();
        }
        this.f4851e = (B) c0008k.a((AbstractC0010m) f4848b, 1, false);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        C0006i c0006i = new C0006i(sb, i10);
        c0006i.a((AbstractC0010m) this.f4850d, "baseStrategy");
        c0006i.a((AbstractC0010m) this.f4851e, "grayStrategy");
    }
}
