package g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4.c0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements r, x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f7382b = new i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7383a;

    public /* synthetic */ i(int i10) {
        this.f7383a = i10;
    }

    @Override // g5.r
    public List a(String str, boolean z10, boolean z11) {
        switch (this.f7383a) {
            case 1:
                return y.e(str, z10, z11);
            default:
                ArrayList arrayList = new ArrayList(y.e(str, z10, z11));
                Collections.sort(arrayList, new s(0, new i(4)));
                return i0.q(arrayList);
        }
    }

    @Override // g5.x
    public int d(Object obj) {
        n nVar = (n) obj;
        switch (this.f7383a) {
            case 3:
                String str = nVar.f7385a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (c0.f16548a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return (nVar.f7392h ? 2 : 0) + (!nVar.f7393i ? 1 : 0);
        }
    }
}
