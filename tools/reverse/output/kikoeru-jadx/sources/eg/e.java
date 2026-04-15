package eg;

import android.content.Context;
import android.view.OrientationEventListener;
import b0.i0;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f6591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, a aVar, i0 i0Var) {
        super(context, 3);
        this.f6591a = aVar;
        this.f6592b = i0Var;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        a aVar = this.f6591a;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = aVar.f6581a;
        if (j10 < 0 || jCurrentTimeMillis - j10 >= TinkerReport.KEY_LOADED_MISMATCH_DEX) {
            aVar.f6581a = jCurrentTimeMillis;
            this.f6592b.q(this, Integer.valueOf(i10));
        }
    }
}
