package oe;

import bd.f0;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yd.f f16431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f16432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f16433c;

    public w(yd.f fVar, f0 f0Var, m0 m0Var) {
        this.f16431a = fVar;
        this.f16432b = f0Var;
        this.f16433c = m0Var;
    }

    public abstract be.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
