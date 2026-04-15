.class public final Lb7/r3;
.super Landroidx/lifecycle/q;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final b:Lb7/v1;

.field public c:[I


# direct methods
.method public constructor <init>(Lb7/v1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb7/r3;->b:Lb7/v1;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final X0(Lc7/e1;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lc7/e1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/app/Notification$Builder;

    .line 4
    .line 5
    new-instance v0, Landroid/app/Notification$MediaStyle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/app/Notification$MediaStyle;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lb7/r3;->b:Lb7/v1;

    .line 11
    .line 12
    iget-object v2, v1, Lb7/v1;->a:Lb7/c2;

    .line 13
    .line 14
    iget-object v2, v2, Lb7/c2;->h:Lb7/o2;

    .line 15
    .line 16
    iget-object v2, v2, Lb7/o2;->k:Lc7/e1;

    .line 17
    .line 18
    iget-object v2, v2, Lc7/e1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lc7/w0;

    .line 21
    .line 22
    iget-object v2, v2, Lc7/w0;->c:Lc7/d1;

    .line 23
    .line 24
    iget-object v2, v2, Lc7/d1;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Landroid/media/session/MediaSession$Token;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/app/Notification$MediaStyle;->setMediaSession(Landroid/media/session/MediaSession$Token;)Landroid/app/Notification$MediaStyle;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v2, p0, Lb7/r3;->c:[I

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/app/Notification$MediaStyle;->setShowActionsInCompactView([I)Landroid/app/Notification$MediaStyle;

    .line 37
    .line 38
    .line 39
    :cond_0
    sget v2, Lp4/c0;->a:I

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 42
    .line 43
    .line 44
    new-instance v0, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v1, v1, Lb7/v1;->a:Lb7/c2;

    .line 50
    .line 51
    iget-object v1, v1, Lb7/c2;->j:Lb7/k4;

    .line 52
    .line 53
    invoke-virtual {v1}, Lb7/k4;->b()Landroid/os/Bundle;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "androidx.media3.session"

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 63
    .line 64
    .line 65
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
