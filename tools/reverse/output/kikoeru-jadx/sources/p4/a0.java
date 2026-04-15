package p4;

import android.content.pm.verify.domain.DomainVerificationManager;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a0 {
    public static /* bridge */ /* synthetic */ DomainVerificationManager b(Object obj) {
        return (DomainVerificationManager) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager e(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder j(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder k() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return DomainVerificationManager.class;
    }
}
