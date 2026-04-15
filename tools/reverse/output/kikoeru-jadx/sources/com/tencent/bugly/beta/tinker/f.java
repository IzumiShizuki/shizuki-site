package com.tencent.bugly.beta.tinker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.lib.util.TinkerLog;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f4420a;

    public f(g gVar) {
        this.f4420a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent == null ? "" : intent.getAction();
        TinkerLog.i("Tinker.TinkerUtils", "ScreenReceiver action [%s] ", new Object[]{action});
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            g gVar = this.f4420a;
            if (gVar != null) {
                gVar.a();
            }
            context.unregisterReceiver(this);
        }
    }
}
