package me;

import androidx.lifecycle.q;
import jc.l;
import se.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends q implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15122b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be.e f15123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yc.b bVar, w wVar, be.e eVar) {
        super(wVar);
        l.e(bVar, "declarationDescriptor");
        l.e(wVar, "receiverType");
        this.f15124d = bVar;
        this.f15123c = eVar;
    }

    public final be.e B1() {
        switch (this.f15122b) {
        }
        return this.f15123c;
    }

    public final String toString() {
        switch (this.f15122b) {
            case 0:
                return b() + ": Ctx { " + ((yc.e) this.f15124d) + " }";
            default:
                return "Cxt { " + ((yc.b) this.f15124d) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yc.e eVar, w wVar, be.e eVar2) {
        super(wVar);
        l.e(wVar, "receiverType");
        this.f15124d = eVar;
        this.f15123c = eVar2;
    }
}
