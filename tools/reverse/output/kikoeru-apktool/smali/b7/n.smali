.class public final Lb7/n;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lcb/s;
.implements Lte/c;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lb7/n;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb7/n;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb7/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb7/n;->a:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 24
    new-instance p1, Lb5/a;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lb5/a;-><init>(I)V

    iput-object p1, p0, Lb7/n;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lv4/s;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lb7/n;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 17
    new-instance p1, Lv4/a;

    invoke-direct {p1, p0, p2, p3}, Lv4/a;-><init>(Lb7/n;Landroid/os/Handler;Lv4/s;)V

    iput-object p1, p0, Lb7/n;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb7/c2;Lb7/t1;ZLm4/u0;)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Lb7/n;->a:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/n;->d:Ljava/lang/Object;

    iput-object p2, p0, Lb7/n;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lb7/n;->b:Z

    return-void
.end method

.method public constructor <init>(Lb7/o2;Lb7/t1;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb7/n;->a:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/n;->d:Ljava/lang/Object;

    iput-object p2, p0, Lb7/n;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lb7/n;->b:Z

    return-void
.end method

.method public constructor <init>(Lhf/y;ZLic/n;Le/k;)V
    .locals 6

    const/4 v0, 0x5

    iput v0, p0, Lb7/n;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-boolean p2, p0, Lb7/n;->b:Z

    const/4 p2, 0x4

    const/4 v0, -0x2

    .line 20
    sget-object v1, Lkf/a;->a:Lkf/a;

    invoke-static {v0, p2, v1}, Lg8/a;->c(IILkf/a;)Lkf/f;

    move-result-object p2

    iput-object p2, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 21
    new-instance v0, Le/j;

    const/4 v5, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    move-object v2, p3

    move-object v1, p4

    invoke-direct/range {v0 .. v5}, Le/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    const/4 p2, 0x3

    invoke-static {p1, v4, v4, v0, p2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    move-result-object p1

    iput-object p1, v3, Lb7/n;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lld/u;Lbd/a;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lb7/n;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 6
    iget-boolean p1, p1, Lld/u;->d:Z

    if-nez p1, :cond_1

    .line 7
    sget-object p1, Lld/r;->a:Lbe/c;

    .line 8
    invoke-virtual {p2, p1}, Lbd/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lld/a0;->b:Lld/a0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lb7/n;->b:Z

    return-void
.end method

.method public constructor <init>(Lo/s;Landroidx/media3/exoplayer/offline/u;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lb7/n;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 14
    iput-object p2, p0, Lb7/n;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyc/b;Lyc/b;Z)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lb7/n;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lb7/n;->b:Z

    iput-object p1, p0, Lb7/n;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb7/n;->d:Ljava/lang/Object;

    return-void
.end method

.method private final e(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.method public a(Lse/k0;Lse/k0;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lb7/n;->b:Z

    .line 2
    .line 3
    iget-object v1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lyc/b;

    .line 6
    .line 7
    iget-object v2, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lyc/b;

    .line 10
    .line 11
    const-string v3, "c1"

    .line 12
    .line 13
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "c2"

    .line 17
    .line 18
    invoke-static {p2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    invoke-interface {p1}, Lse/k0;->h()Lyc/h;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p2}, Lse/k0;->h()Lyc/h;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    instance-of v3, p1, Lyc/q0;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    instance-of v3, p2, Lyc/q0;

    .line 42
    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    check-cast p1, Lyc/q0;

    .line 47
    .line 48
    check-cast p2, Lyc/q0;

    .line 49
    .line 50
    new-instance v3, Lee/b;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct {v3, v4, v1, v2}, Lee/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lee/c;->a:Lee/c;

    .line 57
    .line 58
    invoke-virtual {v1, p1, p2, v0, v3}, Lee/c;->d(Lyc/q0;Lyc/q0;ZLic/n;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 64
    return p1
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public b(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/exoplayer/offline/u;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    move-object v5, v4

    .line 25
    check-cast v5, Lc2/v;

    .line 26
    .line 27
    iget-wide v5, v5, Lc2/v;->a:J

    .line 28
    .line 29
    invoke-static {v5, v6, p1, p2}, Lc2/s;->d(JJ)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v4, 0x0

    .line 40
    :goto_1
    check-cast v4, Lc2/v;

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    iget-boolean p1, v4, Lc2/v;->h:Z

    .line 45
    .line 46
    return p1

    .line 47
    :cond_2
    return v2
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
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkf/f;

    .line 4
    .line 5
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 6
    .line 7
    const-string v2, "onBack cancelled"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, Lkf/f;->l(Ljava/lang/Throwable;Z)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lhf/r1;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Lhf/k1;->g(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public d(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lb7/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lb7/u1;

    .line 7
    .line 8
    iget-object v0, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lb7/o2;

    .line 11
    .line 12
    iget-object v0, v0, Lb7/o2;->g:Lb7/c2;

    .line 13
    .line 14
    iget-object v1, v0, Lb7/c2;->l:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object v2, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lb7/t1;

    .line 19
    .line 20
    iget-boolean v3, p0, Lb7/n;->b:Z

    .line 21
    .line 22
    new-instance v4, Lb7/m1;

    .line 23
    .line 24
    invoke-direct {v4, p0, p1, v3, v2}, Lb7/m1;-><init>(Lb7/n;Lb7/u1;ZLb7/t1;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lb5/h;

    .line 28
    .line 29
    invoke-direct {p1, v0, v2, v4}, Lb5/h;-><init>(Lb7/c2;Lb7/t1;Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p1}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    check-cast p1, Lb7/u1;

    .line 37
    .line 38
    iget-object v0, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lb7/c2;

    .line 41
    .line 42
    iget-object v1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lb7/t1;

    .line 45
    .line 46
    iget-boolean v2, p0, Lb7/n;->b:Z

    .line 47
    .line 48
    iget-object v3, v0, Lb7/c2;->t:Lb7/z3;

    .line 49
    .line 50
    invoke-static {v3, p1}, Lb7/s3;->i(Lm4/y0;Lb7/u1;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, v0, Lb7/c2;->t:Lb7/z3;

    .line 54
    .line 55
    invoke-static {p1}, Lp4/c0;->F(Lm4/y0;)Z

    .line 56
    .line 57
    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lb7/c2;->o(Lb7/t1;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget v0, p0, Lb7/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lb7/c2;

    .line 10
    .line 11
    instance-of v1, p1, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    const-string v2, "MediaSessionImpl"

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v1, "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService."

    .line 18
    .line 19
    invoke-static {v2, v1, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "Failure calling MediaSession.Callback.onPlaybackResumption(): "

    .line 26
    .line 27
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v2, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p1, v0, Lb7/c2;->t:Lb7/z3;

    .line 45
    .line 46
    invoke-static {p1}, Lp4/c0;->F(Lm4/y0;)Z

    .line 47
    .line 48
    .line 49
    iget-boolean p1, p0, Lb7/n;->b:Z

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lb7/t1;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lb7/c2;->o(Lb7/t1;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lb7/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "JavaTypeEnhancementState(jsr305="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lb7/n;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lld/u;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", getReportLevelForAnnotation="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lb7/n;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lbd/a;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x29

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
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
