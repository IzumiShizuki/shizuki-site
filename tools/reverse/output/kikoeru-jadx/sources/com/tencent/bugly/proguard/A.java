package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0010m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static ArrayList<z> f4817a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f4818b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<z> f4819c;

    public A() {
        this.f4819c = null;
    }

    public ArrayList<z> a() {
        return this.f4819c;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f4818b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return n.a(this.f4819c, ((A) obj).f4819c);
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
    public void a(C0009l c0009l) {
        c0009l.a((Collection) this.f4819c, 0);
    }

    public A(ArrayList<z> arrayList) {
        this.f4819c = arrayList;
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(C0008k c0008k) {
        if (f4817a == null) {
            f4817a = new ArrayList<>();
            f4817a.add(new z());
        }
        this.f4819c = (ArrayList) c0008k.a(f4817a, 0, true);
    }

    @Override // com.tencent.bugly.proguard.AbstractC0010m
    public void a(StringBuilder sb, int i10) {
        new C0006i(sb, i10).a((Collection) this.f4819c, "events");
    }
}
