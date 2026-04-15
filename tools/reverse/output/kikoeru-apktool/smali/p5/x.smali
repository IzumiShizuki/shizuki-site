.class public final synthetic Lp5/x;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp5/y;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lp5/y;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp5/x;->a:Lp5/y;

    .line 5
    .line 6
    iput-object p2, p0, Lp5/x;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, Lp5/x;->c:J

    .line 9
    .line 10
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lp5/x;->a:Lp5/y;

    .line 2
    .line 3
    iget-object v0, v0, Lp5/y;->c:Lv4/s;

    .line 4
    .line 5
    sget v1, Lp4/c0;->a:I

    .line 6
    .line 7
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 8
    .line 9
    iget-object v1, v0, Lv4/v;->s:Lw4/d;

    .line 10
    .line 11
    invoke-virtual {v1}, Lw4/d;->Z()Lw4/a;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Landroidx/media3/exoplayer/offline/g;

    .line 16
    .line 17
    iget-object v4, p0, Lp5/x;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iget-wide v5, p0, Lp5/x;->c:J

    .line 20
    .line 21
    invoke-direct {v3, v2, v4, v5, v6}, Landroidx/media3/exoplayer/offline/g;-><init>(Lw4/a;Ljava/lang/Object;J)V

    .line 22
    .line 23
    .line 24
    const/16 v5, 0x1a

    .line 25
    .line 26
    invoke-virtual {v1, v2, v5, v3}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Lv4/v;->M:Ljava/lang/Object;

    .line 30
    .line 31
    if-ne v1, v4, :cond_0

    .line 32
    .line 33
    iget-object v0, v0, Lv4/v;->m:Lp4/n;

    .line 34
    .line 35
    new-instance v1, Lm4/d1;

    .line 36
    .line 37
    const/16 v2, 0x15

    .line 38
    .line 39
    invoke-direct {v1, v2}, Lm4/d1;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v5, v1}, Lp4/n;->e(ILp4/k;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
