package ue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import se.k0;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f21636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21637c;

    public j(k kVar, String... strArr) {
        jc.l.e(kVar, "kind");
        jc.l.e(strArr, "formatParams");
        this.f21635a = kVar;
        this.f21636b = strArr;
        String str = kVar.f21662a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f21637c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // se.k0
    public final vc.i g() {
        return (vc.e) vc.e.f22832f.getValue();
    }

    @Override // se.k0
    public final yc.h h() {
        l.f21664a.getClass();
        return l.f21666c;
    }

    @Override // se.k0
    public final Collection i() {
        return r.f22819a;
    }

    @Override // se.k0
    public final boolean j() {
        return false;
    }

    @Override // se.k0
    public final List o() {
        return r.f22819a;
    }

    public final String toString() {
        return this.f21637c;
    }
}
