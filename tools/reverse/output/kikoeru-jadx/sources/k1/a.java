package k1;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import i7.p2;
import ic.p;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jc.m implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f10981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i10) {
        super(4);
        this.f10981b = bVar;
        this.f10982c = i10;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        b bVar = this.f10981b;
        p2 p2Var = bVar.f10983a;
        ((AutofillManager) p2Var.f9258a).notifyViewEntered(bVar.f10985c, this.f10982c, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return a0.f21526a;
    }
}
