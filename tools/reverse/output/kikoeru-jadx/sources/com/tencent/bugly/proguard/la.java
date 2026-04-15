package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class la extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static ArrayList<String> f5000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5001b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<String> f5002c = null;

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0009l c0009l) {
        c0009l.a(this.f5001b, 0);
        ArrayList<String> arrayList = this.f5002c;
        if (arrayList != null) {
            c0009l.a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        this.f5001b = c0008k.a(0, true);
        if (f5000a == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f5000a = arrayList;
            arrayList.add("");
        }
        this.f5002c = (ArrayList) c0008k.a(f5000a, 1, false);
    }
}
