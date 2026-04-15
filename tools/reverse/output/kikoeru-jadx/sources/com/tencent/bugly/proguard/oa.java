package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class oa extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static ArrayList<na> f5035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<na> f5036b = null;

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a((Collection) this.f5036b, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        if (f5035a == null) {
            f5035a = new ArrayList<>();
            f5035a.add(new na());
        }
        this.f5036b = (ArrayList) c0008k.a(f5035a, 0, true);
    }
}
