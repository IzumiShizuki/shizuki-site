package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class ra extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5086a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5087b = "";

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5086a, 0);
        c0009l.a(this.f5087b, 1);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5086a = c0008k.a(0, true);
        this.f5087b = c0008k.a(1, true);
    }
}
