package oe;

import bd.f0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yd.f f16391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc.k f16392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f16393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yd.i f16394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yd.a f16395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qe.j f16396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final id.h f16397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f16398i;

    public k(i iVar, yd.f fVar, yc.k kVar, f0 f0Var, yd.i iVar2, yd.a aVar, qe.j jVar, id.h hVar, List list) {
        String strC;
        jc.l.e(iVar, "components");
        jc.l.e(fVar, "nameResolver");
        jc.l.e(kVar, "containingDeclaration");
        jc.l.e(iVar2, "versionRequirementTable");
        jc.l.e(aVar, "metadataVersion");
        jc.l.e(list, "typeParameters");
        this.f16390a = iVar;
        this.f16391b = fVar;
        this.f16392c = kVar;
        this.f16393d = f0Var;
        this.f16394e = iVar2;
        this.f16395f = aVar;
        this.f16396g = jVar;
        this.f16397h = new id.h(this, hVar, list, "Deserializer for \"" + kVar.getName() + '\"', (jVar == null || (strC = jVar.C()) == null) ? "[container not found]" : strC);
        this.f16398i = new t(this);
    }

    public final k a(yc.k kVar, List list, yd.f fVar, f0 f0Var, yd.i iVar, yd.a aVar) {
        jc.l.e(list, "typeParameterProtos");
        jc.l.e(fVar, "nameResolver");
        jc.l.e(iVar, "versionRequirementTable");
        jc.l.e(aVar, "metadataVersion");
        int i10 = aVar.f26166b;
        if ((i10 != 1 || aVar.f26167c < 4) && i10 <= 1) {
            iVar = this.f16394e;
        }
        return new k(this.f16390a, fVar, kVar, f0Var, iVar, aVar, this.f16396g, this.f16397h, list);
    }
}
