.class public final synthetic Lb7/x0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb7/d1;


# direct methods
.method public synthetic constructor <init>(Lb7/d1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb7/x0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7/x0;->b:Lb7/d1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lb7/x0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc7/o;

    .line 7
    .line 8
    iget-object v1, p0, Lb7/x0;->b:Lb7/d1;

    .line 9
    .line 10
    iget-object v2, v1, Lb7/d1;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, v1, Lb7/d1;->c:Lb7/k4;

    .line 13
    .line 14
    iget-object v3, v3, Lb7/k4;->a:Lb7/j4;

    .line 15
    .line 16
    invoke-interface {v3}, Lb7/j4;->f()Landroid/content/ComponentName;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v4, Lc7/e1;

    .line 21
    .line 22
    invoke-direct {v4, v1}, Lc7/e1;-><init>(Lb7/d1;)V

    .line 23
    .line 24
    .line 25
    iget-object v5, v1, Lb7/d1;->b:Lb7/d0;

    .line 26
    .line 27
    iget-object v5, v5, Lb7/d0;->b:Lb7/c0;

    .line 28
    .line 29
    invoke-interface {v5}, Lb7/c0;->U()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-direct {v0, v2, v3, v4, v5}, Lc7/o;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Lc7/e1;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, v1, Lb7/d1;->i:Lc7/o;

    .line 37
    .line 38
    const-string v1, "MediaBrowserCompat"

    .line 39
    .line 40
    const-string v2, "Connecting to a MediaBrowserService."

    .line 41
    .line 42
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Lc7/o;->a:Lc7/j;

    .line 46
    .line 47
    iget-object v0, v0, Lc7/j;->b:Landroid/media/browse/MediaBrowser;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->connect()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, Lb7/x0;->b:Lb7/d1;

    .line 54
    .line 55
    iget-object v1, v0, Lb7/d1;->h:Landroidx/media3/exoplayer/offline/u;

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lc7/j0;

    .line 60
    .line 61
    iget-object v1, v1, Lc7/j0;->e:Lc7/d1;

    .line 62
    .line 63
    invoke-virtual {v1}, Lc7/d1;->a()Lc7/h;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v0}, Lb7/d1;->j()V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
