.class public final Lob/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/tencent/bugly/crashreport/biz/c;


# direct methods
.method public synthetic constructor <init>(Lcom/tencent/bugly/crashreport/biz/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lob/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lob/a;->b:Lcom/tencent/bugly/crashreport/biz/c;

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
    .locals 7

    .line 1
    iget v0, p0, Lob/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object v2, p0, Lob/a;->b:Lcom/tencent/bugly/crashreport/biz/c;

    .line 11
    .line 12
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/biz/c;->b(Lcom/tencent/bugly/crashreport/biz/c;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    cmp-long v5, v0, v3

    .line 17
    .line 18
    if-gez v5, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Lob/a;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-direct {v4, v2, v5}, Lob/a;-><init>(Lcom/tencent/bugly/crashreport/biz/c;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/biz/c;->b(Lcom/tencent/bugly/crashreport/biz/c;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    sub-long/2addr v5, v0

    .line 35
    const-wide/16 v0, 0x1388

    .line 36
    .line 37
    add-long/2addr v5, v0

    .line 38
    invoke-virtual {v3, v4, v5, v6}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    invoke-virtual {v2, v1, v0, v3, v4}, Lcom/tencent/bugly/crashreport/biz/c;->a(IZJ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/tencent/bugly/crashreport/biz/c;->a()V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lob/a;->b:Lcom/tencent/bugly/crashreport/biz/c;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/tencent/bugly/crashreport/biz/c;->a(Lcom/tencent/bugly/crashreport/biz/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 61
    .line 62
    .line 63
    :goto_1
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
