.class public final Lx4/v;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final j0:Ljava/lang/Object;

.field public static k0:Ljava/util/concurrent/ScheduledExecutorService;

.field public static l0:I


# instance fields
.field public A:Lx4/r;

.field public B:Lx4/r;

.field public C:Lm4/s0;

.field public D:Z

.field public E:Ljava/nio/ByteBuffer;

.field public F:I

.field public G:J

.field public H:J

.field public I:J

.field public J:J

.field public K:I

.field public L:Z

.field public M:Z

.field public N:J

.field public O:F

.field public P:Ljava/nio/ByteBuffer;

.field public Q:I

.field public R:Ljava/nio/ByteBuffer;

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:I

.field public Y:Lm4/e;

.field public Z:Lr/y1;

.field public final a:Landroid/content/Context;

.field public a0:Z

.field public final b:Ltc/b0;

.field public b0:J

.field public final c:Lx4/o;

.field public c0:J

.field public final d:Lx4/b0;

.field public d0:Z

.field public final e:Lya/a1;

.field public e0:Z

.field public final f:Lya/a1;

.field public f0:Landroid/os/Looper;

.field public final g:Lx4/n;

.field public g0:J

.field public final h:Ljava/util/ArrayDeque;

.field public h0:J

.field public final i:Z

.field public i0:Landroid/os/Handler;

.field public j:I

.field public k:Ltc/b0;

.field public final l:Lr/c2;

.field public final m:Lr/c2;

.field public final n:Lx4/w;

.field public final o:Lv2/e;

.field public final p:Lx4/w;

.field public q:Lw4/k;

.field public r:Lr/y1;

.field public s:Lx4/q;

.field public t:Lx4/q;

.field public u:Ln4/c;

.field public v:Landroid/media/AudioTrack;

.field public w:Lx4/b;

.field public x:Lx4/e;

.field public y:Ltc/b0;

.field public z:Lm4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx4/v;->j0:Ljava/lang/Object;

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
.end method

.method public constructor <init>(Lx4/p;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lx4/p;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object v0, p0, Lx4/v;->a:Landroid/content/Context;

    .line 7
    .line 8
    sget-object v1, Lm4/d;->g:Lm4/d;

    .line 9
    .line 10
    iput-object v1, p0, Lx4/v;->z:Lm4/d;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p1, Lx4/p;->b:Lx4/b;

    .line 17
    .line 18
    :goto_0
    iput-object v0, p0, Lx4/v;->w:Lx4/b;

    .line 19
    .line 20
    iget-object v0, p1, Lx4/p;->c:Ltc/b0;

    .line 21
    .line 22
    iput-object v0, p0, Lx4/v;->b:Ltc/b0;

    .line 23
    .line 24
    sget v0, Lp4/c0;->a:I

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lx4/v;->i:Z

    .line 28
    .line 29
    iput v0, p0, Lx4/v;->j:I

    .line 30
    .line 31
    iget-object v1, p1, Lx4/p;->e:Lx4/w;

    .line 32
    .line 33
    iput-object v1, p0, Lx4/v;->n:Lx4/w;

    .line 34
    .line 35
    iget-object v1, p1, Lx4/p;->g:Lv2/e;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lx4/v;->o:Lv2/e;

    .line 41
    .line 42
    new-instance v1, Lx4/n;

    .line 43
    .line 44
    new-instance v2, Lr/y1;

    .line 45
    .line 46
    const/16 v3, 0x1c

    .line 47
    .line 48
    invoke-direct {v2, v3, p0}, Lr/y1;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v2}, Lx4/n;-><init>(Lr/y1;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lx4/v;->g:Lx4/n;

    .line 55
    .line 56
    new-instance v1, Lx4/o;

    .line 57
    .line 58
    invoke-direct {v1}, Ln4/g;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Lx4/v;->c:Lx4/o;

    .line 62
    .line 63
    new-instance v2, Lx4/b0;

    .line 64
    .line 65
    invoke-direct {v2}, Ln4/g;-><init>()V

    .line 66
    .line 67
    .line 68
    sget-object v3, Lp4/c0;->f:[B

    .line 69
    .line 70
    iput-object v3, v2, Lx4/b0;->m:[B

    .line 71
    .line 72
    iput-object v2, p0, Lx4/v;->d:Lx4/b0;

    .line 73
    .line 74
    new-instance v3, Ln4/j;

    .line 75
    .line 76
    invoke-direct {v3}, Ln4/g;-><init>()V

    .line 77
    .line 78
    .line 79
    sget-object v4, Lya/i0;->b:Lya/g0;

    .line 80
    .line 81
    const/4 v4, 0x3

    .line 82
    new-array v5, v4, [Ljava/lang/Object;

    .line 83
    .line 84
    aput-object v3, v5, v0

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    aput-object v1, v5, v3

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    aput-object v2, v5, v1

    .line 91
    .line 92
    invoke-static {v4, v5}, Lya/q;->c(I[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v5}, Lya/i0;->o(I[Ljava/lang/Object;)Lya/a1;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, p0, Lx4/v;->e:Lya/a1;

    .line 100
    .line 101
    new-instance v1, Lx4/a0;

    .line 102
    .line 103
    invoke-direct {v1}, Ln4/g;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, p0, Lx4/v;->f:Lya/a1;

    .line 111
    .line 112
    const/high16 v1, 0x3f800000    # 1.0f

    .line 113
    .line 114
    iput v1, p0, Lx4/v;->O:F

    .line 115
    .line 116
    iput v0, p0, Lx4/v;->X:I

    .line 117
    .line 118
    new-instance v1, Lm4/e;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Lx4/v;->Y:Lm4/e;

    .line 124
    .line 125
    new-instance v2, Lx4/r;

    .line 126
    .line 127
    sget-object v3, Lm4/s0;->d:Lm4/s0;

    .line 128
    .line 129
    const-wide/16 v4, 0x0

    .line 130
    .line 131
    const-wide/16 v6, 0x0

    .line 132
    .line 133
    invoke-direct/range {v2 .. v7}, Lx4/r;-><init>(Lm4/s0;JJ)V

    .line 134
    .line 135
    .line 136
    iput-object v2, p0, Lx4/v;->B:Lx4/r;

    .line 137
    .line 138
    iput-object v3, p0, Lx4/v;->C:Lm4/s0;

    .line 139
    .line 140
    iput-boolean v0, p0, Lx4/v;->D:Z

    .line 141
    .line 142
    new-instance v0, Ljava/util/ArrayDeque;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, Lx4/v;->h:Ljava/util/ArrayDeque;

    .line 148
    .line 149
    new-instance v0, Lr/c2;

    .line 150
    .line 151
    invoke-direct {v0}, Lr/c2;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object v0, p0, Lx4/v;->l:Lr/c2;

    .line 155
    .line 156
    new-instance v0, Lr/c2;

    .line 157
    .line 158
    invoke-direct {v0}, Lr/c2;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object v0, p0, Lx4/v;->m:Lr/c2;

    .line 162
    .line 163
    iget-object p1, p1, Lx4/p;->f:Lx4/w;

    .line 164
    .line 165
    iput-object p1, p0, Lx4/v;->p:Lx4/w;

    .line 166
    .line 167
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public static p(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1
    sget v0, Lp4/c0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lu2/b;->s(Landroid/media/AudioTrack;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
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
.method public final a(J)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lx4/v;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lx4/v;->b:Ltc/b0;

    .line 7
    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    iget-boolean v0, p0, Lx4/v;->a0:Z

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 15
    .line 16
    iget v3, v0, Lx4/q;->c:I

    .line 17
    .line 18
    if-nez v3, :cond_3

    .line 19
    .line 20
    iget-object v0, v0, Lx4/q;->a:Lm4/q;

    .line 21
    .line 22
    iget v0, v0, Lm4/q;->F:I

    .line 23
    .line 24
    iget-object v0, p0, Lx4/v;->C:Lm4/s0;

    .line 25
    .line 26
    iget-object v3, v2, Ltc/b0;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Ln4/i;

    .line 29
    .line 30
    iget v4, v0, Lm4/s0;->a:F

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    cmpl-float v7, v4, v6

    .line 38
    .line 39
    if-lez v7, :cond_0

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v7, 0x0

    .line 44
    :goto_0
    invoke-static {v7}, Lp4/c;->c(Z)V

    .line 45
    .line 46
    .line 47
    iget v7, v3, Ln4/i;->c:F

    .line 48
    .line 49
    cmpl-float v7, v7, v4

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    iput v4, v3, Ln4/i;->c:F

    .line 54
    .line 55
    iput-boolean v5, v3, Ln4/i;->i:Z

    .line 56
    .line 57
    :cond_1
    iget v4, v0, Lm4/s0;->b:F

    .line 58
    .line 59
    cmpl-float v6, v4, v6

    .line 60
    .line 61
    if-lez v6, :cond_2

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v6, 0x0

    .line 66
    :goto_1
    invoke-static {v6}, Lp4/c;->c(Z)V

    .line 67
    .line 68
    .line 69
    iget v6, v3, Ln4/i;->d:F

    .line 70
    .line 71
    cmpl-float v6, v6, v4

    .line 72
    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    iput v4, v3, Ln4/i;->d:F

    .line 76
    .line 77
    iput-boolean v5, v3, Ln4/i;->i:Z

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    sget-object v0, Lm4/s0;->d:Lm4/s0;

    .line 81
    .line 82
    :cond_4
    :goto_2
    iput-object v0, p0, Lx4/v;->C:Lm4/s0;

    .line 83
    .line 84
    :goto_3
    move-object v4, v0

    .line 85
    goto :goto_4

    .line 86
    :cond_5
    sget-object v0, Lm4/s0;->d:Lm4/s0;

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :goto_4
    iget-boolean v0, p0, Lx4/v;->a0:Z

    .line 90
    .line 91
    if-nez v0, :cond_6

    .line 92
    .line 93
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 94
    .line 95
    iget v3, v0, Lx4/q;->c:I

    .line 96
    .line 97
    if-nez v3, :cond_6

    .line 98
    .line 99
    iget-object v0, v0, Lx4/q;->a:Lm4/q;

    .line 100
    .line 101
    iget v0, v0, Lm4/q;->F:I

    .line 102
    .line 103
    iget-boolean v1, p0, Lx4/v;->D:Z

    .line 104
    .line 105
    iget-object v0, v2, Ltc/b0;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lx4/z;

    .line 108
    .line 109
    iput-boolean v1, v0, Lx4/z;->o:Z

    .line 110
    .line 111
    :cond_6
    iput-boolean v1, p0, Lx4/v;->D:Z

    .line 112
    .line 113
    new-instance v3, Lx4/r;

    .line 114
    .line 115
    const-wide/16 v0, 0x0

    .line 116
    .line 117
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    iget-object p1, p0, Lx4/v;->t:Lx4/q;

    .line 122
    .line 123
    invoke-virtual {p0}, Lx4/v;->k()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    iget p1, p1, Lx4/q;->e:I

    .line 128
    .line 129
    invoke-static {p1, v0, v1}, Lp4/c0;->T(IJ)J

    .line 130
    .line 131
    .line 132
    move-result-wide v7

    .line 133
    invoke-direct/range {v3 .. v8}, Lx4/r;-><init>(Lm4/s0;JJ)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lx4/v;->h:Ljava/util/ArrayDeque;

    .line 137
    .line 138
    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lx4/v;->t:Lx4/q;

    .line 142
    .line 143
    iget-object p1, p1, Lx4/q;->i:Ln4/c;

    .line 144
    .line 145
    iput-object p1, p0, Lx4/v;->u:Ln4/c;

    .line 146
    .line 147
    invoke-virtual {p1}, Ln4/c;->a()V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lx4/v;->r:Lr/y1;

    .line 151
    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    iget-boolean p2, p0, Lx4/v;->D:Z

    .line 155
    .line 156
    iget-object p1, p1, Lr/y1;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p1, Lx4/x;

    .line 159
    .line 160
    iget-object p1, p1, Lx4/x;->T0:Lp5/y;

    .line 161
    .line 162
    iget-object v0, p1, Lp5/y;->b:Landroid/os/Handler;

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    new-instance v1, Lx4/h;

    .line 167
    .line 168
    invoke-direct {v1, p1, p2}, Lx4/h;-><init>(Lp5/y;Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 172
    .line 173
    .line 174
    :cond_7
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final b(Lr5/c;Lm4/d;ILm4/q;)Landroid/media/AudioTrack;
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Lx4/v;->p:Lx4/w;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lx4/w;->a(Lr5/c;Lm4/d;I)Landroid/media/AudioTrack;

    .line 4
    .line 5
    .line 6
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 p3, 0x1

    .line 12
    if-ne v1, p3, :cond_0

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    new-instance v0, Lx4/j;

    .line 19
    .line 20
    iget v2, p1, Lr5/c;->b:I

    .line 21
    .line 22
    iget v3, p1, Lr5/c;->c:I

    .line 23
    .line 24
    iget v4, p1, Lr5/c;->a:I

    .line 25
    .line 26
    iget-boolean v6, p1, Lr5/c;->e:Z

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v5, p4

    .line 30
    invoke-direct/range {v0 .. v7}, Lx4/j;-><init>(IIIILm4/q;ZLjava/lang/RuntimeException;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catch_1
    move-exception v0

    .line 35
    :goto_0
    move-object v5, p4

    .line 36
    move-object p2, v0

    .line 37
    move-object v8, p2

    .line 38
    goto :goto_1

    .line 39
    :catch_2
    move-exception v0

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    new-instance v1, Lx4/j;

    .line 42
    .line 43
    iget v3, p1, Lr5/c;->b:I

    .line 44
    .line 45
    iget v4, p1, Lr5/c;->c:I

    .line 46
    .line 47
    move-object v6, v5

    .line 48
    iget v5, p1, Lr5/c;->a:I

    .line 49
    .line 50
    iget-boolean v7, p1, Lr5/c;->e:Z

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct/range {v1 .. v8}, Lx4/j;-><init>(IIIILm4/q;ZLjava/lang/RuntimeException;)V

    .line 54
    .line 55
    .line 56
    throw v1
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
.end method

.method public final c(Lx4/q;)Landroid/media/AudioTrack;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lx4/q;->a()Lr5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lx4/v;->z:Lm4/d;

    .line 6
    .line 7
    iget v2, p0, Lx4/v;->X:I

    .line 8
    .line 9
    iget-object p1, p1, Lx4/q;->a:Lm4/q;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, v2, p1}, Lx4/v;->b(Lr5/c;Lm4/d;ILm4/q;)Landroid/media/AudioTrack;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Lx4/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    iget-object v0, p0, Lx4/v;->r:Lr/y1;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lr/y1;->b0(Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    throw p1
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

.method public final d(Lm4/q;[I)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lx4/v;->q()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v3, Lm4/q;->n:Ljava/lang/String;

    .line 9
    .line 10
    iget v2, v3, Lm4/q;->E:I

    .line 11
    .line 12
    iget v4, v3, Lm4/q;->D:I

    .line 13
    .line 14
    iget v5, v3, Lm4/q;->F:I

    .line 15
    .line 16
    const-string v6, "audio/raw"

    .line 17
    .line 18
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-boolean v8, v1, Lx4/v;->i:Z

    .line 23
    .line 24
    const/4 v9, 0x1

    .line 25
    const/4 v10, -0x1

    .line 26
    const/4 v11, 0x0

    .line 27
    if-eqz v6, :cond_4

    .line 28
    .line 29
    invoke-static {v5}, Lp4/c0;->I(I)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-static {v6}, Lp4/c;->c(Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {v5, v4}, Lp4/c0;->B(II)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    new-instance v12, Lya/f0;

    .line 41
    .line 42
    const/4 v13, 0x4

    .line 43
    invoke-direct {v12, v13}, Lya/c0;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iget-object v13, v1, Lx4/v;->e:Lya/a1;

    .line 47
    .line 48
    invoke-virtual {v12, v13}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 49
    .line 50
    .line 51
    iget-object v13, v1, Lx4/v;->b:Ltc/b0;

    .line 52
    .line 53
    iget-object v13, v13, Ltc/b0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v13, [Ln4/f;

    .line 56
    .line 57
    array-length v14, v13

    .line 58
    invoke-static {v14, v13}, Lya/q;->c(I[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v12, v14}, Lya/c0;->d(I)V

    .line 62
    .line 63
    .line 64
    iget-object v15, v12, Lya/c0;->a:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v7, v12, Lya/c0;->b:I

    .line 67
    .line 68
    invoke-static {v13, v11, v15, v7, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 69
    .line 70
    .line 71
    iget v7, v12, Lya/c0;->b:I

    .line 72
    .line 73
    add-int/2addr v7, v14

    .line 74
    iput v7, v12, Lya/c0;->b:I

    .line 75
    .line 76
    new-instance v7, Ln4/c;

    .line 77
    .line 78
    invoke-virtual {v12}, Lya/f0;->f()Lya/a1;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    invoke-direct {v7, v12}, Ln4/c;-><init>(Lya/i0;)V

    .line 83
    .line 84
    .line 85
    iget-object v12, v1, Lx4/v;->u:Ln4/c;

    .line 86
    .line 87
    invoke-virtual {v7, v12}, Ln4/c;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    if-eqz v12, :cond_0

    .line 92
    .line 93
    iget-object v7, v1, Lx4/v;->u:Ln4/c;

    .line 94
    .line 95
    :cond_0
    iget v12, v3, Lm4/q;->G:I

    .line 96
    .line 97
    iget v13, v3, Lm4/q;->H:I

    .line 98
    .line 99
    iget-object v14, v1, Lx4/v;->d:Lx4/b0;

    .line 100
    .line 101
    iput v12, v14, Lx4/b0;->i:I

    .line 102
    .line 103
    iput v13, v14, Lx4/b0;->j:I

    .line 104
    .line 105
    iget-object v12, v1, Lx4/v;->c:Lx4/o;

    .line 106
    .line 107
    move-object/from16 v13, p2

    .line 108
    .line 109
    iput-object v13, v12, Lx4/o;->i:[I

    .line 110
    .line 111
    new-instance v12, Ln4/d;

    .line 112
    .line 113
    invoke-direct {v12, v2, v4, v5}, Ln4/d;-><init>(III)V

    .line 114
    .line 115
    .line 116
    :try_start_0
    iget-object v2, v7, Ln4/c;->a:Lya/i0;

    .line 117
    .line 118
    sget-object v4, Ln4/d;->e:Ln4/d;

    .line 119
    .line 120
    invoke-virtual {v12, v4}, Ln4/d;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-nez v4, :cond_3

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-ge v4, v5, :cond_2

    .line 132
    .line 133
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Ln4/f;

    .line 138
    .line 139
    invoke-interface {v5, v12}, Ln4/f;->d(Ln4/d;)Ln4/d;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    invoke-interface {v5}, Ln4/f;->b()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_1

    .line 148
    .line 149
    sget-object v5, Ln4/d;->e:Ln4/d;

    .line 150
    .line 151
    invoke-virtual {v13, v5}, Ln4/d;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    xor-int/lit8 v5, v5, 0x1

    .line 156
    .line 157
    invoke-static {v5}, Lp4/c;->i(Z)V
    :try_end_0
    .catch Ln4/e; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    move-object v12, v13

    .line 161
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_2
    iget v2, v12, Ln4/d;->b:I

    .line 165
    .line 166
    iget v4, v12, Ln4/d;->c:I

    .line 167
    .line 168
    iget v5, v12, Ln4/d;->a:I

    .line 169
    .line 170
    invoke-static {v2}, Lp4/c0;->s(I)I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    invoke-static {v4, v2}, Lp4/c0;->B(II)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    move v13, v6

    .line 179
    move v6, v2

    .line 180
    move v2, v13

    .line 181
    move-object v13, v7

    .line 182
    move v7, v5

    .line 183
    move-object v5, v13

    .line 184
    move v13, v12

    .line 185
    move v12, v8

    .line 186
    move v8, v13

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    goto/16 :goto_3

    .line 190
    .line 191
    :cond_3
    :try_start_1
    new-instance v0, Ln4/e;

    .line 192
    .line 193
    invoke-direct {v0, v12}, Ln4/e;-><init>(Ln4/d;)V

    .line 194
    .line 195
    .line 196
    throw v0
    :try_end_1
    .catch Ln4/e; {:try_start_1 .. :try_end_1} :catch_0

    .line 197
    :catch_0
    move-exception v0

    .line 198
    new-instance v2, Lx4/i;

    .line 199
    .line 200
    invoke-direct {v2, v0, v3}, Lx4/i;-><init>(Ln4/e;Lm4/q;)V

    .line 201
    .line 202
    .line 203
    throw v2

    .line 204
    :cond_4
    new-instance v7, Ln4/c;

    .line 205
    .line 206
    sget-object v5, Lya/a1;->e:Lya/a1;

    .line 207
    .line 208
    invoke-direct {v7, v5}, Ln4/c;-><init>(Lya/i0;)V

    .line 209
    .line 210
    .line 211
    iget v5, v1, Lx4/v;->j:I

    .line 212
    .line 213
    if-eqz v5, :cond_5

    .line 214
    .line 215
    invoke-virtual/range {p0 .. p1}, Lx4/v;->h(Lm4/q;)Lx4/f;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    goto :goto_1

    .line 220
    :cond_5
    sget-object v5, Lx4/f;->d:Lx4/f;

    .line 221
    .line 222
    :goto_1
    iget v6, v1, Lx4/v;->j:I

    .line 223
    .line 224
    if-eqz v6, :cond_6

    .line 225
    .line 226
    iget-boolean v6, v5, Lx4/f;->a:Z

    .line 227
    .line 228
    if-eqz v6, :cond_6

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget-object v6, v3, Lm4/q;->k:Ljava/lang/String;

    .line 234
    .line 235
    invoke-static {v0, v6}, Lm4/o0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    invoke-static {v4}, Lp4/c0;->s(I)I

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    iget-boolean v4, v5, Lx4/f;->b:Z

    .line 244
    .line 245
    move v13, v4

    .line 246
    move v4, v6

    .line 247
    move-object v5, v7

    .line 248
    move v8, v12

    .line 249
    const/4 v6, -0x1

    .line 250
    const/4 v12, 0x1

    .line 251
    const/4 v14, 0x1

    .line 252
    :goto_2
    move v7, v2

    .line 253
    const/4 v2, -0x1

    .line 254
    goto :goto_3

    .line 255
    :cond_6
    iget-object v4, v1, Lx4/v;->w:Lx4/b;

    .line 256
    .line 257
    iget-object v5, v1, Lx4/v;->z:Lm4/d;

    .line 258
    .line 259
    invoke-virtual {v4, v5, v3}, Lx4/b;->d(Lm4/d;Lm4/q;)Landroid/util/Pair;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    if-eqz v4, :cond_18

    .line 264
    .line 265
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v5, Ljava/lang/Integer;

    .line 268
    .line 269
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v4, Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    move v4, v12

    .line 282
    move v12, v8

    .line 283
    move v8, v4

    .line 284
    move v4, v5

    .line 285
    move-object v5, v7

    .line 286
    const/4 v6, -0x1

    .line 287
    const/4 v13, 0x0

    .line 288
    const/4 v14, 0x2

    .line 289
    goto :goto_2

    .line 290
    :goto_3
    const-string v15, ") for: "

    .line 291
    .line 292
    if-eqz v4, :cond_17

    .line 293
    .line 294
    if-eqz v8, :cond_16

    .line 295
    .line 296
    iget v15, v3, Lm4/q;->j:I

    .line 297
    .line 298
    const-string v11, "audio/vnd.dts.hd;profile=lbr"

    .line 299
    .line 300
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_7

    .line 305
    .line 306
    if-ne v15, v10, :cond_7

    .line 307
    .line 308
    const v15, 0xbb800

    .line 309
    .line 310
    .line 311
    :cond_7
    invoke-static {v7, v8, v4}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    const/4 v11, -0x2

    .line 316
    if-eq v0, v11, :cond_8

    .line 317
    .line 318
    const/4 v11, 0x1

    .line 319
    goto :goto_4

    .line 320
    :cond_8
    const/4 v11, 0x0

    .line 321
    :goto_4
    invoke-static {v11}, Lp4/c;->i(Z)V

    .line 322
    .line 323
    .line 324
    if-eq v6, v10, :cond_9

    .line 325
    .line 326
    move v11, v6

    .line 327
    goto :goto_5

    .line 328
    :cond_9
    const/4 v11, 0x1

    .line 329
    :goto_5
    if-eqz v12, :cond_a

    .line 330
    .line 331
    const-wide/high16 v17, 0x4020000000000000L    # 8.0

    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_a
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 335
    .line 336
    :goto_6
    iget-object v10, v1, Lx4/v;->n:Lx4/w;

    .line 337
    .line 338
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const-wide/32 v20, 0xf4240

    .line 342
    .line 343
    .line 344
    if-eqz v14, :cond_14

    .line 345
    .line 346
    if-eq v14, v9, :cond_13

    .line 347
    .line 348
    const/4 v9, 0x2

    .line 349
    const/16 v22, 0x1

    .line 350
    .line 351
    if-ne v14, v9, :cond_12

    .line 352
    .line 353
    const/4 v9, 0x5

    .line 354
    const/16 v10, 0x8

    .line 355
    .line 356
    if-ne v4, v9, :cond_b

    .line 357
    .line 358
    const v9, 0x7a120

    .line 359
    .line 360
    .line 361
    :goto_7
    const/4 v10, -0x1

    .line 362
    const/16 v16, 0x8

    .line 363
    .line 364
    goto :goto_8

    .line 365
    :cond_b
    if-ne v4, v10, :cond_c

    .line 366
    .line 367
    const v9, 0xf4240

    .line 368
    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_c
    const v9, 0x3d090

    .line 372
    .line 373
    .line 374
    goto :goto_7

    .line 375
    :goto_8
    if-eq v15, v10, :cond_11

    .line 376
    .line 377
    sget-object v10, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 378
    .line 379
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    div-int/lit8 v19, v15, 0x8

    .line 383
    .line 384
    mul-int v23, v16, v19

    .line 385
    .line 386
    sub-int v23, v15, v23

    .line 387
    .line 388
    if-nez v23, :cond_d

    .line 389
    .line 390
    goto :goto_a

    .line 391
    :cond_d
    xor-int/lit8 v15, v15, 0x8

    .line 392
    .line 393
    shr-int/lit8 v15, v15, 0x1f

    .line 394
    .line 395
    or-int/lit8 v15, v15, 0x1

    .line 396
    .line 397
    sget-object v24, Lab/d;->a:[I

    .line 398
    .line 399
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    aget v10, v24, v10

    .line 404
    .line 405
    packed-switch v10, :pswitch_data_0

    .line 406
    .line 407
    .line 408
    new-instance v0, Ljava/lang/AssertionError;

    .line 409
    .line 410
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 411
    .line 412
    .line 413
    throw v0

    .line 414
    :pswitch_0
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(I)I

    .line 415
    .line 416
    .line 417
    move-result v10

    .line 418
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(I)I

    .line 419
    .line 420
    .line 421
    move-result v16

    .line 422
    sub-int v16, v16, v10

    .line 423
    .line 424
    sub-int v10, v10, v16

    .line 425
    .line 426
    if-nez v10, :cond_e

    .line 427
    .line 428
    sget-object v10, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 429
    .line 430
    sget-object v10, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_e
    if-lez v10, :cond_f

    .line 434
    .line 435
    goto :goto_9

    .line 436
    :pswitch_1
    if-lez v15, :cond_f

    .line 437
    .line 438
    goto :goto_9

    .line 439
    :pswitch_2
    if-gez v15, :cond_f

    .line 440
    .line 441
    :goto_9
    :pswitch_3
    add-int v19, v19, v15

    .line 442
    .line 443
    goto :goto_a

    .line 444
    :pswitch_4
    if-nez v23, :cond_10

    .line 445
    .line 446
    :cond_f
    :goto_a
    :pswitch_5
    move/from16 v16, v2

    .line 447
    .line 448
    move/from16 v10, v19

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_10
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 452
    .line 453
    const-string v2, "mode was UNNECESSARY, but rounding was necessary"

    .line 454
    .line 455
    invoke-direct {v0, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw v0

    .line 459
    :cond_11
    invoke-static {v4}, Lx4/w;->c(I)I

    .line 460
    .line 461
    .line 462
    move-result v19

    .line 463
    goto :goto_a

    .line 464
    :goto_b
    int-to-long v2, v9

    .line 465
    int-to-long v9, v10

    .line 466
    mul-long v2, v2, v9

    .line 467
    .line 468
    div-long v2, v2, v20

    .line 469
    .line 470
    invoke-static {v2, v3}, Lg8/a;->q(J)I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    :goto_c
    move/from16 p2, v4

    .line 475
    .line 476
    goto :goto_d

    .line 477
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 478
    .line 479
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 480
    .line 481
    .line 482
    throw v0

    .line 483
    :cond_13
    move/from16 v16, v2

    .line 484
    .line 485
    const/16 v22, 0x1

    .line 486
    .line 487
    invoke-static {v4}, Lx4/w;->c(I)I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    const v3, 0x2faf080

    .line 492
    .line 493
    .line 494
    int-to-long v9, v3

    .line 495
    int-to-long v2, v2

    .line 496
    mul-long v9, v9, v2

    .line 497
    .line 498
    div-long v9, v9, v20

    .line 499
    .line 500
    invoke-static {v9, v10}, Lg8/a;->q(J)I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    goto :goto_c

    .line 505
    :cond_14
    move/from16 v16, v2

    .line 506
    .line 507
    const/16 v22, 0x1

    .line 508
    .line 509
    mul-int/lit8 v2, v0, 0x4

    .line 510
    .line 511
    const v3, 0x3d090

    .line 512
    .line 513
    .line 514
    int-to-long v9, v3

    .line 515
    move/from16 p2, v4

    .line 516
    .line 517
    int-to-long v3, v7

    .line 518
    mul-long v9, v9, v3

    .line 519
    .line 520
    move-wide/from16 v23, v3

    .line 521
    .line 522
    int-to-long v3, v11

    .line 523
    mul-long v9, v9, v3

    .line 524
    .line 525
    div-long v9, v9, v20

    .line 526
    .line 527
    invoke-static {v9, v10}, Lg8/a;->q(J)I

    .line 528
    .line 529
    .line 530
    move-result v9

    .line 531
    const v10, 0xb71b0

    .line 532
    .line 533
    .line 534
    move-wide/from16 v25, v3

    .line 535
    .line 536
    int-to-long v3, v10

    .line 537
    mul-long v3, v3, v23

    .line 538
    .line 539
    mul-long v3, v3, v25

    .line 540
    .line 541
    div-long v3, v3, v20

    .line 542
    .line 543
    invoke-static {v3, v4}, Lg8/a;->q(J)I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    invoke-static {v2, v9, v3}, Lp4/c0;->i(III)I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    :goto_d
    int-to-double v2, v2

    .line 552
    mul-double v2, v2, v17

    .line 553
    .line 554
    double-to-int v2, v2

    .line 555
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    add-int/2addr v0, v11

    .line 560
    add-int/lit8 v0, v0, -0x1

    .line 561
    .line 562
    div-int/2addr v0, v11

    .line 563
    mul-int v10, v0, v11

    .line 564
    .line 565
    const/4 v0, 0x0

    .line 566
    iput-boolean v0, v1, Lx4/v;->d0:Z

    .line 567
    .line 568
    new-instance v2, Lx4/q;

    .line 569
    .line 570
    move-object v11, v5

    .line 571
    move v5, v14

    .line 572
    iget-boolean v14, v1, Lx4/v;->a0:Z

    .line 573
    .line 574
    move-object/from16 v3, p1

    .line 575
    .line 576
    move/from16 v9, p2

    .line 577
    .line 578
    move/from16 v4, v16

    .line 579
    .line 580
    invoke-direct/range {v2 .. v14}, Lx4/q;-><init>(Lm4/q;IIIIIIILn4/c;ZZZ)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, Lx4/v;->o()Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-eqz v0, :cond_15

    .line 588
    .line 589
    iput-object v2, v1, Lx4/v;->s:Lx4/q;

    .line 590
    .line 591
    return-void

    .line 592
    :cond_15
    iput-object v2, v1, Lx4/v;->t:Lx4/q;

    .line 593
    .line 594
    return-void

    .line 595
    :cond_16
    move v5, v14

    .line 596
    new-instance v0, Lx4/i;

    .line 597
    .line 598
    new-instance v2, Ljava/lang/StringBuilder;

    .line 599
    .line 600
    const-string v4, "Invalid output channel config (mode="

    .line 601
    .line 602
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-direct {v0, v2, v3}, Lx4/i;-><init>(Ljava/lang/String;Lm4/q;)V

    .line 619
    .line 620
    .line 621
    throw v0

    .line 622
    :cond_17
    move v5, v14

    .line 623
    new-instance v0, Lx4/i;

    .line 624
    .line 625
    new-instance v2, Ljava/lang/StringBuilder;

    .line 626
    .line 627
    const-string v4, "Invalid output encoding (mode="

    .line 628
    .line 629
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    invoke-direct {v0, v2, v3}, Lx4/i;-><init>(Ljava/lang/String;Lm4/q;)V

    .line 646
    .line 647
    .line 648
    throw v0

    .line 649
    :cond_18
    new-instance v0, Lx4/i;

    .line 650
    .line 651
    new-instance v2, Ljava/lang/StringBuilder;

    .line 652
    .line 653
    const-string v4, "Unable to configure passthrough for: "

    .line 654
    .line 655
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    invoke-direct {v0, v2, v3}, Lx4/i;-><init>(Ljava/lang/String;Lm4/q;)V

    .line 666
    .line 667
    .line 668
    throw v0

    .line 669
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public final e(J)V
    .locals 12

    .line 1
    iget-object v0, p0, Lx4/v;->m:Lr/c2;

    .line 2
    .line 3
    iget-object v1, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_7

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Lr/c2;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Exception;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    sget-object v1, Lx4/v;->j0:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    sget v4, Lx4/v;->l0:I

    .line 22
    .line 23
    if-lez v4, :cond_2

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    const/4 v4, 0x0

    .line 28
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    iget-wide v6, v0, Lr/c2;->b:J

    .line 38
    .line 39
    cmp-long v1, v4, v6

    .line 40
    .line 41
    if-gez v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_4
    :goto_1
    iget-object v1, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-boolean v4, p0, Lx4/v;->a0:Z

    .line 52
    .line 53
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    if-eqz v4, :cond_d

    .line 59
    .line 60
    cmp-long v4, p1, v5

    .line 61
    .line 62
    if-eqz v4, :cond_5

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    goto :goto_2

    .line 66
    :cond_5
    const/4 v4, 0x0

    .line 67
    :goto_2
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 68
    .line 69
    .line 70
    const-wide/high16 v7, -0x8000000000000000L

    .line 71
    .line 72
    cmp-long v4, p1, v7

    .line 73
    .line 74
    if-nez v4, :cond_6

    .line 75
    .line 76
    iget-wide p1, p0, Lx4/v;->b0:J

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    iput-wide p1, p0, Lx4/v;->b0:J

    .line 80
    .line 81
    :goto_3
    iget-object v4, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 82
    .line 83
    iget-object v7, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    sget v8, Lp4/c0;->a:I

    .line 86
    .line 87
    const/16 v9, 0x1a

    .line 88
    .line 89
    const-wide/16 v10, 0x3e8

    .line 90
    .line 91
    if-lt v8, v9, :cond_7

    .line 92
    .line 93
    mul-long p1, p1, v10

    .line 94
    .line 95
    invoke-static {v4, v7, v1, p1, p2}, Lv3/b;->c(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto :goto_4

    .line 100
    :cond_7
    iget-object v8, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    if-nez v8, :cond_8

    .line 103
    .line 104
    const/16 v8, 0x10

    .line 105
    .line 106
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iput-object v8, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 113
    .line 114
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    .line 117
    iget-object v8, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    const v9, 0x55550001

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    :cond_8
    iget v8, p0, Lx4/v;->F:I

    .line 126
    .line 127
    if-nez v8, :cond_9

    .line 128
    .line 129
    iget-object v8, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    const/4 v9, 0x4

    .line 132
    invoke-virtual {v8, v9, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    .line 135
    iget-object v8, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    const/16 v9, 0x8

    .line 138
    .line 139
    mul-long p1, p1, v10

    .line 140
    .line 141
    invoke-virtual {v8, v9, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 147
    .line 148
    .line 149
    iput v1, p0, Lx4/v;->F:I

    .line 150
    .line 151
    :cond_9
    iget-object p1, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-lez p1, :cond_b

    .line 158
    .line 159
    iget-object p2, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    invoke-virtual {v4, p2, p1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-gez p2, :cond_a

    .line 166
    .line 167
    iput v2, p0, Lx4/v;->F:I

    .line 168
    .line 169
    move p1, p2

    .line 170
    goto :goto_4

    .line 171
    :cond_a
    if-ge p2, p1, :cond_b

    .line 172
    .line 173
    const/4 p1, 0x0

    .line 174
    goto :goto_4

    .line 175
    :cond_b
    invoke-virtual {v4, v7, v1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-gez p1, :cond_c

    .line 180
    .line 181
    iput v2, p0, Lx4/v;->F:I

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_c
    iget p2, p0, Lx4/v;->F:I

    .line 185
    .line 186
    sub-int/2addr p2, p1

    .line 187
    iput p2, p0, Lx4/v;->F:I

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_d
    iget-object p1, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 191
    .line 192
    iget-object p2, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    invoke-virtual {p1, p2, v1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    iput-wide v7, p0, Lx4/v;->c0:J

    .line 203
    .line 204
    const-wide/16 v7, 0x0

    .line 205
    .line 206
    if-gez p1, :cond_15

    .line 207
    .line 208
    sget p2, Lp4/c0;->a:I

    .line 209
    .line 210
    const/16 v1, 0x18

    .line 211
    .line 212
    if-lt p2, v1, :cond_e

    .line 213
    .line 214
    const/4 p2, -0x6

    .line 215
    if-eq p1, p2, :cond_f

    .line 216
    .line 217
    :cond_e
    const/16 p2, -0x20

    .line 218
    .line 219
    if-ne p1, p2, :cond_12

    .line 220
    .line 221
    :cond_f
    invoke-virtual {p0}, Lx4/v;->k()J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    cmp-long p2, v4, v7

    .line 226
    .line 227
    if-lez p2, :cond_11

    .line 228
    .line 229
    :cond_10
    :goto_5
    const/4 v2, 0x1

    .line 230
    goto :goto_6

    .line 231
    :cond_11
    iget-object p2, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 232
    .line 233
    invoke-static {p2}, Lx4/v;->p(Landroid/media/AudioTrack;)Z

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    if-eqz p2, :cond_12

    .line 238
    .line 239
    iget-object p2, p0, Lx4/v;->t:Lx4/q;

    .line 240
    .line 241
    iget p2, p2, Lx4/q;->c:I

    .line 242
    .line 243
    if-ne p2, v3, :cond_10

    .line 244
    .line 245
    iput-boolean v3, p0, Lx4/v;->d0:Z

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_12
    :goto_6
    new-instance p2, Lx4/k;

    .line 249
    .line 250
    iget-object v1, p0, Lx4/v;->t:Lx4/q;

    .line 251
    .line 252
    iget-object v1, v1, Lx4/q;->a:Lm4/q;

    .line 253
    .line 254
    invoke-direct {p2, p1, v1, v2}, Lx4/k;-><init>(ILm4/q;Z)V

    .line 255
    .line 256
    .line 257
    iget-object p1, p0, Lx4/v;->r:Lr/y1;

    .line 258
    .line 259
    if-eqz p1, :cond_13

    .line 260
    .line 261
    invoke-virtual {p1, p2}, Lr/y1;->b0(Ljava/lang/Exception;)V

    .line 262
    .line 263
    .line 264
    :cond_13
    iget-boolean p1, p2, Lx4/k;->b:Z

    .line 265
    .line 266
    if-nez p1, :cond_14

    .line 267
    .line 268
    invoke-virtual {v0, p2}, Lr/c2;->d(Ljava/lang/Exception;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_14
    sget-object p1, Lx4/b;->c:Lx4/b;

    .line 273
    .line 274
    iput-object p1, p0, Lx4/v;->w:Lx4/b;

    .line 275
    .line 276
    throw p2

    .line 277
    :cond_15
    const/4 p2, 0x0

    .line 278
    iput-object p2, v0, Lr/c2;->c:Ljava/lang/Object;

    .line 279
    .line 280
    iput-wide v5, v0, Lr/c2;->a:J

    .line 281
    .line 282
    iput-wide v5, v0, Lr/c2;->b:J

    .line 283
    .line 284
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 285
    .line 286
    invoke-static {v0}, Lx4/v;->p(Landroid/media/AudioTrack;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_17

    .line 291
    .line 292
    iget-wide v4, p0, Lx4/v;->J:J

    .line 293
    .line 294
    cmp-long v0, v4, v7

    .line 295
    .line 296
    if-lez v0, :cond_16

    .line 297
    .line 298
    iput-boolean v2, p0, Lx4/v;->e0:Z

    .line 299
    .line 300
    :cond_16
    iget-boolean v0, p0, Lx4/v;->V:Z

    .line 301
    .line 302
    if-eqz v0, :cond_17

    .line 303
    .line 304
    iget-object v0, p0, Lx4/v;->r:Lr/y1;

    .line 305
    .line 306
    if-eqz v0, :cond_17

    .line 307
    .line 308
    if-ge p1, v1, :cond_17

    .line 309
    .line 310
    iget-boolean v4, p0, Lx4/v;->e0:Z

    .line 311
    .line 312
    if-nez v4, :cond_17

    .line 313
    .line 314
    iget-object v0, v0, Lr/y1;->b:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Lx4/x;

    .line 317
    .line 318
    iget-object v0, v0, Lg5/q;->F:Lv4/w;

    .line 319
    .line 320
    if-eqz v0, :cond_17

    .line 321
    .line 322
    iget-object v0, v0, Lv4/w;->a:Lv4/c0;

    .line 323
    .line 324
    iput-boolean v3, v0, Lv4/c0;->K:Z

    .line 325
    .line 326
    :cond_17
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 327
    .line 328
    iget v0, v0, Lx4/q;->c:I

    .line 329
    .line 330
    if-nez v0, :cond_18

    .line 331
    .line 332
    iget-wide v4, p0, Lx4/v;->I:J

    .line 333
    .line 334
    int-to-long v6, p1

    .line 335
    add-long/2addr v4, v6

    .line 336
    iput-wide v4, p0, Lx4/v;->I:J

    .line 337
    .line 338
    :cond_18
    if-ne p1, v1, :cond_1b

    .line 339
    .line 340
    if-eqz v0, :cond_1a

    .line 341
    .line 342
    iget-object p1, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 343
    .line 344
    iget-object v0, p0, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 345
    .line 346
    if-ne p1, v0, :cond_19

    .line 347
    .line 348
    const/4 v2, 0x1

    .line 349
    :cond_19
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 350
    .line 351
    .line 352
    iget-wide v0, p0, Lx4/v;->J:J

    .line 353
    .line 354
    iget p1, p0, Lx4/v;->K:I

    .line 355
    .line 356
    int-to-long v2, p1

    .line 357
    iget p1, p0, Lx4/v;->Q:I

    .line 358
    .line 359
    int-to-long v4, p1

    .line 360
    mul-long v2, v2, v4

    .line 361
    .line 362
    add-long/2addr v2, v0

    .line 363
    iput-wide v2, p0, Lx4/v;->J:J

    .line 364
    .line 365
    :cond_1a
    iput-object p2, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 366
    .line 367
    :cond_1b
    :goto_7
    return-void

    .line 368
    :catchall_0
    move-exception p1

    .line 369
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 370
    throw p1
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final f()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln4/c;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1, v2}, Lx4/v;->e(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 22
    .line 23
    invoke-virtual {v0}, Ln4/c;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-boolean v5, v0, Ln4/c;->d:Z

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iput-boolean v4, v0, Ln4/c;->d:Z

    .line 35
    .line 36
    iget-object v0, v0, Ln4/c;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ln4/f;

    .line 43
    .line 44
    invoke-interface {v0}, Ln4/f;->e()V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-virtual {p0, v1, v2}, Lx4/v;->t(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 51
    .line 52
    invoke-virtual {v0}, Ln4/c;->c()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object v0, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    :cond_3
    :goto_1
    return v4

    .line 69
    :cond_4
    return v3
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

.method public final g()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lx4/v;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    iput-wide v1, p0, Lx4/v;->G:J

    .line 11
    .line 12
    iput-wide v1, p0, Lx4/v;->H:J

    .line 13
    .line 14
    iput-wide v1, p0, Lx4/v;->I:J

    .line 15
    .line 16
    iput-wide v1, p0, Lx4/v;->J:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lx4/v;->e0:Z

    .line 20
    .line 21
    iput v0, p0, Lx4/v;->K:I

    .line 22
    .line 23
    new-instance v4, Lx4/r;

    .line 24
    .line 25
    iget-object v5, p0, Lx4/v;->C:Lm4/s0;

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    invoke-direct/range {v4 .. v9}, Lx4/r;-><init>(Lm4/s0;JJ)V

    .line 32
    .line 33
    .line 34
    iput-object v4, p0, Lx4/v;->B:Lx4/r;

    .line 35
    .line 36
    iput-wide v1, p0, Lx4/v;->N:J

    .line 37
    .line 38
    iput-object v3, p0, Lx4/v;->A:Lx4/r;

    .line 39
    .line 40
    iget-object v4, p0, Lx4/v;->h:Ljava/util/ArrayDeque;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    iput v0, p0, Lx4/v;->Q:I

    .line 48
    .line 49
    iput-object v3, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    iput-boolean v0, p0, Lx4/v;->T:Z

    .line 52
    .line 53
    iput-boolean v0, p0, Lx4/v;->S:Z

    .line 54
    .line 55
    iput-boolean v0, p0, Lx4/v;->U:Z

    .line 56
    .line 57
    iput-object v3, p0, Lx4/v;->E:Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    iput v0, p0, Lx4/v;->F:I

    .line 60
    .line 61
    iget-object v0, p0, Lx4/v;->d:Lx4/b0;

    .line 62
    .line 63
    iput-wide v1, v0, Lx4/b0;->o:J

    .line 64
    .line 65
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 66
    .line 67
    iget-object v0, v0, Lx4/q;->i:Ln4/c;

    .line 68
    .line 69
    iput-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 70
    .line 71
    invoke-virtual {v0}, Ln4/c;->a()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lx4/v;->g:Lx4/n;

    .line 75
    .line 76
    iget-object v0, v0, Lx4/n;->c:Landroid/media/AudioTrack;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/4 v4, 0x3

    .line 86
    if-ne v0, v4, :cond_0

    .line 87
    .line 88
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 94
    .line 95
    invoke-static {v0}, Lx4/v;->p(Landroid/media/AudioTrack;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    iget-object v0, p0, Lx4/v;->k:Ltc/b0;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v4, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 107
    .line 108
    iget-object v5, v0, Ltc/b0;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Lx4/u;

    .line 111
    .line 112
    invoke-static {v4, v5}, Lu2/b;->p(Landroid/media/AudioTrack;Lx4/u;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, Ltc/b0;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Landroid/os/Handler;

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 123
    .line 124
    invoke-virtual {v0}, Lx4/q;->a()Lr5/c;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    iget-object v0, p0, Lx4/v;->s:Lx4/q;

    .line 129
    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    iput-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 133
    .line 134
    iput-object v3, p0, Lx4/v;->s:Lx4/q;

    .line 135
    .line 136
    :cond_2
    iget-object v0, p0, Lx4/v;->g:Lx4/n;

    .line 137
    .line 138
    invoke-virtual {v0}, Lx4/n;->e()V

    .line 139
    .line 140
    .line 141
    iput-object v3, v0, Lx4/n;->c:Landroid/media/AudioTrack;

    .line 142
    .line 143
    iput-object v3, v0, Lx4/n;->e:Lx4/m;

    .line 144
    .line 145
    sget v0, Lp4/c0;->a:I

    .line 146
    .line 147
    const/16 v4, 0x18

    .line 148
    .line 149
    if-lt v0, v4, :cond_3

    .line 150
    .line 151
    iget-object v0, p0, Lx4/v;->y:Ltc/b0;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    iget-object v4, v0, Ltc/b0;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Landroid/media/AudioTrack;

    .line 158
    .line 159
    iget-object v5, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v5, Lx4/s;

    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v4, v5}, Lp4/z;->j(Landroid/media/AudioTrack;Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    .line 167
    .line 168
    .line 169
    iput-object v3, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v3, p0, Lx4/v;->y:Ltc/b0;

    .line 172
    .line 173
    :cond_3
    iget-object v5, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 174
    .line 175
    iget-object v6, p0, Lx4/v;->r:Lr/y1;

    .line 176
    .line 177
    new-instance v7, Landroid/os/Handler;

    .line 178
    .line 179
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 184
    .line 185
    .line 186
    sget-object v10, Lx4/v;->j0:Ljava/lang/Object;

    .line 187
    .line 188
    monitor-enter v10

    .line 189
    :try_start_0
    sget-object v0, Lx4/v;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 190
    .line 191
    if-nez v0, :cond_4

    .line 192
    .line 193
    new-instance v0, Lp4/b0;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    sput-object v0, Lx4/v;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :catchall_0
    move-exception v0

    .line 206
    goto :goto_1

    .line 207
    :cond_4
    :goto_0
    sget v0, Lx4/v;->l0:I

    .line 208
    .line 209
    add-int/lit8 v0, v0, 0x1

    .line 210
    .line 211
    sput v0, Lx4/v;->l0:I

    .line 212
    .line 213
    sget-object v0, Lx4/v;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 214
    .line 215
    new-instance v4, Lb7/f;

    .line 216
    .line 217
    const/4 v9, 0x7

    .line 218
    invoke-direct/range {v4 .. v9}, Lb7/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 219
    .line 220
    .line 221
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 222
    .line 223
    const-wide/16 v6, 0x14

    .line 224
    .line 225
    invoke-interface {v0, v4, v6, v7, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 226
    .line 227
    .line 228
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    iput-object v3, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :goto_1
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 233
    throw v0

    .line 234
    :cond_5
    :goto_2
    iget-object v0, p0, Lx4/v;->m:Lr/c2;

    .line 235
    .line 236
    iput-object v3, v0, Lr/c2;->c:Ljava/lang/Object;

    .line 237
    .line 238
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    iput-wide v4, v0, Lr/c2;->a:J

    .line 244
    .line 245
    iput-wide v4, v0, Lr/c2;->b:J

    .line 246
    .line 247
    iget-object v0, p0, Lx4/v;->l:Lr/c2;

    .line 248
    .line 249
    iput-object v3, v0, Lr/c2;->c:Ljava/lang/Object;

    .line 250
    .line 251
    iput-wide v4, v0, Lr/c2;->a:J

    .line 252
    .line 253
    iput-wide v4, v0, Lr/c2;->b:J

    .line 254
    .line 255
    iput-wide v1, p0, Lx4/v;->g0:J

    .line 256
    .line 257
    iput-wide v1, p0, Lx4/v;->h0:J

    .line 258
    .line 259
    iget-object v0, p0, Lx4/v;->i0:Landroid/os/Handler;

    .line 260
    .line 261
    if-eqz v0, :cond_6

    .line 262
    .line 263
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_6
    return-void
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final h(Lm4/q;)Lx4/f;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lx4/v;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lx4/f;->d:Lx4/f;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lx4/v;->z:Lm4/d;

    .line 9
    .line 10
    iget-object v1, p0, Lx4/v;->o:Lv2/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget v2, p1, Lm4/q;->E:I

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget v3, Lp4/c0;->a:I

    .line 24
    .line 25
    const/16 v4, 0x1d

    .line 26
    .line 27
    if-lt v3, v4, :cond_d

    .line 28
    .line 29
    const/4 v4, -0x1

    .line 30
    if-ne v2, v4, :cond_1

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    iget-object v4, v1, Lv2/e;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Landroid/content/Context;

    .line 37
    .line 38
    iget-object v5, v1, Lv2/e;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v5, Ljava/lang/Boolean;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x1

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    if-eqz v4, :cond_5

    .line 52
    .line 53
    const-string v5, "audio"

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Landroid/media/AudioManager;

    .line 60
    .line 61
    if-eqz v4, :cond_4

    .line 62
    .line 63
    const-string v5, "offloadVariableRateSupported"

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    const-string v5, "offloadVariableRateSupported=1"

    .line 72
    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    const/4 v4, 0x1

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const/4 v4, 0x0

    .line 82
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    iput-object v4, v1, Lv2/e;->c:Ljava/lang/Object;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    iput-object v4, v1, Lv2/e;->c:Ljava/lang/Object;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 95
    .line 96
    iput-object v4, v1, Lv2/e;->c:Ljava/lang/Object;

    .line 97
    .line 98
    :goto_1
    iget-object v1, v1, Lv2/e;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    :goto_2
    iget-object v4, p1, Lm4/q;->n:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v5, p1, Lm4/q;->k:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v4, v5}, Lm4/o0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_c

    .line 118
    .line 119
    invoke-static {v4}, Lp4/c0;->q(I)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-ge v3, v5, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    iget p1, p1, Lm4/q;->D:I

    .line 127
    .line 128
    invoke-static {p1}, Lp4/c0;->s(I)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_7

    .line 133
    .line 134
    sget-object p1, Lx4/f;->d:Lx4/f;

    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_7
    :try_start_0
    invoke-static {v2, p1, v4}, Lp4/c0;->r(III)Landroid/media/AudioFormat;

    .line 138
    .line 139
    .line 140
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    const/16 v2, 0x1f

    .line 142
    .line 143
    if-lt v3, v2, :cond_a

    .line 144
    .line 145
    invoke-virtual {v0}, Lm4/d;->b()Lm4/t0;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, Lm4/t0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Landroid/media/AudioAttributes;

    .line 152
    .line 153
    invoke-static {p1, v0}, Lw4/h;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-nez p1, :cond_8

    .line 158
    .line 159
    sget-object p1, Lx4/f;->d:Lx4/f;

    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_8
    new-instance v0, Ll6/c;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 165
    .line 166
    .line 167
    const/16 v2, 0x20

    .line 168
    .line 169
    if-le v3, v2, :cond_9

    .line 170
    .line 171
    const/4 v2, 0x2

    .line 172
    if-ne p1, v2, :cond_9

    .line 173
    .line 174
    const/4 v6, 0x1

    .line 175
    :cond_9
    iput-boolean v7, v0, Ll6/c;->a:Z

    .line 176
    .line 177
    iput-boolean v6, v0, Ll6/c;->b:Z

    .line 178
    .line 179
    iput-boolean v1, v0, Ll6/c;->c:Z

    .line 180
    .line 181
    invoke-virtual {v0}, Ll6/c;->a()Lx4/f;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1

    .line 186
    :cond_a
    invoke-virtual {v0}, Lm4/d;->b()Lm4/t0;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v0, v0, Lm4/t0;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Landroid/media/AudioAttributes;

    .line 193
    .line 194
    invoke-static {p1, v0}, Lu2/b;->x(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-nez p1, :cond_b

    .line 199
    .line 200
    sget-object p1, Lx4/f;->d:Lx4/f;

    .line 201
    .line 202
    return-object p1

    .line 203
    :cond_b
    new-instance p1, Ll6/c;

    .line 204
    .line 205
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    iput-boolean v7, p1, Ll6/c;->a:Z

    .line 209
    .line 210
    iput-boolean v1, p1, Ll6/c;->c:Z

    .line 211
    .line 212
    invoke-virtual {p1}, Ll6/c;->a()Lx4/f;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :catch_0
    sget-object p1, Lx4/f;->d:Lx4/f;

    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_c
    :goto_3
    sget-object p1, Lx4/f;->d:Lx4/f;

    .line 221
    .line 222
    return-object p1

    .line 223
    :cond_d
    :goto_4
    sget-object p1, Lx4/f;->d:Lx4/f;

    .line 224
    .line 225
    return-object p1
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final i(Lm4/q;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lx4/v;->q()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lm4/q;->n:Ljava/lang/String;

    .line 5
    .line 6
    iget v1, p1, Lm4/q;->F:I

    .line 7
    .line 8
    const-string v2, "audio/raw"

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x2

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {v1}, Lp4/c0;->I(I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const-string p1, "DefaultAudioSink"

    .line 25
    .line 26
    const-string v0, "Invalid PCM encoding: "

    .line 27
    .line 28
    invoke-static {v1, v0, p1}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_0
    if-eq v1, v3, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_1
    iget-object v0, p0, Lx4/v;->w:Lx4/b;

    .line 37
    .line 38
    iget-object v1, p0, Lx4/v;->z:Lm4/d;

    .line 39
    .line 40
    invoke-virtual {v0, v1, p1}, Lx4/b;->d(Lm4/d;Lm4/q;)Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    :cond_2
    return v3

    .line 47
    :cond_3
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

.method public final j()J
    .locals 5

    .line 1
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 2
    .line 3
    iget v1, v0, Lx4/q;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lx4/v;->G:J

    .line 8
    .line 9
    iget v0, v0, Lx4/q;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_0
    iget-wide v0, p0, Lx4/v;->H:J

    .line 15
    .line 16
    return-wide v0
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
.end method

.method public final k()J
    .locals 7

    .line 1
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 2
    .line 3
    iget v1, v0, Lx4/q;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lx4/v;->I:J

    .line 8
    .line 9
    iget v0, v0, Lx4/q;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    sget v0, Lp4/c0;->a:I

    .line 13
    .line 14
    add-long/2addr v1, v3

    .line 15
    const-wide/16 v5, 0x1

    .line 16
    .line 17
    sub-long/2addr v1, v5

    .line 18
    div-long/2addr v1, v3

    .line 19
    return-wide v1

    .line 20
    :cond_0
    iget-wide v0, p0, Lx4/v;->J:J

    .line 21
    .line 22
    return-wide v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final l(Ljava/nio/ByteBuffer;JI)Z
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v5, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 21
    :goto_1
    invoke-static {v5}, Lp4/c;->c(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, Lx4/v;->s:Lx4/q;

    .line 25
    .line 26
    const/4 v8, 0x3

    .line 27
    iget-object v9, v1, Lx4/v;->g:Lx4/n;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    if-eqz v5, :cond_8

    .line 31
    .line 32
    invoke-virtual {v1}, Lx4/v;->f()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    :cond_2
    :goto_2
    const/16 v21, 0x0

    .line 39
    .line 40
    goto/16 :goto_1b

    .line 41
    .line 42
    :cond_3
    iget-object v5, v1, Lx4/v;->s:Lx4/q;

    .line 43
    .line 44
    iget-object v11, v1, Lx4/v;->t:Lx4/q;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget v12, v11, Lx4/q;->c:I

    .line 50
    .line 51
    iget v13, v5, Lx4/q;->c:I

    .line 52
    .line 53
    if-ne v12, v13, :cond_5

    .line 54
    .line 55
    iget v12, v11, Lx4/q;->g:I

    .line 56
    .line 57
    iget v13, v5, Lx4/q;->g:I

    .line 58
    .line 59
    if-ne v12, v13, :cond_5

    .line 60
    .line 61
    iget v12, v11, Lx4/q;->e:I

    .line 62
    .line 63
    iget v13, v5, Lx4/q;->e:I

    .line 64
    .line 65
    if-ne v12, v13, :cond_5

    .line 66
    .line 67
    iget v12, v11, Lx4/q;->f:I

    .line 68
    .line 69
    iget v13, v5, Lx4/q;->f:I

    .line 70
    .line 71
    if-ne v12, v13, :cond_5

    .line 72
    .line 73
    iget v12, v11, Lx4/q;->d:I

    .line 74
    .line 75
    iget v13, v5, Lx4/q;->d:I

    .line 76
    .line 77
    if-ne v12, v13, :cond_5

    .line 78
    .line 79
    iget-boolean v12, v11, Lx4/q;->j:Z

    .line 80
    .line 81
    iget-boolean v13, v5, Lx4/q;->j:Z

    .line 82
    .line 83
    if-ne v12, v13, :cond_5

    .line 84
    .line 85
    iget-boolean v11, v11, Lx4/q;->k:Z

    .line 86
    .line 87
    iget-boolean v5, v5, Lx4/q;->k:Z

    .line 88
    .line 89
    if-ne v11, v5, :cond_5

    .line 90
    .line 91
    iget-object v5, v1, Lx4/v;->s:Lx4/q;

    .line 92
    .line 93
    iput-object v5, v1, Lx4/v;->t:Lx4/q;

    .line 94
    .line 95
    iput-object v10, v1, Lx4/v;->s:Lx4/q;

    .line 96
    .line 97
    iget-object v5, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 98
    .line 99
    if-eqz v5, :cond_7

    .line 100
    .line 101
    invoke-static {v5}, Lx4/v;->p(Landroid/media/AudioTrack;)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_7

    .line 106
    .line 107
    iget-object v5, v1, Lx4/v;->t:Lx4/q;

    .line 108
    .line 109
    iget-boolean v5, v5, Lx4/q;->k:Z

    .line 110
    .line 111
    if-eqz v5, :cond_7

    .line 112
    .line 113
    iget-object v5, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 114
    .line 115
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-ne v5, v8, :cond_4

    .line 120
    .line 121
    iget-object v5, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 122
    .line 123
    invoke-static {v5}, Lu2/b;->n(Landroid/media/AudioTrack;)V

    .line 124
    .line 125
    .line 126
    iput-boolean v6, v9, Lx4/n;->G:Z

    .line 127
    .line 128
    iget-object v5, v9, Lx4/n;->e:Lx4/m;

    .line 129
    .line 130
    if-eqz v5, :cond_4

    .line 131
    .line 132
    iget-object v5, v5, Lx4/m;->a:Lx4/l;

    .line 133
    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    iput-boolean v6, v5, Lx4/l;->f:Z

    .line 137
    .line 138
    :cond_4
    iget-object v5, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 139
    .line 140
    iget-object v11, v1, Lx4/v;->t:Lx4/q;

    .line 141
    .line 142
    iget-object v11, v11, Lx4/q;->a:Lm4/q;

    .line 143
    .line 144
    iget v12, v11, Lm4/q;->G:I

    .line 145
    .line 146
    iget v11, v11, Lm4/q;->H:I

    .line 147
    .line 148
    invoke-static {v5, v12, v11}, Lu2/b;->o(Landroid/media/AudioTrack;II)V

    .line 149
    .line 150
    .line 151
    iput-boolean v6, v1, Lx4/v;->e0:Z

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    invoke-virtual {v1}, Lx4/v;->s()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Lx4/v;->m()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_6

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-virtual {v1}, Lx4/v;->g()V

    .line 165
    .line 166
    .line 167
    :cond_7
    :goto_3
    invoke-virtual {v1, v2, v3}, Lx4/v;->a(J)V

    .line 168
    .line 169
    .line 170
    :cond_8
    invoke-virtual {v1}, Lx4/v;->o()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    iget-object v11, v1, Lx4/v;->l:Lr/c2;

    .line 175
    .line 176
    if-nez v5, :cond_a

    .line 177
    .line 178
    :try_start_0
    invoke-virtual {v1}, Lx4/v;->n()Z

    .line 179
    .line 180
    .line 181
    move-result v5
    :try_end_0
    .catch Lx4/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    if-nez v5, :cond_a

    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :catch_0
    move-exception v0

    .line 187
    iget-boolean v2, v0, Lx4/j;->b:Z

    .line 188
    .line 189
    if-nez v2, :cond_9

    .line 190
    .line 191
    invoke-virtual {v11, v0}, Lr/c2;->d(Ljava/lang/Exception;)V

    .line 192
    .line 193
    .line 194
    return v7

    .line 195
    :cond_9
    throw v0

    .line 196
    :cond_a
    iput-object v10, v11, Lr/c2;->c:Ljava/lang/Object;

    .line 197
    .line 198
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    iput-wide v12, v11, Lr/c2;->a:J

    .line 204
    .line 205
    iput-wide v12, v11, Lr/c2;->b:J

    .line 206
    .line 207
    iget-boolean v5, v1, Lx4/v;->M:Z

    .line 208
    .line 209
    const-wide/16 v14, 0x0

    .line 210
    .line 211
    move-wide/from16 v16, v12

    .line 212
    .line 213
    if-eqz v5, :cond_c

    .line 214
    .line 215
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v12

    .line 219
    iput-wide v12, v1, Lx4/v;->N:J

    .line 220
    .line 221
    iput-boolean v7, v1, Lx4/v;->L:Z

    .line 222
    .line 223
    iput-boolean v7, v1, Lx4/v;->M:Z

    .line 224
    .line 225
    invoke-virtual {v1}, Lx4/v;->x()Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_b

    .line 230
    .line 231
    invoke-virtual {v1}, Lx4/v;->v()V

    .line 232
    .line 233
    .line 234
    :cond_b
    invoke-virtual {v1, v2, v3}, Lx4/v;->a(J)V

    .line 235
    .line 236
    .line 237
    iget-boolean v5, v1, Lx4/v;->V:Z

    .line 238
    .line 239
    if-eqz v5, :cond_c

    .line 240
    .line 241
    invoke-virtual {v1}, Lx4/v;->r()V

    .line 242
    .line 243
    .line 244
    :cond_c
    invoke-virtual {v1}, Lx4/v;->k()J

    .line 245
    .line 246
    .line 247
    move-result-wide v11

    .line 248
    iget-object v5, v9, Lx4/n;->c:Landroid/media/AudioTrack;

    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    iget-boolean v13, v9, Lx4/n;->g:Z

    .line 258
    .line 259
    move-wide/from16 v18, v14

    .line 260
    .line 261
    const/4 v14, 0x2

    .line 262
    if-eqz v13, :cond_e

    .line 263
    .line 264
    if-ne v5, v14, :cond_d

    .line 265
    .line 266
    iput-boolean v7, v9, Lx4/n;->o:Z

    .line 267
    .line 268
    return v7

    .line 269
    :cond_d
    if-ne v5, v6, :cond_e

    .line 270
    .line 271
    invoke-virtual {v9}, Lx4/n;->c()J

    .line 272
    .line 273
    .line 274
    move-result-wide v20

    .line 275
    cmp-long v13, v20, v18

    .line 276
    .line 277
    if-nez v13, :cond_e

    .line 278
    .line 279
    goto/16 :goto_2

    .line 280
    .line 281
    :cond_e
    iget-boolean v13, v9, Lx4/n;->o:Z

    .line 282
    .line 283
    invoke-virtual {v9, v11, v12}, Lx4/n;->d(J)Z

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    iput-boolean v11, v9, Lx4/n;->o:Z

    .line 288
    .line 289
    if-eqz v13, :cond_f

    .line 290
    .line 291
    if-nez v11, :cond_f

    .line 292
    .line 293
    if-eq v5, v6, :cond_f

    .line 294
    .line 295
    iget-object v5, v9, Lx4/n;->a:Lr/y1;

    .line 296
    .line 297
    iget v11, v9, Lx4/n;->d:I

    .line 298
    .line 299
    iget-wide v12, v9, Lx4/n;->h:J

    .line 300
    .line 301
    invoke-static {v12, v13}, Lp4/c0;->c0(J)J

    .line 302
    .line 303
    .line 304
    move-result-wide v23

    .line 305
    iget-object v5, v5, Lr/y1;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v5, Lx4/v;

    .line 308
    .line 309
    iget-object v12, v5, Lx4/v;->r:Lr/y1;

    .line 310
    .line 311
    if-eqz v12, :cond_f

    .line 312
    .line 313
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 314
    .line 315
    .line 316
    move-result-wide v12

    .line 317
    move/from16 v22, v11

    .line 318
    .line 319
    iget-wide v10, v5, Lx4/v;->c0:J

    .line 320
    .line 321
    sub-long v25, v12, v10

    .line 322
    .line 323
    iget-object v5, v5, Lx4/v;->r:Lr/y1;

    .line 324
    .line 325
    iget-object v5, v5, Lr/y1;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v5, Lx4/x;

    .line 328
    .line 329
    iget-object v5, v5, Lx4/x;->T0:Lp5/y;

    .line 330
    .line 331
    iget-object v10, v5, Lp5/y;->b:Landroid/os/Handler;

    .line 332
    .line 333
    if-eqz v10, :cond_f

    .line 334
    .line 335
    new-instance v20, Lx4/g;

    .line 336
    .line 337
    move-object/from16 v21, v5

    .line 338
    .line 339
    invoke-direct/range {v20 .. v26}, Lx4/g;-><init>(Lp5/y;IJJ)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v5, v20

    .line 343
    .line 344
    invoke-virtual {v10, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 345
    .line 346
    .line 347
    :cond_f
    iget-object v5, v1, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 348
    .line 349
    if-nez v5, :cond_38

    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 356
    .line 357
    if-ne v5, v10, :cond_10

    .line 358
    .line 359
    const/4 v5, 0x1

    .line 360
    goto :goto_4

    .line 361
    :cond_10
    const/4 v5, 0x0

    .line 362
    :goto_4
    invoke-static {v5}, Lp4/c;->c(Z)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-nez v5, :cond_11

    .line 370
    .line 371
    goto/16 :goto_19

    .line 372
    .line 373
    :cond_11
    iget-object v5, v1, Lx4/v;->t:Lx4/q;

    .line 374
    .line 375
    iget v10, v5, Lx4/q;->c:I

    .line 376
    .line 377
    if-eqz v10, :cond_30

    .line 378
    .line 379
    iget v10, v1, Lx4/v;->K:I

    .line 380
    .line 381
    if-nez v10, :cond_30

    .line 382
    .line 383
    iget v5, v5, Lx4/q;->g:I

    .line 384
    .line 385
    const/16 v10, 0x14

    .line 386
    .line 387
    const/4 v11, 0x5

    .line 388
    if-eq v5, v10, :cond_2b

    .line 389
    .line 390
    const/16 v10, 0x1e

    .line 391
    .line 392
    const/4 v12, -0x2

    .line 393
    const/4 v13, -0x1

    .line 394
    if-eq v5, v10, :cond_23

    .line 395
    .line 396
    const/16 v10, 0xa

    .line 397
    .line 398
    packed-switch v5, :pswitch_data_0

    .line 399
    .line 400
    .line 401
    const/16 v14, 0x10

    .line 402
    .line 403
    packed-switch v5, :pswitch_data_1

    .line 404
    .line 405
    .line 406
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 407
    .line 408
    const-string v2, "Unexpected audio encoding: "

    .line 409
    .line 410
    invoke-static {v5, v2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    throw v0

    .line 418
    :pswitch_0
    new-array v5, v14, [B

    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 421
    .line 422
    .line 423
    move-result v8

    .line 424
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 428
    .line 429
    .line 430
    new-instance v8, Lp4/r;

    .line 431
    .line 432
    invoke-direct {v8, v5, v14}, Lp4/r;-><init>([BI)V

    .line 433
    .line 434
    .line 435
    invoke-static {v8}, Lr5/b;->l(Lp4/r;)Li7/j1;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    iget v13, v5, Li7/j1;->c:I

    .line 440
    .line 441
    goto/16 :goto_18

    .line 442
    .line 443
    :cond_12
    :goto_5
    :pswitch_1
    const/16 v13, 0x400

    .line 444
    .line 445
    goto/16 :goto_18

    .line 446
    .line 447
    :pswitch_2
    const/16 v13, 0x200

    .line 448
    .line 449
    goto/16 :goto_18

    .line 450
    .line 451
    :pswitch_3
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    sub-int/2addr v8, v10

    .line 460
    move v10, v5

    .line 461
    :goto_6
    if-gt v10, v8, :cond_15

    .line 462
    .line 463
    add-int/lit8 v11, v10, 0x4

    .line 464
    .line 465
    sget v20, Lp4/c0;->a:I

    .line 466
    .line 467
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    const/16 v21, 0x10

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 474
    .line 475
    .line 476
    move-result-object v14

    .line 477
    sget-object v15, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 478
    .line 479
    if-ne v14, v15, :cond_13

    .line 480
    .line 481
    goto :goto_7

    .line 482
    :cond_13
    invoke-static {v11}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 483
    .line 484
    .line 485
    move-result v11

    .line 486
    :goto_7
    and-int/2addr v11, v12

    .line 487
    const v14, -0x78d9046

    .line 488
    .line 489
    .line 490
    if-ne v11, v14, :cond_14

    .line 491
    .line 492
    sub-int/2addr v10, v5

    .line 493
    goto :goto_8

    .line 494
    :cond_14
    add-int/lit8 v10, v10, 0x1

    .line 495
    .line 496
    const/16 v14, 0x10

    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_15
    const/16 v21, 0x10

    .line 500
    .line 501
    const/4 v10, -0x1

    .line 502
    :goto_8
    if-ne v10, v13, :cond_16

    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    goto/16 :goto_18

    .line 506
    .line 507
    :cond_16
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    add-int/2addr v5, v10

    .line 512
    add-int/lit8 v5, v5, 0x7

    .line 513
    .line 514
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    and-int/lit16 v5, v5, 0xff

    .line 519
    .line 520
    const/16 v8, 0xbb

    .line 521
    .line 522
    if-ne v5, v8, :cond_17

    .line 523
    .line 524
    const/4 v5, 0x1

    .line 525
    goto :goto_9

    .line 526
    :cond_17
    const/4 v5, 0x0

    .line 527
    :goto_9
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 528
    .line 529
    .line 530
    move-result v8

    .line 531
    add-int/2addr v8, v10

    .line 532
    if-eqz v5, :cond_18

    .line 533
    .line 534
    const/16 v5, 0x9

    .line 535
    .line 536
    goto :goto_a

    .line 537
    :cond_18
    const/16 v5, 0x8

    .line 538
    .line 539
    :goto_a
    add-int/2addr v8, v5

    .line 540
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    shr-int/lit8 v5, v5, 0x4

    .line 545
    .line 546
    and-int/lit8 v5, v5, 0x7

    .line 547
    .line 548
    const/16 v8, 0x28

    .line 549
    .line 550
    shl-int v5, v8, v5

    .line 551
    .line 552
    mul-int/lit8 v13, v5, 0x10

    .line 553
    .line 554
    goto/16 :goto_18

    .line 555
    .line 556
    :pswitch_4
    const/16 v13, 0x800

    .line 557
    .line 558
    goto/16 :goto_18

    .line 559
    .line 560
    :pswitch_5
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    sget v11, Lp4/c0;->a:I

    .line 565
    .line 566
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 571
    .line 572
    .line 573
    move-result-object v11

    .line 574
    sget-object v12, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 575
    .line 576
    if-ne v11, v12, :cond_19

    .line 577
    .line 578
    goto :goto_b

    .line 579
    :cond_19
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 580
    .line 581
    .line 582
    move-result v5

    .line 583
    :goto_b
    const/high16 v11, -0x200000

    .line 584
    .line 585
    and-int v12, v5, v11

    .line 586
    .line 587
    if-ne v12, v11, :cond_1a

    .line 588
    .line 589
    ushr-int/lit8 v11, v5, 0x13

    .line 590
    .line 591
    and-int/2addr v11, v8

    .line 592
    if-ne v11, v6, :cond_1b

    .line 593
    .line 594
    :cond_1a
    :goto_c
    const/4 v5, -0x1

    .line 595
    goto :goto_d

    .line 596
    :cond_1b
    ushr-int/lit8 v12, v5, 0x11

    .line 597
    .line 598
    and-int/2addr v12, v8

    .line 599
    if-nez v12, :cond_1c

    .line 600
    .line 601
    goto :goto_c

    .line 602
    :cond_1c
    ushr-int/lit8 v15, v5, 0xc

    .line 603
    .line 604
    const/16 v7, 0xf

    .line 605
    .line 606
    and-int/2addr v15, v7

    .line 607
    ushr-int/2addr v5, v10

    .line 608
    and-int/2addr v5, v8

    .line 609
    if-eqz v15, :cond_1a

    .line 610
    .line 611
    if-eq v15, v7, :cond_1a

    .line 612
    .line 613
    if-ne v5, v8, :cond_1d

    .line 614
    .line 615
    goto :goto_c

    .line 616
    :cond_1d
    const/16 v5, 0x480

    .line 617
    .line 618
    if-eq v12, v6, :cond_1f

    .line 619
    .line 620
    if-eq v12, v14, :cond_21

    .line 621
    .line 622
    if-ne v12, v8, :cond_1e

    .line 623
    .line 624
    const/16 v5, 0x180

    .line 625
    .line 626
    goto :goto_d

    .line 627
    :cond_1e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 628
    .line 629
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 630
    .line 631
    .line 632
    throw v0

    .line 633
    :cond_1f
    if-ne v11, v8, :cond_20

    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_20
    const/16 v5, 0x240

    .line 637
    .line 638
    :cond_21
    :goto_d
    if-eq v5, v13, :cond_22

    .line 639
    .line 640
    move v13, v5

    .line 641
    goto/16 :goto_18

    .line 642
    .line 643
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 644
    .line 645
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 646
    .line 647
    .line 648
    throw v0

    .line 649
    :cond_23
    :pswitch_6
    const/4 v5, 0x0

    .line 650
    goto :goto_f

    .line 651
    :pswitch_7
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 652
    .line 653
    .line 654
    move-result v5

    .line 655
    add-int/2addr v5, v11

    .line 656
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    and-int/lit16 v5, v5, 0xf8

    .line 661
    .line 662
    shr-int/2addr v5, v8

    .line 663
    if-le v5, v10, :cond_25

    .line 664
    .line 665
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 666
    .line 667
    .line 668
    move-result v5

    .line 669
    add-int/lit8 v5, v5, 0x4

    .line 670
    .line 671
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    and-int/lit16 v5, v5, 0xc0

    .line 676
    .line 677
    shr-int/lit8 v5, v5, 0x6

    .line 678
    .line 679
    if-ne v5, v8, :cond_24

    .line 680
    .line 681
    goto :goto_e

    .line 682
    :cond_24
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 683
    .line 684
    .line 685
    move-result v5

    .line 686
    add-int/lit8 v5, v5, 0x4

    .line 687
    .line 688
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 689
    .line 690
    .line 691
    move-result v5

    .line 692
    and-int/lit8 v5, v5, 0x30

    .line 693
    .line 694
    shr-int/lit8 v8, v5, 0x4

    .line 695
    .line 696
    :goto_e
    sget-object v5, Lr5/b;->c:[I

    .line 697
    .line 698
    aget v5, v5, v8

    .line 699
    .line 700
    mul-int/lit16 v13, v5, 0x100

    .line 701
    .line 702
    goto/16 :goto_18

    .line 703
    .line 704
    :cond_25
    const/16 v13, 0x600

    .line 705
    .line 706
    goto/16 :goto_18

    .line 707
    .line 708
    :goto_f
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    const v8, -0xde4bec0

    .line 713
    .line 714
    .line 715
    if-eq v7, v8, :cond_12

    .line 716
    .line 717
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 718
    .line 719
    .line 720
    move-result v7

    .line 721
    const v8, -0x17bd3b8f

    .line 722
    .line 723
    .line 724
    if-ne v7, v8, :cond_26

    .line 725
    .line 726
    goto/16 :goto_5

    .line 727
    .line 728
    :cond_26
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 729
    .line 730
    .line 731
    move-result v7

    .line 732
    const v5, 0x25205864

    .line 733
    .line 734
    .line 735
    if-ne v7, v5, :cond_27

    .line 736
    .line 737
    const/16 v13, 0x1000

    .line 738
    .line 739
    goto/16 :goto_18

    .line 740
    .line 741
    :cond_27
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 742
    .line 743
    .line 744
    move-result v5

    .line 745
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 746
    .line 747
    .line 748
    move-result v7

    .line 749
    if-eq v7, v12, :cond_2a

    .line 750
    .line 751
    if-eq v7, v13, :cond_29

    .line 752
    .line 753
    const/16 v8, 0x1f

    .line 754
    .line 755
    if-eq v7, v8, :cond_28

    .line 756
    .line 757
    add-int/lit8 v7, v5, 0x4

    .line 758
    .line 759
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 760
    .line 761
    .line 762
    move-result v7

    .line 763
    and-int/2addr v7, v6

    .line 764
    shl-int/lit8 v7, v7, 0x6

    .line 765
    .line 766
    add-int/2addr v5, v11

    .line 767
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 768
    .line 769
    .line 770
    move-result v5

    .line 771
    :goto_10
    and-int/lit16 v5, v5, 0xfc

    .line 772
    .line 773
    :goto_11
    shr-int/2addr v5, v14

    .line 774
    or-int/2addr v5, v7

    .line 775
    goto :goto_13

    .line 776
    :cond_28
    add-int/lit8 v7, v5, 0x5

    .line 777
    .line 778
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 779
    .line 780
    .line 781
    move-result v7

    .line 782
    and-int/lit8 v7, v7, 0x7

    .line 783
    .line 784
    shl-int/lit8 v7, v7, 0x4

    .line 785
    .line 786
    add-int/lit8 v5, v5, 0x6

    .line 787
    .line 788
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 789
    .line 790
    .line 791
    move-result v5

    .line 792
    :goto_12
    and-int/lit8 v5, v5, 0x3c

    .line 793
    .line 794
    goto :goto_11

    .line 795
    :cond_29
    add-int/lit8 v7, v5, 0x4

    .line 796
    .line 797
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    and-int/lit8 v7, v7, 0x7

    .line 802
    .line 803
    shl-int/lit8 v7, v7, 0x4

    .line 804
    .line 805
    add-int/lit8 v5, v5, 0x7

    .line 806
    .line 807
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 808
    .line 809
    .line 810
    move-result v5

    .line 811
    goto :goto_12

    .line 812
    :cond_2a
    add-int/lit8 v7, v5, 0x5

    .line 813
    .line 814
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 815
    .line 816
    .line 817
    move-result v7

    .line 818
    and-int/2addr v7, v6

    .line 819
    shl-int/lit8 v7, v7, 0x6

    .line 820
    .line 821
    add-int/lit8 v5, v5, 0x4

    .line 822
    .line 823
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    goto :goto_10

    .line 828
    :goto_13
    add-int/2addr v5, v6

    .line 829
    mul-int/lit8 v13, v5, 0x20

    .line 830
    .line 831
    goto :goto_18

    .line 832
    :cond_2b
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    and-int/2addr v5, v14

    .line 837
    if-nez v5, :cond_2c

    .line 838
    .line 839
    const/4 v5, 0x0

    .line 840
    goto :goto_16

    .line 841
    :cond_2c
    const/16 v5, 0x1a

    .line 842
    .line 843
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 844
    .line 845
    .line 846
    move-result v5

    .line 847
    const/16 v7, 0x1c

    .line 848
    .line 849
    const/4 v8, 0x0

    .line 850
    const/16 v10, 0x1c

    .line 851
    .line 852
    :goto_14
    if-ge v8, v5, :cond_2d

    .line 853
    .line 854
    add-int/lit8 v11, v8, 0x1b

    .line 855
    .line 856
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 857
    .line 858
    .line 859
    move-result v11

    .line 860
    add-int/2addr v10, v11

    .line 861
    add-int/lit8 v8, v8, 0x1

    .line 862
    .line 863
    goto :goto_14

    .line 864
    :cond_2d
    add-int/lit8 v5, v10, 0x1a

    .line 865
    .line 866
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 867
    .line 868
    .line 869
    move-result v5

    .line 870
    const/4 v8, 0x0

    .line 871
    :goto_15
    if-ge v8, v5, :cond_2e

    .line 872
    .line 873
    add-int/lit8 v11, v10, 0x1b

    .line 874
    .line 875
    add-int/2addr v11, v8

    .line 876
    invoke-virtual {v0, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 877
    .line 878
    .line 879
    move-result v11

    .line 880
    add-int/2addr v7, v11

    .line 881
    add-int/lit8 v8, v8, 0x1

    .line 882
    .line 883
    goto :goto_15

    .line 884
    :cond_2e
    add-int v5, v10, v7

    .line 885
    .line 886
    :goto_16
    add-int/lit8 v7, v5, 0x1a

    .line 887
    .line 888
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 889
    .line 890
    .line 891
    move-result v7

    .line 892
    add-int/lit8 v7, v7, 0x1b

    .line 893
    .line 894
    add-int/2addr v7, v5

    .line 895
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 896
    .line 897
    .line 898
    move-result v5

    .line 899
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 900
    .line 901
    .line 902
    move-result v8

    .line 903
    sub-int/2addr v8, v7

    .line 904
    if-le v8, v6, :cond_2f

    .line 905
    .line 906
    add-int/2addr v7, v6

    .line 907
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 908
    .line 909
    .line 910
    move-result v7

    .line 911
    goto :goto_17

    .line 912
    :cond_2f
    const/4 v7, 0x0

    .line 913
    :goto_17
    invoke-static {v5, v7}, Lr5/b;->j(BB)J

    .line 914
    .line 915
    .line 916
    move-result-wide v7

    .line 917
    const-wide/32 v10, 0xbb80

    .line 918
    .line 919
    .line 920
    mul-long v7, v7, v10

    .line 921
    .line 922
    const-wide/32 v10, 0xf4240

    .line 923
    .line 924
    .line 925
    div-long/2addr v7, v10

    .line 926
    long-to-int v13, v7

    .line 927
    :goto_18
    iput v13, v1, Lx4/v;->K:I

    .line 928
    .line 929
    if-nez v13, :cond_30

    .line 930
    .line 931
    :goto_19
    return v6

    .line 932
    :cond_30
    iget-object v5, v1, Lx4/v;->A:Lx4/r;

    .line 933
    .line 934
    if-eqz v5, :cond_32

    .line 935
    .line 936
    invoke-virtual {v1}, Lx4/v;->f()Z

    .line 937
    .line 938
    .line 939
    move-result v5

    .line 940
    if-nez v5, :cond_31

    .line 941
    .line 942
    goto/16 :goto_2

    .line 943
    .line 944
    :cond_31
    invoke-virtual {v1, v2, v3}, Lx4/v;->a(J)V

    .line 945
    .line 946
    .line 947
    const/4 v15, 0x0

    .line 948
    iput-object v15, v1, Lx4/v;->A:Lx4/r;

    .line 949
    .line 950
    :cond_32
    iget-wide v7, v1, Lx4/v;->N:J

    .line 951
    .line 952
    iget-object v5, v1, Lx4/v;->t:Lx4/q;

    .line 953
    .line 954
    invoke-virtual {v1}, Lx4/v;->j()J

    .line 955
    .line 956
    .line 957
    move-result-wide v10

    .line 958
    iget-object v12, v1, Lx4/v;->d:Lx4/b0;

    .line 959
    .line 960
    iget-wide v12, v12, Lx4/b0;->o:J

    .line 961
    .line 962
    sub-long/2addr v10, v12

    .line 963
    iget-object v5, v5, Lx4/q;->a:Lm4/q;

    .line 964
    .line 965
    iget v5, v5, Lm4/q;->E:I

    .line 966
    .line 967
    invoke-static {v5, v10, v11}, Lp4/c0;->T(IJ)J

    .line 968
    .line 969
    .line 970
    move-result-wide v10

    .line 971
    add-long/2addr v10, v7

    .line 972
    iget-boolean v5, v1, Lx4/v;->L:Z

    .line 973
    .line 974
    if-nez v5, :cond_34

    .line 975
    .line 976
    sub-long v7, v10, v2

    .line 977
    .line 978
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 979
    .line 980
    .line 981
    move-result-wide v7

    .line 982
    const-wide/32 v12, 0x30d40

    .line 983
    .line 984
    .line 985
    cmp-long v5, v7, v12

    .line 986
    .line 987
    if-lez v5, :cond_34

    .line 988
    .line 989
    iget-object v5, v1, Lx4/v;->r:Lr/y1;

    .line 990
    .line 991
    if-eqz v5, :cond_33

    .line 992
    .line 993
    new-instance v7, Lqc/a;

    .line 994
    .line 995
    new-instance v8, Ljava/lang/StringBuilder;

    .line 996
    .line 997
    const-string v12, "Unexpected audio track timestamp discontinuity: expected "

    .line 998
    .line 999
    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1003
    .line 1004
    .line 1005
    const-string v12, ", got "

    .line 1006
    .line 1007
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v8

    .line 1017
    invoke-direct {v7, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v5, v7}, Lr/y1;->b0(Ljava/lang/Exception;)V

    .line 1021
    .line 1022
    .line 1023
    :cond_33
    iput-boolean v6, v1, Lx4/v;->L:Z

    .line 1024
    .line 1025
    :cond_34
    iget-boolean v5, v1, Lx4/v;->L:Z

    .line 1026
    .line 1027
    if-eqz v5, :cond_36

    .line 1028
    .line 1029
    invoke-virtual {v1}, Lx4/v;->f()Z

    .line 1030
    .line 1031
    .line 1032
    move-result v5

    .line 1033
    if-nez v5, :cond_35

    .line 1034
    .line 1035
    goto/16 :goto_2

    .line 1036
    .line 1037
    :cond_35
    sub-long v7, v2, v10

    .line 1038
    .line 1039
    iget-wide v10, v1, Lx4/v;->N:J

    .line 1040
    .line 1041
    add-long/2addr v10, v7

    .line 1042
    iput-wide v10, v1, Lx4/v;->N:J

    .line 1043
    .line 1044
    const/4 v5, 0x0

    .line 1045
    iput-boolean v5, v1, Lx4/v;->L:Z

    .line 1046
    .line 1047
    invoke-virtual {v1, v2, v3}, Lx4/v;->a(J)V

    .line 1048
    .line 1049
    .line 1050
    iget-object v5, v1, Lx4/v;->r:Lr/y1;

    .line 1051
    .line 1052
    if-eqz v5, :cond_36

    .line 1053
    .line 1054
    cmp-long v10, v7, v18

    .line 1055
    .line 1056
    if-eqz v10, :cond_36

    .line 1057
    .line 1058
    iget-object v5, v5, Lr/y1;->b:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v5, Lx4/x;

    .line 1061
    .line 1062
    iput-boolean v6, v5, Lx4/x;->c1:Z

    .line 1063
    .line 1064
    :cond_36
    iget-object v5, v1, Lx4/v;->t:Lx4/q;

    .line 1065
    .line 1066
    iget v5, v5, Lx4/q;->c:I

    .line 1067
    .line 1068
    if-nez v5, :cond_37

    .line 1069
    .line 1070
    iget-wide v7, v1, Lx4/v;->G:J

    .line 1071
    .line 1072
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 1073
    .line 1074
    .line 1075
    move-result v5

    .line 1076
    int-to-long v10, v5

    .line 1077
    add-long/2addr v7, v10

    .line 1078
    iput-wide v7, v1, Lx4/v;->G:J

    .line 1079
    .line 1080
    goto :goto_1a

    .line 1081
    :cond_37
    iget-wide v7, v1, Lx4/v;->H:J

    .line 1082
    .line 1083
    iget v5, v1, Lx4/v;->K:I

    .line 1084
    .line 1085
    int-to-long v10, v5

    .line 1086
    int-to-long v12, v4

    .line 1087
    mul-long v10, v10, v12

    .line 1088
    .line 1089
    add-long/2addr v10, v7

    .line 1090
    iput-wide v10, v1, Lx4/v;->H:J

    .line 1091
    .line 1092
    :goto_1a
    iput-object v0, v1, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 1093
    .line 1094
    iput v4, v1, Lx4/v;->Q:I

    .line 1095
    .line 1096
    :cond_38
    invoke-virtual {v1, v2, v3}, Lx4/v;->t(J)V

    .line 1097
    .line 1098
    .line 1099
    iget-object v0, v1, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 1100
    .line 1101
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 1102
    .line 1103
    .line 1104
    move-result v0

    .line 1105
    if-nez v0, :cond_39

    .line 1106
    .line 1107
    const/4 v15, 0x0

    .line 1108
    iput-object v15, v1, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 1109
    .line 1110
    const/4 v5, 0x0

    .line 1111
    iput v5, v1, Lx4/v;->Q:I

    .line 1112
    .line 1113
    return v6

    .line 1114
    :cond_39
    invoke-virtual {v1}, Lx4/v;->k()J

    .line 1115
    .line 1116
    .line 1117
    move-result-wide v2

    .line 1118
    iget-wide v4, v9, Lx4/n;->y:J

    .line 1119
    .line 1120
    cmp-long v0, v4, v16

    .line 1121
    .line 1122
    if-eqz v0, :cond_2

    .line 1123
    .line 1124
    cmp-long v0, v2, v18

    .line 1125
    .line 1126
    if-lez v0, :cond_2

    .line 1127
    .line 1128
    iget-object v0, v9, Lx4/n;->I:Lp4/v;

    .line 1129
    .line 1130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v2

    .line 1137
    iget-wide v4, v9, Lx4/n;->y:J

    .line 1138
    .line 1139
    sub-long/2addr v2, v4

    .line 1140
    const-wide/16 v4, 0xc8

    .line 1141
    .line 1142
    cmp-long v0, v2, v4

    .line 1143
    .line 1144
    if-ltz v0, :cond_2

    .line 1145
    .line 1146
    const-string v0, "DefaultAudioSink"

    .line 1147
    .line 1148
    const-string v2, "Resetting stalled audio track"

    .line 1149
    .line 1150
    invoke-static {v0, v2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v1}, Lx4/v;->g()V

    .line 1154
    .line 1155
    .line 1156
    return v6

    .line 1157
    :goto_1b
    return v21

    .line 1158
    nop

    .line 1159
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
.end method

.method public final m()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx4/v;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Lp4/c0;->a:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-static {v0}, Lu2/b;->s(Landroid/media/AudioTrack;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lx4/v;->U:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lx4/v;->g:Lx4/n;

    .line 26
    .line 27
    invoke-virtual {p0}, Lx4/v;->k()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, Lx4/n;->d(J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
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
.end method

.method public final n()Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lx4/v;->l:Lr/c2;

    .line 4
    .line 5
    iget-object v2, v0, Lr/c2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Exception;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    sget-object v2, Lx4/v;->j0:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    sget v5, Lx4/v;->l0:I

    .line 18
    .line 19
    if-lez v5, :cond_1

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v5, 0x0

    .line 24
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v5, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    iget-wide v7, v0, Lr/c2;->b:J

    .line 33
    .line 34
    cmp-long v0, v5, v7

    .line 35
    .line 36
    if-gez v0, :cond_3

    .line 37
    .line 38
    :goto_1
    return v3

    .line 39
    :cond_3
    :goto_2
    :try_start_1
    iget-object v0, v1, Lx4/v;->t:Lx4/q;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lx4/v;->c(Lx4/q;)Landroid/media/AudioTrack;

    .line 45
    .line 46
    .line 47
    move-result-object v0
    :try_end_1
    .catch Lx4/j; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    goto :goto_3

    .line 49
    :catch_0
    move-exception v0

    .line 50
    move-object v2, v0

    .line 51
    iget-object v0, v1, Lx4/v;->t:Lx4/q;

    .line 52
    .line 53
    iget v5, v0, Lx4/q;->h:I

    .line 54
    .line 55
    const v6, 0xf4240

    .line 56
    .line 57
    .line 58
    if-le v5, v6, :cond_f

    .line 59
    .line 60
    new-instance v7, Lx4/q;

    .line 61
    .line 62
    iget-object v8, v0, Lx4/q;->a:Lm4/q;

    .line 63
    .line 64
    iget v9, v0, Lx4/q;->b:I

    .line 65
    .line 66
    iget v10, v0, Lx4/q;->c:I

    .line 67
    .line 68
    iget v11, v0, Lx4/q;->d:I

    .line 69
    .line 70
    iget v12, v0, Lx4/q;->e:I

    .line 71
    .line 72
    iget v13, v0, Lx4/q;->f:I

    .line 73
    .line 74
    iget v14, v0, Lx4/q;->g:I

    .line 75
    .line 76
    iget-object v5, v0, Lx4/q;->i:Ln4/c;

    .line 77
    .line 78
    iget-boolean v6, v0, Lx4/q;->j:Z

    .line 79
    .line 80
    iget-boolean v15, v0, Lx4/q;->k:Z

    .line 81
    .line 82
    iget-boolean v0, v0, Lx4/q;->l:Z

    .line 83
    .line 84
    move/from16 v18, v15

    .line 85
    .line 86
    const v15, 0xf4240

    .line 87
    .line 88
    .line 89
    move/from16 v19, v0

    .line 90
    .line 91
    move-object/from16 v16, v5

    .line 92
    .line 93
    move/from16 v17, v6

    .line 94
    .line 95
    invoke-direct/range {v7 .. v19}, Lx4/q;-><init>(Lm4/q;IIIIIIILn4/c;ZZZ)V

    .line 96
    .line 97
    .line 98
    :try_start_2
    invoke-virtual {v1, v7}, Lx4/v;->c(Lx4/q;)Landroid/media/AudioTrack;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v7, v1, Lx4/v;->t:Lx4/q;
    :try_end_2
    .catch Lx4/j; {:try_start_2 .. :try_end_2} :catch_1

    .line 103
    .line 104
    :goto_3
    iput-object v0, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 105
    .line 106
    invoke-static {v0}, Lx4/v;->p(Landroid/media/AudioTrack;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    iget-object v0, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 113
    .line 114
    iget-object v2, v1, Lx4/v;->k:Ltc/b0;

    .line 115
    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    new-instance v2, Ltc/b0;

    .line 119
    .line 120
    invoke-direct {v2, v1}, Ltc/b0;-><init>(Lx4/v;)V

    .line 121
    .line 122
    .line 123
    iput-object v2, v1, Lx4/v;->k:Ltc/b0;

    .line 124
    .line 125
    :cond_4
    iget-object v2, v1, Lx4/v;->k:Ltc/b0;

    .line 126
    .line 127
    iget-object v5, v2, Ltc/b0;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Landroid/os/Handler;

    .line 130
    .line 131
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    new-instance v6, Lb7/k1;

    .line 135
    .line 136
    const/4 v7, 0x1

    .line 137
    invoke-direct {v6, v5, v7}, Lb7/k1;-><init>(Landroid/os/Handler;I)V

    .line 138
    .line 139
    .line 140
    iget-object v2, v2, Ltc/b0;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, Lx4/u;

    .line 143
    .line 144
    invoke-static {v0, v6, v2}, Lx4/t;->b(Landroid/media/AudioTrack;Lb7/k1;Lx4/u;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, v1, Lx4/v;->t:Lx4/q;

    .line 148
    .line 149
    iget-boolean v2, v0, Lx4/q;->k:Z

    .line 150
    .line 151
    if-eqz v2, :cond_5

    .line 152
    .line 153
    iget-object v2, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 154
    .line 155
    iget-object v0, v0, Lx4/q;->a:Lm4/q;

    .line 156
    .line 157
    iget v5, v0, Lm4/q;->G:I

    .line 158
    .line 159
    iget v0, v0, Lm4/q;->H:I

    .line 160
    .line 161
    invoke-static {v2, v5, v0}, Lu2/b;->o(Landroid/media/AudioTrack;II)V

    .line 162
    .line 163
    .line 164
    :cond_5
    sget v0, Lp4/c0;->a:I

    .line 165
    .line 166
    const/16 v2, 0x1f

    .line 167
    .line 168
    if-lt v0, v2, :cond_6

    .line 169
    .line 170
    iget-object v2, v1, Lx4/v;->q:Lw4/k;

    .line 171
    .line 172
    if-eqz v2, :cond_6

    .line 173
    .line 174
    iget-object v5, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 175
    .line 176
    iget-object v2, v2, Lw4/k;->b:Lw4/j;

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v2, v2, Lw4/j;->a:Landroid/media/metrics/LogSessionId;

    .line 182
    .line 183
    invoke-static {}, Lp4/a0;->d()Landroid/media/metrics/LogSessionId;

    .line 184
    .line 185
    .line 186
    invoke-static {v2}, Lw4/h;->i(Landroid/media/metrics/LogSessionId;)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-nez v6, :cond_6

    .line 191
    .line 192
    invoke-static {v5, v2}, Lw4/h;->e(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    iget-object v2, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 196
    .line 197
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    iput v2, v1, Lx4/v;->X:I

    .line 202
    .line 203
    iget-object v2, v1, Lx4/v;->g:Lx4/n;

    .line 204
    .line 205
    iget-object v5, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 206
    .line 207
    iget-object v6, v1, Lx4/v;->t:Lx4/q;

    .line 208
    .line 209
    iget v7, v6, Lx4/q;->c:I

    .line 210
    .line 211
    const/4 v8, 0x2

    .line 212
    if-ne v7, v8, :cond_7

    .line 213
    .line 214
    const/4 v7, 0x1

    .line 215
    goto :goto_4

    .line 216
    :cond_7
    const/4 v7, 0x0

    .line 217
    :goto_4
    iget v8, v6, Lx4/q;->g:I

    .line 218
    .line 219
    iget v9, v6, Lx4/q;->d:I

    .line 220
    .line 221
    iget v6, v6, Lx4/q;->h:I

    .line 222
    .line 223
    iput-object v5, v2, Lx4/n;->c:Landroid/media/AudioTrack;

    .line 224
    .line 225
    iput v6, v2, Lx4/n;->d:I

    .line 226
    .line 227
    new-instance v10, Lx4/m;

    .line 228
    .line 229
    invoke-direct {v10, v5}, Lx4/m;-><init>(Landroid/media/AudioTrack;)V

    .line 230
    .line 231
    .line 232
    iput-object v10, v2, Lx4/n;->e:Lx4/m;

    .line 233
    .line 234
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    iput v5, v2, Lx4/n;->f:I

    .line 239
    .line 240
    const/16 v5, 0x17

    .line 241
    .line 242
    if-eqz v7, :cond_9

    .line 243
    .line 244
    if-ge v0, v5, :cond_9

    .line 245
    .line 246
    const/4 v7, 0x5

    .line 247
    if-eq v8, v7, :cond_8

    .line 248
    .line 249
    const/4 v7, 0x6

    .line 250
    if-ne v8, v7, :cond_9

    .line 251
    .line 252
    :cond_8
    const/4 v7, 0x1

    .line 253
    goto :goto_5

    .line 254
    :cond_9
    const/4 v7, 0x0

    .line 255
    :goto_5
    iput-boolean v7, v2, Lx4/n;->g:Z

    .line 256
    .line 257
    invoke-static {v8}, Lp4/c0;->I(I)Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    iput-boolean v7, v2, Lx4/n;->p:Z

    .line 262
    .line 263
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    if-eqz v7, :cond_a

    .line 269
    .line 270
    div-int/2addr v6, v9

    .line 271
    int-to-long v6, v6

    .line 272
    iget v8, v2, Lx4/n;->f:I

    .line 273
    .line 274
    invoke-static {v8, v6, v7}, Lp4/c0;->T(IJ)J

    .line 275
    .line 276
    .line 277
    move-result-wide v6

    .line 278
    goto :goto_6

    .line 279
    :cond_a
    move-wide v6, v10

    .line 280
    :goto_6
    iput-wide v6, v2, Lx4/n;->h:J

    .line 281
    .line 282
    const-wide/16 v6, 0x0

    .line 283
    .line 284
    iput-wide v6, v2, Lx4/n;->s:J

    .line 285
    .line 286
    iput-wide v6, v2, Lx4/n;->t:J

    .line 287
    .line 288
    iput-boolean v3, v2, Lx4/n;->G:Z

    .line 289
    .line 290
    iput-wide v6, v2, Lx4/n;->H:J

    .line 291
    .line 292
    iput-wide v6, v2, Lx4/n;->u:J

    .line 293
    .line 294
    iput-boolean v3, v2, Lx4/n;->o:Z

    .line 295
    .line 296
    iput-wide v10, v2, Lx4/n;->x:J

    .line 297
    .line 298
    iput-wide v10, v2, Lx4/n;->y:J

    .line 299
    .line 300
    iput-wide v6, v2, Lx4/n;->q:J

    .line 301
    .line 302
    iput-wide v6, v2, Lx4/n;->n:J

    .line 303
    .line 304
    const/high16 v3, 0x3f800000    # 1.0f

    .line 305
    .line 306
    iput v3, v2, Lx4/n;->i:F

    .line 307
    .line 308
    invoke-virtual {v1}, Lx4/v;->o()Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_b

    .line 313
    .line 314
    iget-object v2, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 315
    .line 316
    iget v3, v1, Lx4/v;->O:F

    .line 317
    .line 318
    invoke-virtual {v2, v3}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 319
    .line 320
    .line 321
    :cond_b
    iget-object v2, v1, Lx4/v;->Y:Lm4/e;

    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-object v2, v1, Lx4/v;->Z:Lr/y1;

    .line 327
    .line 328
    if-eqz v2, :cond_c

    .line 329
    .line 330
    if-lt v0, v5, :cond_c

    .line 331
    .line 332
    iget-object v3, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 333
    .line 334
    iget-object v2, v2, Lr/y1;->b:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 337
    .line 338
    invoke-static {v3, v2}, Lv3/b;->r(Landroid/media/AudioTrack;Landroid/media/AudioDeviceInfo;)V

    .line 339
    .line 340
    .line 341
    iget-object v2, v1, Lx4/v;->x:Lx4/e;

    .line 342
    .line 343
    if-eqz v2, :cond_c

    .line 344
    .line 345
    iget-object v3, v1, Lx4/v;->Z:Lr/y1;

    .line 346
    .line 347
    iget-object v3, v3, Lr/y1;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 350
    .line 351
    invoke-virtual {v2, v3}, Lx4/e;->b(Landroid/media/AudioDeviceInfo;)V

    .line 352
    .line 353
    .line 354
    :cond_c
    const/16 v2, 0x18

    .line 355
    .line 356
    if-lt v0, v2, :cond_d

    .line 357
    .line 358
    iget-object v0, v1, Lx4/v;->x:Lx4/e;

    .line 359
    .line 360
    if-eqz v0, :cond_d

    .line 361
    .line 362
    new-instance v2, Ltc/b0;

    .line 363
    .line 364
    iget-object v3, v1, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 365
    .line 366
    invoke-direct {v2, v3, v0}, Ltc/b0;-><init>(Landroid/media/AudioTrack;Lx4/e;)V

    .line 367
    .line 368
    .line 369
    iput-object v2, v1, Lx4/v;->y:Ltc/b0;

    .line 370
    .line 371
    :cond_d
    iput-boolean v4, v1, Lx4/v;->M:Z

    .line 372
    .line 373
    iget-object v0, v1, Lx4/v;->r:Lr/y1;

    .line 374
    .line 375
    if-eqz v0, :cond_e

    .line 376
    .line 377
    iget-object v2, v1, Lx4/v;->t:Lx4/q;

    .line 378
    .line 379
    invoke-virtual {v2}, Lx4/q;->a()Lr5/c;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    iget-object v0, v0, Lr/y1;->b:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Lx4/x;

    .line 386
    .line 387
    iget-object v0, v0, Lx4/x;->T0:Lp5/y;

    .line 388
    .line 389
    iget-object v3, v0, Lp5/y;->b:Landroid/os/Handler;

    .line 390
    .line 391
    if-eqz v3, :cond_e

    .line 392
    .line 393
    new-instance v5, Lx4/g;

    .line 394
    .line 395
    const/4 v6, 0x1

    .line 396
    invoke-direct {v5, v0, v2, v6}, Lx4/g;-><init>(Lp5/y;Ljava/lang/Object;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 400
    .line 401
    .line 402
    :cond_e
    return v4

    .line 403
    :catch_1
    move-exception v0

    .line 404
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 405
    .line 406
    .line 407
    :cond_f
    iget-object v0, v1, Lx4/v;->t:Lx4/q;

    .line 408
    .line 409
    iget v0, v0, Lx4/q;->c:I

    .line 410
    .line 411
    if-ne v0, v4, :cond_10

    .line 412
    .line 413
    iput-boolean v4, v1, Lx4/v;->d0:Z

    .line 414
    .line 415
    :cond_10
    throw v2

    .line 416
    :catchall_0
    move-exception v0

    .line 417
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 418
    throw v0
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public final q()V
    .locals 6

    .line 1
    iget-object v0, p0, Lx4/v;->x:Lx4/e;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lx4/v;->a:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lx4/v;->f0:Landroid/os/Looper;

    .line 14
    .line 15
    new-instance v1, Lx4/e;

    .line 16
    .line 17
    new-instance v2, Ly6/c0;

    .line 18
    .line 19
    invoke-direct {v2, p0}, Ly6/c0;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lx4/v;->z:Lm4/d;

    .line 23
    .line 24
    iget-object v4, p0, Lx4/v;->Z:Lr/y1;

    .line 25
    .line 26
    invoke-direct {v1, v0, v2, v3, v4}, Lx4/e;-><init>(Landroid/content/Context;Ly6/c0;Lm4/d;Lr/y1;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lx4/v;->x:Lx4/e;

    .line 30
    .line 31
    iget-boolean v0, v1, Lx4/e;->j:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v0, v1, Lx4/e;->g:Lx4/b;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, v1, Lx4/e;->j:Z

    .line 43
    .line 44
    iget-object v0, v1, Lx4/e;->f:Lx4/d;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v2, v0, Lx4/d;->a:Landroid/content/ContentResolver;

    .line 49
    .line 50
    iget-object v3, v0, Lx4/d;->b:Landroid/net/Uri;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-virtual {v2, v3, v4, v0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    sget v0, Lp4/c0;->a:I

    .line 57
    .line 58
    const/16 v2, 0x17

    .line 59
    .line 60
    iget-object v3, v1, Lx4/e;->c:Landroid/os/Handler;

    .line 61
    .line 62
    iget-object v4, v1, Lx4/e;->a:Landroid/content/Context;

    .line 63
    .line 64
    if-lt v0, v2, :cond_2

    .line 65
    .line 66
    iget-object v0, v1, Lx4/e;->d:Lx4/c;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    const-string v2, "audio"

    .line 71
    .line 72
    invoke-virtual {v4, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Landroid/media/AudioManager;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v0, v3}, Lv3/b;->q(Landroid/media/AudioManager;Lx4/c;Landroid/os/Handler;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    new-instance v0, Landroid/content/IntentFilter;

    .line 85
    .line 86
    const-string v2, "android.media.action.HDMI_AUDIO_PLUG"

    .line 87
    .line 88
    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    iget-object v5, v1, Lx4/e;->e:Lb7/m2;

    .line 93
    .line 94
    invoke-virtual {v4, v5, v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v2, v1, Lx4/e;->i:Lm4/d;

    .line 99
    .line 100
    iget-object v3, v1, Lx4/e;->h:Lr/y1;

    .line 101
    .line 102
    invoke-static {v4, v0, v2, v3}, Lx4/b;->b(Landroid/content/Context;Landroid/content/Intent;Lm4/d;Lr/y1;)Lx4/b;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, v1, Lx4/e;->g:Lx4/b;

    .line 107
    .line 108
    :goto_0
    iput-object v0, p0, Lx4/v;->w:Lx4/b;

    .line 109
    .line 110
    :cond_3
    iget-object v0, p0, Lx4/v;->w:Lx4/b;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final r()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx4/v;->V:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lx4/v;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lx4/v;->g:Lx4/n;

    .line 11
    .line 12
    iget-wide v1, v0, Lx4/n;->x:J

    .line 13
    .line 14
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v5, v1, v3

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, Lx4/n;->I:Lp4/v;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {v1, v2}, Lp4/c0;->N(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    iput-wide v1, v0, Lx4/n;->x:J

    .line 37
    .line 38
    :cond_0
    iget-object v0, v0, Lx4/n;->e:Lx4/m;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lx4/m;->a()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
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

.method public final s()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lx4/v;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lx4/v;->T:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lx4/v;->k()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lx4/v;->g:Lx4/n;

    .line 13
    .line 14
    invoke-virtual {v2}, Lx4/n;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iput-wide v3, v2, Lx4/n;->z:J

    .line 19
    .line 20
    iget-object v3, v2, Lx4/n;->I:Lp4/v;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    invoke-static {v3, v4}, Lp4/c0;->N(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iput-wide v3, v2, Lx4/n;->x:J

    .line 34
    .line 35
    iput-wide v0, v2, Lx4/n;->A:J

    .line 36
    .line 37
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-static {v0}, Lx4/v;->p(Landroid/media/AudioTrack;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iput-boolean v1, p0, Lx4/v;->U:Z

    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 51
    .line 52
    .line 53
    iput v1, p0, Lx4/v;->F:I

    .line 54
    .line 55
    :cond_1
    return-void
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

.method public final t(J)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lx4/v;->e(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Ln4/c;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lx4/v;->w(Ljava/nio/ByteBuffer;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lx4/v;->e(J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 30
    .line 31
    invoke-virtual {v0}, Ln4/c;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_8

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 38
    .line 39
    invoke-virtual {v0}, Ln4/c;->d()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    sget-object v0, Ln4/f;->a:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    iget-object v1, v0, Ln4/c;->c:[Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ln4/c;->b()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aget-object v1, v1, v2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    sget-object v1, Ln4/f;->a:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ln4/c;->e(Ljava/nio/ByteBuffer;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Ln4/c;->c:[Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v0}, Ln4/c;->b()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    aget-object v0, v1, v0

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lx4/v;->w(Ljava/nio/ByteBuffer;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, Lx4/v;->e(J)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    iget-object v0, p0, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 106
    .line 107
    iget-object v1, p0, Lx4/v;->P:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {v0}, Ln4/c;->d()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    iget-boolean v2, v0, Ln4/c;->d:Z

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_7
    invoke-virtual {v0, v1}, Ln4/c;->e(Ljava/nio/ByteBuffer;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    :goto_2
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final u()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lx4/v;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx4/v;->e:Lya/a1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lya/i0;->s(I)Lya/g0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-virtual {v0}, Lya/g0;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lya/g0;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ln4/f;

    .line 22
    .line 23
    invoke-interface {v2}, Ln4/f;->reset()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lx4/v;->f:Lya/a1;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lya/i0;->s(I)Lya/g0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_1
    invoke-virtual {v0}, Lya/g0;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lya/g0;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ln4/f;

    .line 44
    .line 45
    invoke-interface {v2}, Ln4/f;->reset()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v0, p0, Lx4/v;->u:Ln4/c;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v2, v0, Ln4/c;->a:Lya/i0;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    :goto_2
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ge v3, v4, :cond_2

    .line 61
    .line 62
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ln4/f;

    .line 67
    .line 68
    invoke-interface {v4}, Ln4/f;->flush()V

    .line 69
    .line 70
    .line 71
    invoke-interface {v4}, Ln4/f;->reset()V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    new-array v2, v1, [Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    iput-object v2, v0, Ln4/c;->c:[Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    sget-object v2, Ln4/d;->e:Ln4/d;

    .line 82
    .line 83
    iput-boolean v1, v0, Ln4/c;->d:Z

    .line 84
    .line 85
    :cond_3
    iput-boolean v1, p0, Lx4/v;->V:Z

    .line 86
    .line 87
    iput-boolean v1, p0, Lx4/v;->d0:Z

    .line 88
    .line 89
    return-void
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

.method public final v()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx4/v;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lv3/b;->k()Landroid/media/PlaybackParams;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lv3/b;->m(Landroid/media/PlaybackParams;)Landroid/media/PlaybackParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lx4/v;->C:Lm4/s0;

    .line 16
    .line 17
    iget v1, v1, Lm4/s0;->a:F

    .line 18
    .line 19
    invoke-static {v0, v1}, Lv3/b;->n(Landroid/media/PlaybackParams;F)Landroid/media/PlaybackParams;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lx4/v;->C:Lm4/s0;

    .line 24
    .line 25
    iget v1, v1, Lm4/s0;->b:F

    .line 26
    .line 27
    invoke-static {v0, v1}, Lv3/b;->z(Landroid/media/PlaybackParams;F)Landroid/media/PlaybackParams;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lv3/b;->y(Landroid/media/PlaybackParams;)Landroid/media/PlaybackParams;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :try_start_0
    iget-object v1, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lv3/b;->s(Landroid/media/AudioTrack;Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    const-string v1, "DefaultAudioSink"

    .line 43
    .line 44
    const-string v2, "Failed to set playback params"

    .line 45
    .line 46
    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    new-instance v0, Lm4/s0;

    .line 50
    .line 51
    iget-object v1, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 52
    .line 53
    invoke-static {v1}, Lv3/b;->l(Landroid/media/AudioTrack;)Landroid/media/PlaybackParams;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lv3/b;->a(Landroid/media/PlaybackParams;)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v2, p0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 62
    .line 63
    invoke-static {v2}, Lv3/b;->l(Landroid/media/AudioTrack;)Landroid/media/PlaybackParams;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Lv3/b;->w(Landroid/media/PlaybackParams;)F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-direct {v0, v1, v2}, Lm4/s0;-><init>(FF)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lx4/v;->C:Lm4/s0;

    .line 75
    .line 76
    iget v0, v0, Lm4/s0;->a:F

    .line 77
    .line 78
    iget-object v1, p0, Lx4/v;->g:Lx4/n;

    .line 79
    .line 80
    iput v0, v1, Lx4/n;->i:F

    .line 81
    .line 82
    iget-object v0, v1, Lx4/n;->e:Lx4/m;

    .line 83
    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    invoke-virtual {v0}, Lx4/m;->a()V

    .line 87
    .line 88
    .line 89
    :cond_0
    invoke-virtual {v1}, Lx4/n;->e()V

    .line 90
    .line 91
    .line 92
    :cond_1
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public final w(Ljava/nio/ByteBuffer;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v1, v0, Lx4/v;->t:Lx4/q;

    .line 21
    .line 22
    iget v1, v1, Lx4/q;->c:I

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const-wide/16 v1, 0x14

    .line 28
    .line 29
    invoke-static {v1, v2}, Lp4/c0;->N(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iget-object v1, v0, Lx4/v;->t:Lx4/q;

    .line 34
    .line 35
    iget v1, v1, Lx4/q;->e:I

    .line 36
    .line 37
    int-to-long v5, v1

    .line 38
    const-wide/32 v7, 0xf4240

    .line 39
    .line 40
    .line 41
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 42
    .line 43
    invoke-static/range {v3 .. v9}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    long-to-int v2, v1

    .line 48
    invoke-virtual {v0}, Lx4/v;->k()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    int-to-long v5, v2

    .line 53
    cmp-long v1, v3, v5

    .line 54
    .line 55
    if-ltz v1, :cond_3

    .line 56
    .line 57
    :goto_1
    move-object/from16 v3, p1

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_3
    iget-object v1, v0, Lx4/v;->t:Lx4/q;

    .line 62
    .line 63
    iget v7, v1, Lx4/q;->g:I

    .line 64
    .line 65
    iget v1, v1, Lx4/q;->d:I

    .line 66
    .line 67
    long-to-int v4, v3

    .line 68
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_17

    .line 93
    .line 94
    if-ge v4, v2, :cond_17

    .line 95
    .line 96
    const/high16 v12, 0x50000000

    .line 97
    .line 98
    const/high16 v13, 0x10000000

    .line 99
    .line 100
    const/16 v14, 0x16

    .line 101
    .line 102
    const/16 v15, 0x15

    .line 103
    .line 104
    const/high16 v16, 0x4f000000

    .line 105
    .line 106
    const/4 v9, 0x4

    .line 107
    const/high16 v17, -0x31000000

    .line 108
    .line 109
    const/4 v10, 0x3

    .line 110
    const/4 v11, 0x2

    .line 111
    if-eq v7, v11, :cond_d

    .line 112
    .line 113
    if-eq v7, v10, :cond_c

    .line 114
    .line 115
    if-eq v7, v9, :cond_a

    .line 116
    .line 117
    if-eq v7, v15, :cond_9

    .line 118
    .line 119
    if-eq v7, v14, :cond_8

    .line 120
    .line 121
    if-eq v7, v13, :cond_7

    .line 122
    .line 123
    if-eq v7, v12, :cond_6

    .line 124
    .line 125
    const/high16 v12, 0x60000000

    .line 126
    .line 127
    if-ne v7, v12, :cond_5

    .line 128
    .line 129
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    and-int/lit16 v12, v12, 0xff

    .line 134
    .line 135
    shl-int/lit8 v12, v12, 0x18

    .line 136
    .line 137
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    and-int/lit16 v13, v13, 0xff

    .line 142
    .line 143
    shl-int/lit8 v13, v13, 0x10

    .line 144
    .line 145
    or-int/2addr v12, v13

    .line 146
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    and-int/lit16 v13, v13, 0xff

    .line 151
    .line 152
    shl-int/lit8 v13, v13, 0x8

    .line 153
    .line 154
    or-int/2addr v12, v13

    .line 155
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    and-int/lit16 v13, v13, 0xff

    .line 160
    .line 161
    :goto_3
    or-int/2addr v12, v13

    .line 162
    goto/16 :goto_6

    .line 163
    .line 164
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 167
    .line 168
    .line 169
    throw v1

    .line 170
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    and-int/lit16 v12, v12, 0xff

    .line 175
    .line 176
    shl-int/lit8 v12, v12, 0x18

    .line 177
    .line 178
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    and-int/lit16 v13, v13, 0xff

    .line 183
    .line 184
    shl-int/lit8 v13, v13, 0x10

    .line 185
    .line 186
    or-int/2addr v12, v13

    .line 187
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    and-int/lit16 v13, v13, 0xff

    .line 192
    .line 193
    shl-int/lit8 v13, v13, 0x8

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    and-int/lit16 v12, v12, 0xff

    .line 201
    .line 202
    shl-int/lit8 v12, v12, 0x18

    .line 203
    .line 204
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    and-int/lit16 v13, v13, 0xff

    .line 209
    .line 210
    shl-int/lit8 v13, v13, 0x10

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    and-int/lit16 v12, v12, 0xff

    .line 218
    .line 219
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    and-int/lit16 v13, v13, 0xff

    .line 224
    .line 225
    shl-int/lit8 v13, v13, 0x8

    .line 226
    .line 227
    or-int/2addr v12, v13

    .line 228
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    and-int/lit16 v13, v13, 0xff

    .line 233
    .line 234
    shl-int/lit8 v13, v13, 0x10

    .line 235
    .line 236
    or-int/2addr v12, v13

    .line 237
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    :goto_4
    and-int/lit16 v13, v13, 0xff

    .line 242
    .line 243
    shl-int/lit8 v13, v13, 0x18

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    and-int/lit16 v12, v12, 0xff

    .line 251
    .line 252
    shl-int/lit8 v12, v12, 0x8

    .line 253
    .line 254
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    and-int/lit16 v13, v13, 0xff

    .line 259
    .line 260
    shl-int/lit8 v13, v13, 0x10

    .line 261
    .line 262
    or-int/2addr v12, v13

    .line 263
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    goto :goto_4

    .line 268
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    const/high16 v13, -0x40800000    # -1.0f

    .line 273
    .line 274
    const/high16 v14, 0x3f800000    # 1.0f

    .line 275
    .line 276
    invoke-static {v12, v13, v14}, Lp4/c0;->h(FFF)F

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    const/4 v13, 0x0

    .line 281
    cmpg-float v13, v12, v13

    .line 282
    .line 283
    if-gez v13, :cond_b

    .line 284
    .line 285
    neg-float v12, v12

    .line 286
    mul-float v12, v12, v17

    .line 287
    .line 288
    :goto_5
    float-to-int v12, v12

    .line 289
    goto :goto_6

    .line 290
    :cond_b
    mul-float v12, v12, v16

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 294
    .line 295
    .line 296
    move-result v12

    .line 297
    and-int/lit16 v12, v12, 0xff

    .line 298
    .line 299
    shl-int/lit8 v12, v12, 0x18

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 303
    .line 304
    .line 305
    move-result v12

    .line 306
    and-int/lit16 v12, v12, 0xff

    .line 307
    .line 308
    shl-int/lit8 v12, v12, 0x10

    .line 309
    .line 310
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 311
    .line 312
    .line 313
    move-result v13

    .line 314
    goto :goto_4

    .line 315
    :goto_6
    int-to-long v12, v12

    .line 316
    int-to-long v9, v4

    .line 317
    mul-long v12, v12, v9

    .line 318
    .line 319
    div-long/2addr v12, v5

    .line 320
    long-to-int v9, v12

    .line 321
    if-eq v7, v11, :cond_16

    .line 322
    .line 323
    const/4 v10, 0x3

    .line 324
    if-eq v7, v10, :cond_15

    .line 325
    .line 326
    const/4 v14, 0x4

    .line 327
    if-eq v7, v14, :cond_13

    .line 328
    .line 329
    if-eq v7, v15, :cond_12

    .line 330
    .line 331
    const/16 v10, 0x16

    .line 332
    .line 333
    if-eq v7, v10, :cond_11

    .line 334
    .line 335
    const/high16 v10, 0x10000000

    .line 336
    .line 337
    if-eq v7, v10, :cond_10

    .line 338
    .line 339
    const/high16 v10, 0x50000000

    .line 340
    .line 341
    if-eq v7, v10, :cond_f

    .line 342
    .line 343
    const/high16 v12, 0x60000000

    .line 344
    .line 345
    if-ne v7, v12, :cond_e

    .line 346
    .line 347
    shr-int/lit8 v10, v9, 0x18

    .line 348
    .line 349
    int-to-byte v10, v10

    .line 350
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 351
    .line 352
    .line 353
    shr-int/lit8 v10, v9, 0x10

    .line 354
    .line 355
    int-to-byte v10, v10

    .line 356
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 357
    .line 358
    .line 359
    shr-int/lit8 v10, v9, 0x8

    .line 360
    .line 361
    int-to-byte v10, v10

    .line 362
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 363
    .line 364
    .line 365
    int-to-byte v9, v9

    .line 366
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 367
    .line 368
    .line 369
    goto/16 :goto_7

    .line 370
    .line 371
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 372
    .line 373
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 374
    .line 375
    .line 376
    throw v1

    .line 377
    :cond_f
    shr-int/lit8 v10, v9, 0x18

    .line 378
    .line 379
    int-to-byte v10, v10

    .line 380
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 381
    .line 382
    .line 383
    shr-int/lit8 v10, v9, 0x10

    .line 384
    .line 385
    int-to-byte v10, v10

    .line 386
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 387
    .line 388
    .line 389
    shr-int/lit8 v9, v9, 0x8

    .line 390
    .line 391
    int-to-byte v9, v9

    .line 392
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 393
    .line 394
    .line 395
    goto :goto_7

    .line 396
    :cond_10
    shr-int/lit8 v10, v9, 0x18

    .line 397
    .line 398
    int-to-byte v10, v10

    .line 399
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 400
    .line 401
    .line 402
    shr-int/lit8 v9, v9, 0x10

    .line 403
    .line 404
    int-to-byte v9, v9

    .line 405
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 406
    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_11
    int-to-byte v10, v9

    .line 410
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    .line 413
    shr-int/lit8 v10, v9, 0x8

    .line 414
    .line 415
    int-to-byte v10, v10

    .line 416
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 417
    .line 418
    .line 419
    shr-int/lit8 v10, v9, 0x10

    .line 420
    .line 421
    int-to-byte v10, v10

    .line 422
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 423
    .line 424
    .line 425
    shr-int/lit8 v9, v9, 0x18

    .line 426
    .line 427
    int-to-byte v9, v9

    .line 428
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_12
    shr-int/lit8 v10, v9, 0x8

    .line 433
    .line 434
    int-to-byte v10, v10

    .line 435
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 436
    .line 437
    .line 438
    shr-int/lit8 v10, v9, 0x10

    .line 439
    .line 440
    int-to-byte v10, v10

    .line 441
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 442
    .line 443
    .line 444
    shr-int/lit8 v9, v9, 0x18

    .line 445
    .line 446
    int-to-byte v9, v9

    .line 447
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 448
    .line 449
    .line 450
    goto :goto_7

    .line 451
    :cond_13
    if-gez v9, :cond_14

    .line 452
    .line 453
    int-to-float v9, v9

    .line 454
    neg-float v9, v9

    .line 455
    div-float v9, v9, v17

    .line 456
    .line 457
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 458
    .line 459
    .line 460
    goto :goto_7

    .line 461
    :cond_14
    int-to-float v9, v9

    .line 462
    div-float v9, v9, v16

    .line 463
    .line 464
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 465
    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_15
    shr-int/lit8 v9, v9, 0x18

    .line 469
    .line 470
    int-to-byte v9, v9

    .line 471
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 472
    .line 473
    .line 474
    goto :goto_7

    .line 475
    :cond_16
    shr-int/lit8 v10, v9, 0x10

    .line 476
    .line 477
    int-to-byte v10, v10

    .line 478
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 479
    .line 480
    .line 481
    shr-int/lit8 v9, v9, 0x18

    .line 482
    .line 483
    int-to-byte v9, v9

    .line 484
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 485
    .line 486
    .line 487
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 488
    .line 489
    .line 490
    move-result v9

    .line 491
    add-int v10, v8, v1

    .line 492
    .line 493
    if-ne v9, v10, :cond_4

    .line 494
    .line 495
    add-int/lit8 v4, v4, 0x1

    .line 496
    .line 497
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 498
    .line 499
    .line 500
    move-result v8

    .line 501
    goto/16 :goto_2

    .line 502
    .line 503
    :cond_17
    move-object/from16 v1, p1

    .line 504
    .line 505
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 509
    .line 510
    .line 511
    :goto_8
    iput-object v3, v0, Lx4/v;->R:Ljava/nio/ByteBuffer;

    .line 512
    .line 513
    return-void
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx4/v;->t:Lx4/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, v0, Lx4/q;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Lp4/c0;->a:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
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
.end method
