package f8;

import android.animation.TypeEvaluator;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6861a = new g();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f11 = ((iIntValue >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f;
        float f12 = ((iIntValue >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f;
        float f13 = ((iIntValue >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f14 = ((iIntValue2 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f;
        float f15 = ((iIntValue2 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f;
        float f16 = ((iIntValue2 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f;
        float fPow = (float) Math.pow(f12, 2.2d);
        float fPow2 = (float) Math.pow(f13, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(f15, 2.2d);
        float fPow5 = ((((float) Math.pow(f16, 2.2d)) - fPow2) * f10) + fPow2;
        float fPow6 = ((((float) Math.pow((iIntValue2 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) / 255.0f, 2.2d)) - fPow3) * f10) + fPow3;
        float f17 = (((f14 - f11) * f10) + f11) * 255.0f;
        return Integer.valueOf((Math.round(((float) Math.pow(((fPow4 - fPow) * f10) + fPow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f17) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
