.class public abstract Lg5/q;
.super Lv4/e;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final R0:[B


# instance fields
.field public final A:Lx4/y;

.field public A0:I

.field public B:Lm4/q;

.field public B0:I

.field public C:Lm4/q;

.field public C0:I

.field public D:Lb5/l;

.field public D0:Z

.field public E:Lb5/l;

.field public E0:Z

.field public F:Lv4/w;

.field public F0:Z

.field public G:Landroid/media/MediaCrypto;

.field public G0:J

.field public final H:J

.field public H0:J

.field public I:F

.field public I0:Z

.field public J:F

.field public J0:Z

.field public K:Lg5/k;

.field public K0:Z

.field public L:Lm4/q;

.field public L0:Z

.field public M:Landroid/media/MediaFormat;

.field public M0:Lv4/m;

.field public N:Z

.field public N0:Lv4/f;

.field public O:F

.field public O0:Lg5/p;

.field public P:Ljava/util/ArrayDeque;

.field public P0:J

.field public Q:Lg5/o;

.field public Q0:Z

.field public R:Lg5/n;

.field public S:I

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:J

.field public q0:J

.field public final r:Lg5/j;

.field public r0:I

.field public final s:Lg5/r;

.field public s0:I

.field public final t:F

.field public t0:Ljava/nio/ByteBuffer;

.field public final u:Lu4/f;

.field public u0:Z

.field public final v:Lu4/f;

.field public v0:Z

.field public final w:Lu4/f;

.field public w0:Z

.field public final x:Lg5/g;

.field public x0:Z

.field public final y:Landroid/media/MediaCodec$BufferInfo;

.field public y0:Z

.field public final z:Ljava/util/ArrayDeque;

.field public z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg5/q;->R0:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
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

.method public constructor <init>(ILg5/j;Lg5/r;F)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lv4/e;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lg5/q;->r:Lg5/j;

    .line 5
    .line 6
    iput-object p3, p0, Lg5/q;->s:Lg5/r;

    .line 7
    .line 8
    iput p4, p0, Lg5/q;->t:F

    .line 9
    .line 10
    new-instance p1, Lu4/f;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p2}, Lu4/f;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lg5/q;->u:Lu4/f;

    .line 17
    .line 18
    new-instance p1, Lu4/f;

    .line 19
    .line 20
    invoke-direct {p1, p2}, Lu4/f;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lg5/q;->v:Lu4/f;

    .line 24
    .line 25
    new-instance p1, Lu4/f;

    .line 26
    .line 27
    const/4 p3, 0x2

    .line 28
    invoke-direct {p1, p3}, Lu4/f;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lg5/q;->w:Lu4/f;

    .line 32
    .line 33
    new-instance p1, Lg5/g;

    .line 34
    .line 35
    invoke-direct {p1, p3}, Lu4/f;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const/16 p4, 0x20

    .line 39
    .line 40
    iput p4, p1, Lg5/g;->l:I

    .line 41
    .line 42
    iput-object p1, p0, Lg5/q;->x:Lg5/g;

    .line 43
    .line 44
    new-instance p4, Landroid/media/MediaCodec$BufferInfo;

    .line 45
    .line 46
    invoke-direct {p4}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p4, p0, Lg5/q;->y:Landroid/media/MediaCodec$BufferInfo;

    .line 50
    .line 51
    const/high16 p4, 0x3f800000    # 1.0f

    .line 52
    .line 53
    iput p4, p0, Lg5/q;->I:F

    .line 54
    .line 55
    iput p4, p0, Lg5/q;->J:F

    .line 56
    .line 57
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    iput-wide v0, p0, Lg5/q;->H:J

    .line 63
    .line 64
    new-instance p4, Ljava/util/ArrayDeque;

    .line 65
    .line 66
    invoke-direct {p4}, Ljava/util/ArrayDeque;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p4, p0, Lg5/q;->z:Ljava/util/ArrayDeque;

    .line 70
    .line 71
    sget-object p4, Lg5/p;->e:Lg5/p;

    .line 72
    .line 73
    iput-object p4, p0, Lg5/q;->O0:Lg5/p;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Lu4/f;->j(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p1, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    invoke-virtual {p1, p4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    .line 87
    new-instance p1, Lx4/y;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    sget-object p4, Ln4/f;->a:Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    iput-object p4, p1, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    iput p2, p1, Lx4/y;->c:I

    .line 97
    .line 98
    iput p3, p1, Lx4/y;->b:I

    .line 99
    .line 100
    iput-object p1, p0, Lg5/q;->A:Lx4/y;

    .line 101
    .line 102
    const/high16 p1, -0x40800000    # -1.0f

    .line 103
    .line 104
    iput p1, p0, Lg5/q;->O:F

    .line 105
    .line 106
    iput p2, p0, Lg5/q;->S:I

    .line 107
    .line 108
    iput p2, p0, Lg5/q;->A0:I

    .line 109
    .line 110
    const/4 p1, -0x1

    .line 111
    iput p1, p0, Lg5/q;->r0:I

    .line 112
    .line 113
    iput p1, p0, Lg5/q;->s0:I

    .line 114
    .line 115
    iput-wide v0, p0, Lg5/q;->q0:J

    .line 116
    .line 117
    iput-wide v0, p0, Lg5/q;->G0:J

    .line 118
    .line 119
    iput-wide v0, p0, Lg5/q;->H0:J

    .line 120
    .line 121
    iput-wide v0, p0, Lg5/q;->P0:J

    .line 122
    .line 123
    iput-wide v0, p0, Lg5/q;->Z:J

    .line 124
    .line 125
    iput p2, p0, Lg5/q;->B0:I

    .line 126
    .line 127
    iput p2, p0, Lg5/q;->C0:I

    .line 128
    .line 129
    new-instance p1, Lv4/f;

    .line 130
    .line 131
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 135
    .line 136
    return-void
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


# virtual methods
.method public final A(JJ)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lg5/q;->J0:Z

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    xor-int/2addr v1, v15

    .line 7
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lg5/q;->x:Lg5/g;

    .line 11
    .line 12
    invoke-virtual {v1}, Lg5/g;->m()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x4

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v6, v1, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v7, v0, Lg5/q;->s0:I

    .line 22
    .line 23
    iget v9, v1, Lg5/g;->k:I

    .line 24
    .line 25
    iget-wide v10, v1, Lu4/f;->g:J

    .line 26
    .line 27
    iget-wide v12, v0, Lv4/e;->l:J

    .line 28
    .line 29
    iget-wide v4, v1, Lg5/g;->j:J

    .line 30
    .line 31
    invoke-virtual {v0, v12, v13, v4, v5}, Lg5/q;->R(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    invoke-virtual {v1, v3}, Lq4/d;->d(I)Z

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, Lg5/q;->C:Lm4/q;

    .line 40
    .line 41
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    move-wide/from16 v3, p3

    .line 47
    .line 48
    move-object v15, v1

    .line 49
    move-wide/from16 v1, p1

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v14}, Lg5/q;->f0(JJLg5/k;Ljava/nio/ByteBuffer;IIIJZZLm4/q;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    iget-wide v1, v15, Lg5/g;->j:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lg5/q;->b0(J)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v15}, Lg5/g;->h()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 67
    .line 68
    goto/16 :goto_15

    .line 69
    .line 70
    :cond_1
    move-object v15, v1

    .line 71
    :goto_1
    iget-boolean v1, v0, Lg5/q;->I0:Z

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    iput-boolean v1, v0, Lg5/q;->J0:Z

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    return v2

    .line 80
    :cond_2
    const/4 v2, 0x0

    .line 81
    iget-boolean v1, v0, Lg5/q;->x0:Z

    .line 82
    .line 83
    iget-object v3, v0, Lg5/q;->w:Lu4/f;

    .line 84
    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    invoke-virtual {v15, v3}, Lg5/g;->l(Lu4/f;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 92
    .line 93
    .line 94
    iput-boolean v2, v0, Lg5/q;->x0:Z

    .line 95
    .line 96
    :cond_3
    iget-boolean v1, v0, Lg5/q;->y0:Z

    .line 97
    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    invoke-virtual {v15}, Lg5/g;->m()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    :cond_4
    :goto_2
    const/16 v17, 0x1

    .line 107
    .line 108
    goto/16 :goto_16

    .line 109
    .line 110
    :cond_5
    invoke-virtual {v0}, Lg5/q;->D()V

    .line 111
    .line 112
    .line 113
    iput-boolean v2, v0, Lg5/q;->y0:Z

    .line 114
    .line 115
    invoke-virtual {v0}, Lg5/q;->S()V

    .line 116
    .line 117
    .line 118
    iget-boolean v1, v0, Lg5/q;->w0:Z

    .line 119
    .line 120
    if-nez v1, :cond_6

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_6
    iget-boolean v1, v0, Lg5/q;->I0:Z

    .line 124
    .line 125
    const/16 v17, 0x1

    .line 126
    .line 127
    xor-int/lit8 v1, v1, 0x1

    .line 128
    .line 129
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 130
    .line 131
    .line 132
    iget-object v1, v0, Lv4/e;->c:Lv2/e;

    .line 133
    .line 134
    invoke-virtual {v1}, Lv2/e;->n()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3}, Lu4/f;->h()V

    .line 138
    .line 139
    .line 140
    :goto_3
    invoke-virtual {v3}, Lu4/f;->h()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1, v3, v2}, Lv4/e;->u(Lv2/e;Lu4/f;I)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    const/4 v5, -0x5

    .line 148
    if-eq v4, v5, :cond_21

    .line 149
    .line 150
    const/4 v5, -0x4

    .line 151
    if-eq v4, v5, :cond_8

    .line 152
    .line 153
    const/4 v1, -0x3

    .line 154
    if-ne v4, v1, :cond_7

    .line 155
    .line 156
    invoke-virtual {v0}, Lv4/e;->j()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_22

    .line 161
    .line 162
    iget-wide v3, v0, Lg5/q;->G0:J

    .line 163
    .line 164
    iput-wide v3, v0, Lg5/q;->H0:J

    .line 165
    .line 166
    goto/16 :goto_14

    .line 167
    .line 168
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_8
    const/4 v4, 0x4

    .line 175
    invoke-virtual {v3, v4}, Lq4/d;->d(I)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_9

    .line 180
    .line 181
    const/4 v5, 0x1

    .line 182
    iput-boolean v5, v0, Lg5/q;->I0:Z

    .line 183
    .line 184
    iget-wide v3, v0, Lg5/q;->G0:J

    .line 185
    .line 186
    iput-wide v3, v0, Lg5/q;->H0:J

    .line 187
    .line 188
    goto/16 :goto_14

    .line 189
    .line 190
    :cond_9
    iget-wide v5, v0, Lg5/q;->G0:J

    .line 191
    .line 192
    iget-wide v7, v3, Lu4/f;->g:J

    .line 193
    .line 194
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 195
    .line 196
    .line 197
    move-result-wide v5

    .line 198
    iput-wide v5, v0, Lg5/q;->G0:J

    .line 199
    .line 200
    invoke-virtual {v0}, Lv4/e;->j()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-nez v5, :cond_a

    .line 205
    .line 206
    iget-object v5, v0, Lg5/q;->v:Lu4/f;

    .line 207
    .line 208
    const/high16 v6, 0x20000000

    .line 209
    .line 210
    invoke-virtual {v5, v6}, Lq4/d;->d(I)Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_b

    .line 215
    .line 216
    :cond_a
    iget-wide v5, v0, Lg5/q;->G0:J

    .line 217
    .line 218
    iput-wide v5, v0, Lg5/q;->H0:J

    .line 219
    .line 220
    :cond_b
    iget-boolean v5, v0, Lg5/q;->K0:Z

    .line 221
    .line 222
    const/16 v6, 0x8

    .line 223
    .line 224
    const/16 v7, 0xff

    .line 225
    .line 226
    const/4 v8, 0x0

    .line 227
    const-string v9, "audio/opus"

    .line 228
    .line 229
    if-eqz v5, :cond_d

    .line 230
    .line 231
    iget-object v5, v0, Lg5/q;->B:Lm4/q;

    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iput-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 237
    .line 238
    iget-object v5, v5, Lm4/q;->n:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v5, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_c

    .line 245
    .line 246
    iget-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 247
    .line 248
    iget-object v5, v5, Lm4/q;->q:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-nez v5, :cond_c

    .line 255
    .line 256
    iget-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 257
    .line 258
    iget-object v5, v5, Lm4/q;->q:Ljava/util/List;

    .line 259
    .line 260
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    check-cast v5, [B

    .line 265
    .line 266
    const/16 v10, 0xb

    .line 267
    .line 268
    aget-byte v10, v5, v10

    .line 269
    .line 270
    and-int/2addr v10, v7

    .line 271
    shl-int/2addr v10, v6

    .line 272
    const/16 v11, 0xa

    .line 273
    .line 274
    aget-byte v5, v5, v11

    .line 275
    .line 276
    and-int/2addr v5, v7

    .line 277
    or-int/2addr v5, v10

    .line 278
    iget-object v10, v0, Lg5/q;->C:Lm4/q;

    .line 279
    .line 280
    invoke-virtual {v10}, Lm4/q;->a()Lm4/p;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    iput v5, v10, Lm4/p;->F:I

    .line 285
    .line 286
    new-instance v5, Lm4/q;

    .line 287
    .line 288
    invoke-direct {v5, v10}, Lm4/q;-><init>(Lm4/p;)V

    .line 289
    .line 290
    .line 291
    iput-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 292
    .line 293
    :cond_c
    iget-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 294
    .line 295
    invoke-virtual {v0, v5, v8}, Lg5/q;->Z(Lm4/q;Landroid/media/MediaFormat;)V

    .line 296
    .line 297
    .line 298
    iput-boolean v2, v0, Lg5/q;->K0:Z

    .line 299
    .line 300
    :cond_d
    invoke-virtual {v3}, Lu4/f;->k()V

    .line 301
    .line 302
    .line 303
    iget-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 304
    .line 305
    if-eqz v5, :cond_1d

    .line 306
    .line 307
    iget-object v5, v5, Lm4/q;->n:Ljava/lang/String;

    .line 308
    .line 309
    invoke-static {v5, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_1d

    .line 314
    .line 315
    const/high16 v5, 0x10000000

    .line 316
    .line 317
    invoke-virtual {v3, v5}, Lq4/d;->d(I)Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_e

    .line 322
    .line 323
    iget-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 324
    .line 325
    iput-object v5, v3, Lu4/f;->c:Lm4/q;

    .line 326
    .line 327
    invoke-virtual {v0, v3}, Lg5/q;->P(Lu4/f;)V

    .line 328
    .line 329
    .line 330
    :cond_e
    iget-wide v9, v0, Lv4/e;->l:J

    .line 331
    .line 332
    iget-wide v11, v3, Lu4/f;->g:J

    .line 333
    .line 334
    sub-long/2addr v9, v11

    .line 335
    const-wide/32 v11, 0x13880

    .line 336
    .line 337
    .line 338
    cmp-long v5, v9, v11

    .line 339
    .line 340
    if-gtz v5, :cond_1d

    .line 341
    .line 342
    iget-object v5, v0, Lg5/q;->C:Lm4/q;

    .line 343
    .line 344
    iget-object v5, v5, Lm4/q;->q:Ljava/util/List;

    .line 345
    .line 346
    iget-object v9, v0, Lg5/q;->A:Lx4/y;

    .line 347
    .line 348
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    iget-object v10, v3, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 352
    .line 353
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v10, v3, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 357
    .line 358
    invoke-virtual {v10}, Ljava/nio/Buffer;->limit()I

    .line 359
    .line 360
    .line 361
    move-result v10

    .line 362
    iget-object v11, v3, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 363
    .line 364
    invoke-virtual {v11}, Ljava/nio/Buffer;->position()I

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    sub-int/2addr v10, v11

    .line 369
    if-nez v10, :cond_f

    .line 370
    .line 371
    goto/16 :goto_11

    .line 372
    .line 373
    :cond_f
    iget v10, v9, Lx4/y;->b:I

    .line 374
    .line 375
    const/4 v11, 0x2

    .line 376
    if-ne v10, v11, :cond_11

    .line 377
    .line 378
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 379
    .line 380
    .line 381
    move-result v10

    .line 382
    const/4 v12, 0x1

    .line 383
    if-eq v10, v12, :cond_10

    .line 384
    .line 385
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    const/4 v12, 0x3

    .line 390
    if-ne v10, v12, :cond_11

    .line 391
    .line 392
    :cond_10
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    move-object v8, v5

    .line 397
    check-cast v8, [B

    .line 398
    .line 399
    :cond_11
    iget-object v5, v3, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 400
    .line 401
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 406
    .line 407
    .line 408
    move-result v12

    .line 409
    sub-int v13, v12, v10

    .line 410
    .line 411
    add-int/lit16 v14, v13, 0xff

    .line 412
    .line 413
    div-int/2addr v14, v7

    .line 414
    add-int/lit8 v16, v14, 0x1b

    .line 415
    .line 416
    add-int v16, v16, v13

    .line 417
    .line 418
    iget v4, v9, Lx4/y;->b:I

    .line 419
    .line 420
    if-ne v4, v11, :cond_13

    .line 421
    .line 422
    if-eqz v8, :cond_12

    .line 423
    .line 424
    array-length v4, v8

    .line 425
    add-int/lit8 v4, v4, 0x1c

    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_12
    const/16 v4, 0x2f

    .line 429
    .line 430
    :goto_4
    add-int/lit8 v18, v4, 0x2c

    .line 431
    .line 432
    add-int v16, v18, v16

    .line 433
    .line 434
    :goto_5
    move/from16 v6, v16

    .line 435
    .line 436
    const/16 p1, 0x8

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_13
    const/4 v4, 0x0

    .line 440
    goto :goto_5

    .line 441
    :goto_6
    iget-object v7, v9, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 442
    .line 443
    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    if-ge v7, v6, :cond_14

    .line 448
    .line 449
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    sget-object v7, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 454
    .line 455
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    iput-object v6, v9, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_14
    iget-object v6, v9, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 463
    .line 464
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 465
    .line 466
    .line 467
    :goto_7
    iget-object v6, v9, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 468
    .line 469
    iget v7, v9, Lx4/y;->b:I

    .line 470
    .line 471
    if-ne v7, v11, :cond_17

    .line 472
    .line 473
    if-eqz v8, :cond_16

    .line 474
    .line 475
    const/16 v22, 0x1

    .line 476
    .line 477
    const/16 v23, 0x1

    .line 478
    .line 479
    const-wide/16 v19, 0x0

    .line 480
    .line 481
    const/16 v21, 0x0

    .line 482
    .line 483
    move-object/from16 v18, v6

    .line 484
    .line 485
    invoke-static/range {v18 .. v23}, Lx4/y;->a(Ljava/nio/ByteBuffer;JIIZ)V

    .line 486
    .line 487
    .line 488
    array-length v7, v8

    .line 489
    move/from16 p4, v12

    .line 490
    .line 491
    int-to-long v11, v7

    .line 492
    shr-long v18, v11, p1

    .line 493
    .line 494
    const-wide/16 v20, 0x0

    .line 495
    .line 496
    cmp-long v7, v18, v20

    .line 497
    .line 498
    if-nez v7, :cond_15

    .line 499
    .line 500
    const/4 v7, 0x1

    .line 501
    goto :goto_8

    .line 502
    :cond_15
    const/4 v7, 0x0

    .line 503
    :goto_8
    const-string v2, "out of range: %s"

    .line 504
    .line 505
    invoke-static {v11, v12, v2, v7}, Lud/s;->f(JLjava/lang/String;Z)V

    .line 506
    .line 507
    .line 508
    long-to-int v2, v11

    .line 509
    int-to-byte v2, v2

    .line 510
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 521
    .line 522
    .line 523
    move-result v7

    .line 524
    array-length v11, v8

    .line 525
    add-int/lit8 v11, v11, 0x1c

    .line 526
    .line 527
    const/4 v12, 0x0

    .line 528
    invoke-static {v7, v11, v12, v2}, Lp4/c0;->m(III[B)I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    const/16 v7, 0x16

    .line 533
    .line 534
    invoke-virtual {v6, v7, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 535
    .line 536
    .line 537
    array-length v2, v8

    .line 538
    add-int/lit8 v2, v2, 0x1c

    .line 539
    .line 540
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 541
    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_16
    move/from16 p4, v12

    .line 545
    .line 546
    sget-object v2, Lx4/y;->d:[B

    .line 547
    .line 548
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 549
    .line 550
    .line 551
    :goto_9
    sget-object v2, Lx4/y;->e:[B

    .line 552
    .line 553
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 554
    .line 555
    .line 556
    :goto_a
    const/4 v2, 0x0

    .line 557
    goto :goto_b

    .line 558
    :cond_17
    move/from16 p4, v12

    .line 559
    .line 560
    goto :goto_a

    .line 561
    :goto_b
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    const/4 v12, 0x1

    .line 570
    if-le v2, v12, :cond_18

    .line 571
    .line 572
    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->get(I)B

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    goto :goto_c

    .line 577
    :cond_18
    const/4 v2, 0x0

    .line 578
    :goto_c
    invoke-static {v7, v2}, Lr5/b;->j(BB)J

    .line 579
    .line 580
    .line 581
    move-result-wide v7

    .line 582
    const-wide/32 v11, 0xbb80

    .line 583
    .line 584
    .line 585
    mul-long v7, v7, v11

    .line 586
    .line 587
    const-wide/32 v11, 0xf4240

    .line 588
    .line 589
    .line 590
    div-long/2addr v7, v11

    .line 591
    long-to-int v2, v7

    .line 592
    iget v7, v9, Lx4/y;->c:I

    .line 593
    .line 594
    add-int/2addr v7, v2

    .line 595
    iput v7, v9, Lx4/y;->c:I

    .line 596
    .line 597
    int-to-long v7, v7

    .line 598
    iget v2, v9, Lx4/y;->b:I

    .line 599
    .line 600
    const/16 v23, 0x0

    .line 601
    .line 602
    move/from16 v21, v2

    .line 603
    .line 604
    move-object/from16 v18, v6

    .line 605
    .line 606
    move-wide/from16 v19, v7

    .line 607
    .line 608
    move/from16 v22, v14

    .line 609
    .line 610
    invoke-static/range {v18 .. v23}, Lx4/y;->a(Ljava/nio/ByteBuffer;JIIZ)V

    .line 611
    .line 612
    .line 613
    const/4 v2, 0x0

    .line 614
    :goto_d
    if-ge v2, v14, :cond_1a

    .line 615
    .line 616
    const/16 v7, 0xff

    .line 617
    .line 618
    if-lt v13, v7, :cond_19

    .line 619
    .line 620
    const/4 v8, -0x1

    .line 621
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 622
    .line 623
    .line 624
    add-int/lit16 v8, v13, -0xff

    .line 625
    .line 626
    move v13, v8

    .line 627
    goto :goto_e

    .line 628
    :cond_19
    int-to-byte v8, v13

    .line 629
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 630
    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    :goto_e
    add-int/lit8 v2, v2, 0x1

    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_1a
    move/from16 v2, p4

    .line 637
    .line 638
    :goto_f
    if-ge v10, v2, :cond_1b

    .line 639
    .line 640
    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->get(I)B

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 645
    .line 646
    .line 647
    add-int/lit8 v10, v10, 0x1

    .line 648
    .line 649
    goto :goto_f

    .line 650
    :cond_1b
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 658
    .line 659
    .line 660
    iget v2, v9, Lx4/y;->b:I

    .line 661
    .line 662
    const/4 v5, 0x2

    .line 663
    if-ne v2, v5, :cond_1c

    .line 664
    .line 665
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 670
    .line 671
    .line 672
    move-result v5

    .line 673
    add-int/2addr v5, v4

    .line 674
    add-int/lit8 v5, v5, 0x2c

    .line 675
    .line 676
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 677
    .line 678
    .line 679
    move-result v7

    .line 680
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 681
    .line 682
    .line 683
    move-result v8

    .line 684
    sub-int/2addr v7, v8

    .line 685
    const/4 v12, 0x0

    .line 686
    invoke-static {v5, v7, v12, v2}, Lp4/c0;->m(III[B)I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    add-int/lit8 v4, v4, 0x42

    .line 691
    .line 692
    invoke-virtual {v6, v4, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 693
    .line 694
    .line 695
    goto :goto_10

    .line 696
    :cond_1c
    const/4 v12, 0x0

    .line 697
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 710
    .line 711
    .line 712
    move-result v7

    .line 713
    sub-int/2addr v5, v7

    .line 714
    invoke-static {v4, v5, v12, v2}, Lp4/c0;->m(III[B)I

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    const/16 v7, 0x16

    .line 719
    .line 720
    invoke-virtual {v6, v7, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 721
    .line 722
    .line 723
    :goto_10
    iget v2, v9, Lx4/y;->b:I

    .line 724
    .line 725
    const/16 v17, 0x1

    .line 726
    .line 727
    add-int/lit8 v2, v2, 0x1

    .line 728
    .line 729
    iput v2, v9, Lx4/y;->b:I

    .line 730
    .line 731
    iput-object v6, v9, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 732
    .line 733
    invoke-virtual {v3}, Lu4/f;->h()V

    .line 734
    .line 735
    .line 736
    iget-object v2, v9, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 737
    .line 738
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    invoke-virtual {v3, v2}, Lu4/f;->j(I)V

    .line 743
    .line 744
    .line 745
    iget-object v2, v3, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 746
    .line 747
    iget-object v4, v9, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 748
    .line 749
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v3}, Lu4/f;->k()V

    .line 753
    .line 754
    .line 755
    :cond_1d
    :goto_11
    invoke-virtual {v15}, Lg5/g;->m()Z

    .line 756
    .line 757
    .line 758
    move-result v2

    .line 759
    if-nez v2, :cond_1e

    .line 760
    .line 761
    goto :goto_12

    .line 762
    :cond_1e
    iget-wide v4, v0, Lv4/e;->l:J

    .line 763
    .line 764
    iget-wide v6, v15, Lg5/g;->j:J

    .line 765
    .line 766
    invoke-virtual {v0, v4, v5, v6, v7}, Lg5/q;->R(JJ)Z

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    iget-wide v6, v3, Lu4/f;->g:J

    .line 771
    .line 772
    invoke-virtual {v0, v4, v5, v6, v7}, Lg5/q;->R(JJ)Z

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    if-ne v2, v4, :cond_1f

    .line 777
    .line 778
    :goto_12
    invoke-virtual {v15, v3}, Lg5/g;->l(Lu4/f;)Z

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    if-nez v2, :cond_20

    .line 783
    .line 784
    :cond_1f
    const/4 v12, 0x1

    .line 785
    goto :goto_13

    .line 786
    :cond_20
    const/4 v2, 0x0

    .line 787
    goto/16 :goto_3

    .line 788
    .line 789
    :goto_13
    iput-boolean v12, v0, Lg5/q;->x0:Z

    .line 790
    .line 791
    goto :goto_14

    .line 792
    :cond_21
    invoke-virtual {v0, v1}, Lg5/q;->Y(Lv2/e;)Lv4/g;

    .line 793
    .line 794
    .line 795
    :cond_22
    :goto_14
    invoke-virtual {v15}, Lg5/g;->m()Z

    .line 796
    .line 797
    .line 798
    move-result v1

    .line 799
    if-eqz v1, :cond_23

    .line 800
    .line 801
    invoke-virtual {v15}, Lu4/f;->k()V

    .line 802
    .line 803
    .line 804
    :cond_23
    invoke-virtual {v15}, Lg5/g;->m()Z

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    if-nez v1, :cond_4

    .line 809
    .line 810
    iget-boolean v1, v0, Lg5/q;->I0:Z

    .line 811
    .line 812
    if-nez v1, :cond_4

    .line 813
    .line 814
    iget-boolean v1, v0, Lg5/q;->y0:Z

    .line 815
    .line 816
    if-eqz v1, :cond_0

    .line 817
    .line 818
    goto/16 :goto_2

    .line 819
    .line 820
    :goto_15
    return v16

    .line 821
    :goto_16
    return v17
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

.method public abstract B(Lg5/n;Lm4/q;Lm4/q;)Lv4/g;
.end method

.method public C(Ljava/lang/IllegalStateException;Lg5/n;)Lg5/m;
    .locals 1

    .line 1
    new-instance v0, Lg5/m;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lg5/m;-><init>(Ljava/lang/IllegalStateException;Lg5/n;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public final D()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lg5/q;->y0:Z

    .line 3
    .line 4
    iget-object v1, p0, Lg5/q;->x:Lg5/g;

    .line 5
    .line 6
    invoke-virtual {v1}, Lg5/g;->h()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lg5/q;->w:Lu4/f;

    .line 10
    .line 11
    invoke-virtual {v1}, Lu4/f;->h()V

    .line 12
    .line 13
    .line 14
    iput-boolean v0, p0, Lg5/q;->x0:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lg5/q;->w0:Z

    .line 17
    .line 18
    iget-object v1, p0, Lg5/q;->A:Lx4/y;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v2, Ln4/f;->a:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iput-object v2, v1, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    iput v0, v1, Lx4/y;->c:I

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    iput v0, v1, Lx4/y;->b:I

    .line 31
    .line 32
    return-void
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
.end method

.method public final E()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg5/q;->D0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iput v1, p0, Lg5/q;->B0:I

    .line 7
    .line 8
    iget-boolean v0, p0, Lg5/q;->U:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    iput v0, p0, Lg5/q;->C0:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    iput v0, p0, Lg5/q;->C0:I

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    invoke-virtual {p0}, Lg5/q;->s0()V

    .line 22
    .line 23
    .line 24
    return v1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final F(JJ)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v5, v0, Lg5/q;->K:Lg5/k;

    .line 4
    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v0, Lg5/q;->s0:I

    .line 9
    .line 10
    const/4 v15, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, v0, Lg5/q;->y:Landroid/media/MediaCodec$BufferInfo;

    .line 13
    .line 14
    if-ltz v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    iget-boolean v1, v0, Lg5/q;->V:Z

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-boolean v1, v0, Lg5/q;->E0:Z

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    :try_start_0
    invoke-interface {v5, v3}, Lg5/k;->W(Landroid/media/MediaCodec$BufferInfo;)I

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    invoke-virtual {v0}, Lg5/q;->e0()V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, v0, Lg5/q;->J0:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Lg5/q;->h0()V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/16 v16, 0x0

    .line 42
    .line 43
    goto/16 :goto_8

    .line 44
    .line 45
    :cond_2
    invoke-interface {v5, v3}, Lg5/k;->W(Landroid/media/MediaCodec$BufferInfo;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    if-gez v1, :cond_7

    .line 55
    .line 56
    const/4 v3, -0x2

    .line 57
    if-ne v1, v3, :cond_4

    .line 58
    .line 59
    iput-boolean v15, v0, Lg5/q;->F0:Z

    .line 60
    .line 61
    iget-object v1, v0, Lg5/q;->K:Lg5/k;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {v1}, Lg5/k;->x()Landroid/media/MediaFormat;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget v2, v0, Lg5/q;->S:I

    .line 71
    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    const-string v2, "width"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/16 v3, 0x20

    .line 81
    .line 82
    if-ne v2, v3, :cond_3

    .line 83
    .line 84
    const-string v2, "height"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-ne v2, v3, :cond_3

    .line 91
    .line 92
    iput-boolean v15, v0, Lg5/q;->X:Z

    .line 93
    .line 94
    return v15

    .line 95
    :cond_3
    iput-object v1, v0, Lg5/q;->M:Landroid/media/MediaFormat;

    .line 96
    .line 97
    iput-boolean v15, v0, Lg5/q;->N:Z

    .line 98
    .line 99
    return v15

    .line 100
    :cond_4
    iget-boolean v1, v0, Lg5/q;->Y:Z

    .line 101
    .line 102
    if-eqz v1, :cond_6

    .line 103
    .line 104
    iget-boolean v1, v0, Lg5/q;->I0:Z

    .line 105
    .line 106
    if-nez v1, :cond_5

    .line 107
    .line 108
    iget v1, v0, Lg5/q;->B0:I

    .line 109
    .line 110
    const/4 v3, 0x2

    .line 111
    if-ne v1, v3, :cond_6

    .line 112
    .line 113
    :cond_5
    invoke-virtual {v0}, Lg5/q;->e0()V

    .line 114
    .line 115
    .line 116
    :cond_6
    iget-wide v3, v0, Lg5/q;->Z:J

    .line 117
    .line 118
    cmp-long v1, v3, v6

    .line 119
    .line 120
    if-eqz v1, :cond_1

    .line 121
    .line 122
    const-wide/16 v5, 0x64

    .line 123
    .line 124
    add-long/2addr v3, v5

    .line 125
    iget-object v1, v0, Lv4/e;->g:Lp4/v;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    cmp-long v1, v3, v5

    .line 135
    .line 136
    if-gez v1, :cond_1

    .line 137
    .line 138
    invoke-virtual {v0}, Lg5/q;->e0()V

    .line 139
    .line 140
    .line 141
    return v2

    .line 142
    :cond_7
    iget-boolean v4, v0, Lg5/q;->X:Z

    .line 143
    .line 144
    if-eqz v4, :cond_8

    .line 145
    .line 146
    iput-boolean v2, v0, Lg5/q;->X:Z

    .line 147
    .line 148
    invoke-interface {v5, v1}, Lg5/k;->i(I)V

    .line 149
    .line 150
    .line 151
    return v15

    .line 152
    :cond_8
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 153
    .line 154
    if-nez v4, :cond_9

    .line 155
    .line 156
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 157
    .line 158
    and-int/lit8 v4, v4, 0x4

    .line 159
    .line 160
    if-eqz v4, :cond_9

    .line 161
    .line 162
    invoke-virtual {v0}, Lg5/q;->e0()V

    .line 163
    .line 164
    .line 165
    return v2

    .line 166
    :cond_9
    iput v1, v0, Lg5/q;->s0:I

    .line 167
    .line 168
    invoke-interface {v5, v1}, Lg5/k;->E0(I)Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iput-object v1, v0, Lg5/q;->t0:Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    if-eqz v1, :cond_a

    .line 175
    .line 176
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 177
    .line 178
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 179
    .line 180
    .line 181
    iget-object v1, v0, Lg5/q;->t0:Ljava/nio/ByteBuffer;

    .line 182
    .line 183
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 184
    .line 185
    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 186
    .line 187
    add-int/2addr v4, v8

    .line 188
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 189
    .line 190
    .line 191
    :cond_a
    iget-wide v8, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 192
    .line 193
    iget-wide v10, v0, Lv4/e;->l:J

    .line 194
    .line 195
    cmp-long v1, v8, v10

    .line 196
    .line 197
    if-gez v1, :cond_b

    .line 198
    .line 199
    const/4 v1, 0x1

    .line 200
    goto :goto_1

    .line 201
    :cond_b
    const/4 v1, 0x0

    .line 202
    :goto_1
    iput-boolean v1, v0, Lg5/q;->u0:Z

    .line 203
    .line 204
    iget-wide v10, v0, Lg5/q;->H0:J

    .line 205
    .line 206
    cmp-long v1, v10, v6

    .line 207
    .line 208
    if-eqz v1, :cond_c

    .line 209
    .line 210
    cmp-long v1, v10, v8

    .line 211
    .line 212
    if-gtz v1, :cond_c

    .line 213
    .line 214
    const/4 v1, 0x1

    .line 215
    goto :goto_2

    .line 216
    :cond_c
    const/4 v1, 0x0

    .line 217
    :goto_2
    iput-boolean v1, v0, Lg5/q;->v0:Z

    .line 218
    .line 219
    invoke-virtual {v0, v8, v9}, Lg5/q;->t0(J)V

    .line 220
    .line 221
    .line 222
    :goto_3
    iget-boolean v1, v0, Lg5/q;->V:Z

    .line 223
    .line 224
    if-eqz v1, :cond_d

    .line 225
    .line 226
    iget-boolean v1, v0, Lg5/q;->E0:Z

    .line 227
    .line 228
    if-eqz v1, :cond_d

    .line 229
    .line 230
    :try_start_1
    iget-object v6, v0, Lg5/q;->t0:Ljava/nio/ByteBuffer;

    .line 231
    .line 232
    iget v7, v0, Lg5/q;->s0:I

    .line 233
    .line 234
    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 235
    .line 236
    iget-wide v10, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 237
    .line 238
    iget-boolean v12, v0, Lg5/q;->u0:Z

    .line 239
    .line 240
    iget-boolean v13, v0, Lg5/q;->v0:Z

    .line 241
    .line 242
    iget-object v14, v0, Lg5/q;->C:Lm4/q;

    .line 243
    .line 244
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2

    .line 245
    .line 246
    .line 247
    const/4 v9, 0x1

    .line 248
    move-wide/from16 v1, p1

    .line 249
    .line 250
    move-object v15, v3

    .line 251
    const/16 v16, 0x0

    .line 252
    .line 253
    const/16 v17, 0x1

    .line 254
    .line 255
    move-wide/from16 v3, p3

    .line 256
    .line 257
    :try_start_2
    invoke-virtual/range {v0 .. v14}, Lg5/q;->f0(JJLg5/k;Ljava/nio/ByteBuffer;IIIJZZLm4/q;)Z

    .line 258
    .line 259
    .line 260
    move-result v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 261
    goto :goto_6

    .line 262
    :catch_1
    :goto_4
    nop

    .line 263
    goto :goto_5

    .line 264
    :catch_2
    const/16 v16, 0x0

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :goto_5
    invoke-virtual {v0}, Lg5/q;->e0()V

    .line 268
    .line 269
    .line 270
    iget-boolean v1, v0, Lg5/q;->J0:Z

    .line 271
    .line 272
    if-eqz v1, :cond_11

    .line 273
    .line 274
    invoke-virtual {v0}, Lg5/q;->h0()V

    .line 275
    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_d
    move-object v15, v3

    .line 279
    const/16 v16, 0x0

    .line 280
    .line 281
    const/16 v17, 0x1

    .line 282
    .line 283
    iget-object v6, v0, Lg5/q;->t0:Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    iget v7, v0, Lg5/q;->s0:I

    .line 286
    .line 287
    iget v8, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 288
    .line 289
    iget-wide v10, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 290
    .line 291
    iget-boolean v12, v0, Lg5/q;->u0:Z

    .line 292
    .line 293
    iget-boolean v13, v0, Lg5/q;->v0:Z

    .line 294
    .line 295
    iget-object v14, v0, Lg5/q;->C:Lm4/q;

    .line 296
    .line 297
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    const/4 v9, 0x1

    .line 301
    move-wide/from16 v1, p1

    .line 302
    .line 303
    move-wide/from16 v3, p3

    .line 304
    .line 305
    invoke-virtual/range {v0 .. v14}, Lg5/q;->f0(JJLg5/k;Ljava/nio/ByteBuffer;IIIJZZLm4/q;)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    :goto_6
    if-eqz v1, :cond_11

    .line 310
    .line 311
    iget-wide v1, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 312
    .line 313
    invoke-virtual {v0, v1, v2}, Lg5/q;->b0(J)V

    .line 314
    .line 315
    .line 316
    iget v1, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 317
    .line 318
    and-int/lit8 v1, v1, 0x4

    .line 319
    .line 320
    if-eqz v1, :cond_e

    .line 321
    .line 322
    const/4 v2, 0x1

    .line 323
    goto :goto_7

    .line 324
    :cond_e
    const/4 v2, 0x0

    .line 325
    :goto_7
    if-nez v2, :cond_f

    .line 326
    .line 327
    iget-boolean v1, v0, Lg5/q;->E0:Z

    .line 328
    .line 329
    if-eqz v1, :cond_f

    .line 330
    .line 331
    iget-boolean v1, v0, Lg5/q;->v0:Z

    .line 332
    .line 333
    if-eqz v1, :cond_f

    .line 334
    .line 335
    iget-object v1, v0, Lv4/e;->g:Lp4/v;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 341
    .line 342
    .line 343
    move-result-wide v3

    .line 344
    iput-wide v3, v0, Lg5/q;->Z:J

    .line 345
    .line 346
    :cond_f
    const/4 v1, -0x1

    .line 347
    iput v1, v0, Lg5/q;->s0:I

    .line 348
    .line 349
    const/4 v1, 0x0

    .line 350
    iput-object v1, v0, Lg5/q;->t0:Ljava/nio/ByteBuffer;

    .line 351
    .line 352
    if-nez v2, :cond_10

    .line 353
    .line 354
    return v17

    .line 355
    :cond_10
    invoke-virtual {v0}, Lg5/q;->e0()V

    .line 356
    .line 357
    .line 358
    :cond_11
    :goto_8
    return v16
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
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
.end method

.method public final G()Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lg5/q;->K:Lg5/k;

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    if-eqz v2, :cond_1b

    .line 7
    .line 8
    iget v0, v1, Lg5/q;->B0:I

    .line 9
    .line 10
    const/4 v9, 0x2

    .line 11
    if-eq v0, v9, :cond_1b

    .line 12
    .line 13
    iget-boolean v0, v1, Lg5/q;->I0:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    iget v0, v1, Lg5/q;->r0:I

    .line 20
    .line 21
    iget-object v10, v1, Lg5/q;->v:Lu4/f;

    .line 22
    .line 23
    if-gez v0, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Lg5/k;->O()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, v1, Lg5/q;->r0:I

    .line 30
    .line 31
    if-gez v0, :cond_1

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    invoke-interface {v2, v0}, Lg5/k;->x0(I)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    invoke-virtual {v10}, Lu4/f;->h()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v0, v1, Lg5/q;->B0:I

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, -0x1

    .line 48
    const/4 v13, 0x1

    .line 49
    if-ne v0, v13, :cond_4

    .line 50
    .line 51
    iget-boolean v0, v1, Lg5/q;->Y:Z

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    iput-boolean v13, v1, Lg5/q;->E0:Z

    .line 57
    .line 58
    iget v3, v1, Lg5/q;->r0:I

    .line 59
    .line 60
    const-wide/16 v6, 0x0

    .line 61
    .line 62
    const/4 v5, 0x4

    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-interface/range {v2 .. v7}, Lg5/k;->d(IIIJ)V

    .line 65
    .line 66
    .line 67
    iput v12, v1, Lg5/q;->r0:I

    .line 68
    .line 69
    iput-object v11, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    :goto_0
    iput v9, v1, Lg5/q;->B0:I

    .line 72
    .line 73
    return v8

    .line 74
    :cond_4
    iget-boolean v0, v1, Lg5/q;->W:Z

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iput-boolean v8, v1, Lg5/q;->W:Z

    .line 79
    .line 80
    iget-object v0, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v3, Lg5/q;->R0:[B

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    .line 90
    iget v3, v1, Lg5/q;->r0:I

    .line 91
    .line 92
    const-wide/16 v6, 0x0

    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    const/16 v4, 0x26

    .line 96
    .line 97
    invoke-interface/range {v2 .. v7}, Lg5/k;->d(IIIJ)V

    .line 98
    .line 99
    .line 100
    iput v12, v1, Lg5/q;->r0:I

    .line 101
    .line 102
    iput-object v11, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    iput-boolean v13, v1, Lg5/q;->D0:Z

    .line 105
    .line 106
    return v13

    .line 107
    :cond_5
    iget v0, v1, Lg5/q;->A0:I

    .line 108
    .line 109
    if-ne v0, v13, :cond_7

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    :goto_1
    iget-object v3, v1, Lg5/q;->L:Lm4/q;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v3, v3, Lm4/q;->q:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-ge v0, v3, :cond_6

    .line 124
    .line 125
    iget-object v3, v1, Lg5/q;->L:Lm4/q;

    .line 126
    .line 127
    iget-object v3, v3, Lm4/q;->q:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, [B

    .line 134
    .line 135
    iget-object v4, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_6
    iput v9, v1, Lg5/q;->A0:I

    .line 147
    .line 148
    :cond_7
    iget-object v0, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    iget-object v3, v1, Lv4/e;->c:Lv2/e;

    .line 158
    .line 159
    invoke-virtual {v3}, Lv2/e;->n()V

    .line 160
    .line 161
    .line 162
    :try_start_0
    invoke-virtual {v1, v3, v10, v8}, Lv4/e;->u(Lv2/e;Lu4/f;I)I

    .line 163
    .line 164
    .line 165
    move-result v4
    :try_end_0
    .catch Lu4/e; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    const/4 v5, -0x3

    .line 167
    if-ne v4, v5, :cond_8

    .line 168
    .line 169
    invoke-virtual {v1}, Lv4/e;->j()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_1b

    .line 174
    .line 175
    iget-wide v2, v1, Lg5/q;->G0:J

    .line 176
    .line 177
    iput-wide v2, v1, Lg5/q;->H0:J

    .line 178
    .line 179
    return v8

    .line 180
    :cond_8
    const/4 v5, -0x5

    .line 181
    if-ne v4, v5, :cond_a

    .line 182
    .line 183
    iget v0, v1, Lg5/q;->A0:I

    .line 184
    .line 185
    if-ne v0, v9, :cond_9

    .line 186
    .line 187
    invoke-virtual {v10}, Lu4/f;->h()V

    .line 188
    .line 189
    .line 190
    iput v13, v1, Lg5/q;->A0:I

    .line 191
    .line 192
    :cond_9
    invoke-virtual {v1, v3}, Lg5/q;->Y(Lv2/e;)Lv4/g;

    .line 193
    .line 194
    .line 195
    return v13

    .line 196
    :cond_a
    const/4 v3, 0x4

    .line 197
    invoke-virtual {v10, v3}, Lq4/d;->d(I)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-eqz v3, :cond_e

    .line 202
    .line 203
    iget-wide v3, v1, Lg5/q;->G0:J

    .line 204
    .line 205
    iput-wide v3, v1, Lg5/q;->H0:J

    .line 206
    .line 207
    iget v0, v1, Lg5/q;->A0:I

    .line 208
    .line 209
    if-ne v0, v9, :cond_b

    .line 210
    .line 211
    invoke-virtual {v10}, Lu4/f;->h()V

    .line 212
    .line 213
    .line 214
    iput v13, v1, Lg5/q;->A0:I

    .line 215
    .line 216
    :cond_b
    iput-boolean v13, v1, Lg5/q;->I0:Z

    .line 217
    .line 218
    iget-boolean v0, v1, Lg5/q;->D0:Z

    .line 219
    .line 220
    if-nez v0, :cond_c

    .line 221
    .line 222
    invoke-virtual {v1}, Lg5/q;->e0()V

    .line 223
    .line 224
    .line 225
    return v8

    .line 226
    :cond_c
    iget-boolean v0, v1, Lg5/q;->Y:Z

    .line 227
    .line 228
    if-eqz v0, :cond_d

    .line 229
    .line 230
    goto/16 :goto_5

    .line 231
    .line 232
    :cond_d
    iput-boolean v13, v1, Lg5/q;->E0:Z

    .line 233
    .line 234
    iget v3, v1, Lg5/q;->r0:I

    .line 235
    .line 236
    const-wide/16 v6, 0x0

    .line 237
    .line 238
    const/4 v5, 0x4

    .line 239
    const/4 v4, 0x0

    .line 240
    invoke-interface/range {v2 .. v7}, Lg5/k;->d(IIIJ)V

    .line 241
    .line 242
    .line 243
    iput v12, v1, Lg5/q;->r0:I

    .line 244
    .line 245
    iput-object v11, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 246
    .line 247
    return v8

    .line 248
    :cond_e
    iget-boolean v3, v1, Lg5/q;->D0:Z

    .line 249
    .line 250
    if-nez v3, :cond_10

    .line 251
    .line 252
    invoke-virtual {v10, v13}, Lq4/d;->d(I)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-nez v3, :cond_10

    .line 257
    .line 258
    invoke-virtual {v10}, Lu4/f;->h()V

    .line 259
    .line 260
    .line 261
    iget v0, v1, Lg5/q;->A0:I

    .line 262
    .line 263
    if-ne v0, v9, :cond_f

    .line 264
    .line 265
    iput v13, v1, Lg5/q;->A0:I

    .line 266
    .line 267
    :cond_f
    return v13

    .line 268
    :cond_10
    invoke-virtual {v1, v10}, Lg5/q;->o0(Lu4/f;)Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-eqz v3, :cond_11

    .line 273
    .line 274
    invoke-virtual {v10}, Lu4/f;->h()V

    .line 275
    .line 276
    .line 277
    iget-object v0, v1, Lg5/q;->N0:Lv4/f;

    .line 278
    .line 279
    iget v2, v0, Lv4/f;->d:I

    .line 280
    .line 281
    add-int/2addr v2, v13

    .line 282
    iput v2, v0, Lv4/f;->d:I

    .line 283
    .line 284
    return v13

    .line 285
    :cond_11
    const/high16 v3, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v10, v3}, Lq4/d;->d(I)Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-eqz v3, :cond_14

    .line 292
    .line 293
    iget-object v4, v10, Lu4/f;->d:Lu4/b;

    .line 294
    .line 295
    if-nez v0, :cond_12

    .line 296
    .line 297
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_12
    iget-object v5, v4, Lu4/b;->d:[I

    .line 302
    .line 303
    if-nez v5, :cond_13

    .line 304
    .line 305
    new-array v5, v13, [I

    .line 306
    .line 307
    iput-object v5, v4, Lu4/b;->d:[I

    .line 308
    .line 309
    iget-object v6, v4, Lu4/b;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 310
    .line 311
    iput-object v5, v6, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 312
    .line 313
    :cond_13
    iget-object v4, v4, Lu4/b;->d:[I

    .line 314
    .line 315
    aget v5, v4, v8

    .line 316
    .line 317
    add-int/2addr v5, v0

    .line 318
    aput v5, v4, v8

    .line 319
    .line 320
    :cond_14
    :goto_2
    iget-wide v5, v10, Lu4/f;->g:J

    .line 321
    .line 322
    iget-boolean v0, v1, Lg5/q;->K0:Z

    .line 323
    .line 324
    if-eqz v0, :cond_16

    .line 325
    .line 326
    iget-object v0, v1, Lg5/q;->z:Ljava/util/ArrayDeque;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-nez v4, :cond_15

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Lg5/p;

    .line 339
    .line 340
    iget-object v0, v0, Lg5/p;->d:Lce/g;

    .line 341
    .line 342
    iget-object v4, v1, Lg5/q;->B:Lm4/q;

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v5, v6, v4}, Lce/g;->a(JLjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_15
    iget-object v0, v1, Lg5/q;->O0:Lg5/p;

    .line 352
    .line 353
    iget-object v0, v0, Lg5/p;->d:Lce/g;

    .line 354
    .line 355
    iget-object v4, v1, Lg5/q;->B:Lm4/q;

    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v5, v6, v4}, Lce/g;->a(JLjava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :goto_3
    iput-boolean v8, v1, Lg5/q;->K0:Z

    .line 364
    .line 365
    :cond_16
    iget-wide v14, v1, Lg5/q;->G0:J

    .line 366
    .line 367
    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 368
    .line 369
    .line 370
    move-result-wide v14

    .line 371
    iput-wide v14, v1, Lg5/q;->G0:J

    .line 372
    .line 373
    invoke-virtual {v1}, Lv4/e;->j()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-nez v0, :cond_17

    .line 378
    .line 379
    const/high16 v0, 0x20000000

    .line 380
    .line 381
    invoke-virtual {v10, v0}, Lq4/d;->d(I)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_18

    .line 386
    .line 387
    :cond_17
    iget-wide v14, v1, Lg5/q;->G0:J

    .line 388
    .line 389
    iput-wide v14, v1, Lg5/q;->H0:J

    .line 390
    .line 391
    :cond_18
    invoke-virtual {v10}, Lu4/f;->k()V

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x10000000

    .line 395
    .line 396
    invoke-virtual {v10, v0}, Lq4/d;->d(I)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_19

    .line 401
    .line 402
    invoke-virtual {v1, v10}, Lg5/q;->P(Lu4/f;)V

    .line 403
    .line 404
    .line 405
    :cond_19
    invoke-virtual {v1, v10}, Lg5/q;->d0(Lu4/f;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v10}, Lg5/q;->K(Lu4/f;)I

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    if-eqz v3, :cond_1a

    .line 413
    .line 414
    iget v3, v1, Lg5/q;->r0:I

    .line 415
    .line 416
    iget-object v4, v10, Lu4/f;->d:Lu4/b;

    .line 417
    .line 418
    invoke-interface/range {v2 .. v7}, Lg5/k;->e(ILu4/b;JI)V

    .line 419
    .line 420
    .line 421
    goto :goto_4

    .line 422
    :cond_1a
    iget v3, v1, Lg5/q;->r0:I

    .line 423
    .line 424
    iget-object v0, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    move-wide/from16 v16, v5

    .line 434
    .line 435
    move v5, v7

    .line 436
    move-wide/from16 v6, v16

    .line 437
    .line 438
    invoke-interface/range {v2 .. v7}, Lg5/k;->d(IIIJ)V

    .line 439
    .line 440
    .line 441
    :goto_4
    iput v12, v1, Lg5/q;->r0:I

    .line 442
    .line 443
    iput-object v11, v10, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 444
    .line 445
    iput-boolean v13, v1, Lg5/q;->D0:Z

    .line 446
    .line 447
    iput v8, v1, Lg5/q;->A0:I

    .line 448
    .line 449
    iget-object v0, v1, Lg5/q;->N0:Lv4/f;

    .line 450
    .line 451
    iget v2, v0, Lv4/f;->c:I

    .line 452
    .line 453
    add-int/2addr v2, v13

    .line 454
    iput v2, v0, Lv4/f;->c:I

    .line 455
    .line 456
    return v13

    .line 457
    :catch_0
    move-exception v0

    .line 458
    invoke-virtual {v1, v0}, Lg5/q;->V(Ljava/lang/Exception;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v8}, Lg5/q;->g0(I)Z

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1}, Lg5/q;->H()V

    .line 465
    .line 466
    .line 467
    return v13

    .line 468
    :cond_1b
    :goto_5
    return v8
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

.method public final H()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 2
    .line 3
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lg5/k;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lg5/q;->j0()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-virtual {p0}, Lg5/q;->j0()V

    .line 15
    .line 16
    .line 17
    throw v0
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

.method public final I()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lg5/q;->C0:I

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v2, :cond_5

    .line 12
    .line 13
    iget-boolean v2, p0, Lg5/q;->T:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-boolean v2, p0, Lg5/q;->F0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    :cond_1
    iget-boolean v2, p0, Lg5/q;->U:Z

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-boolean v2, p0, Lg5/q;->E0:Z

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 v2, 0x2

    .line 31
    if-ne v0, v2, :cond_4

    .line 32
    .line 33
    sget v0, Lp4/c0;->a:I

    .line 34
    .line 35
    const/16 v2, 0x17

    .line 36
    .line 37
    if-lt v0, v2, :cond_3

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    const/4 v4, 0x0

    .line 42
    :goto_0
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 43
    .line 44
    .line 45
    if-lt v0, v2, :cond_4

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {p0}, Lg5/q;->s0()V
    :try_end_0
    .catch Lv4/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_0
    move-exception v0

    .line 52
    const-string v1, "MediaCodecRenderer"

    .line 53
    .line 54
    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    .line 55
    .line 56
    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 60
    .line 61
    .line 62
    return v3

    .line 63
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lg5/q;->H()V

    .line 64
    .line 65
    .line 66
    return v1

    .line 67
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 68
    .line 69
    .line 70
    return v3
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

.method public final J(Z)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lg5/q;->B:Lm4/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg5/q;->s:Lg5/r;

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0, p1}, Lg5/q;->N(Lg5/r;Lm4/q;Z)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, v1, v0, p1}, Lg5/q;->N(Lg5/r;Lm4/q;Z)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "Drm session requires secure decoder for "

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", but no secure decoder available. Trying to proceed with "

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "."

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "MediaCodecRenderer"

    .line 61
    .line 62
    invoke-static {v1, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-object p1

    .line 66
    :cond_1
    return-object v2
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

.method public K(Lu4/f;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public L()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public abstract M(F[Lm4/q;)F
.end method

.method public abstract N(Lg5/r;Lm4/q;Z)Ljava/util/ArrayList;
.end method

.method public abstract O(Lg5/n;Lm4/q;Landroid/media/MediaCrypto;F)Lb7/b1;
.end method

.method public abstract P(Lu4/f;)V
.end method

.method public final Q(Lg5/n;Landroid/media/MediaCrypto;)V
    .locals 12

    .line 1
    const-string v0, "createCodec:"

    .line 2
    .line 3
    iget-object v1, p0, Lg5/q;->B:Lm4/q;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v7, p1, Lg5/n;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget v2, Lp4/c0;->a:I

    .line 11
    .line 12
    const/high16 v3, -0x40800000    # -1.0f

    .line 13
    .line 14
    const/16 v4, 0x17

    .line 15
    .line 16
    if-ge v2, v4, :cond_0

    .line 17
    .line 18
    const/high16 v5, -0x40800000    # -1.0f

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v5, p0, Lg5/q;->J:F

    .line 22
    .line 23
    iget-object v6, p0, Lv4/e;->j:[Lm4/q;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v5, v6}, Lg5/q;->M(F[Lm4/q;)F

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    :goto_0
    iget v6, p0, Lg5/q;->t:F

    .line 33
    .line 34
    cmpg-float v6, v5, v6

    .line 35
    .line 36
    if-gtz v6, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v3, v5

    .line 40
    :goto_1
    iget-object v5, p0, Lv4/e;->g:Lp4/v;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-virtual {p0, p1, v1, p2, v3}, Lg5/q;->O(Lg5/n;Lm4/q;Landroid/media/MediaCrypto;F)Lb7/b1;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/16 v8, 0x1f

    .line 54
    .line 55
    if-lt v2, v8, :cond_2

    .line 56
    .line 57
    iget-object v8, p0, Lv4/e;->f:Lw4/k;

    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v8, v8, Lw4/k;->b:Lw4/j;

    .line 63
    .line 64
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v8, v8, Lw4/j;->a:Landroid/media/metrics/LogSessionId;

    .line 68
    .line 69
    invoke-static {}, Lp4/a0;->d()Landroid/media/metrics/LogSessionId;

    .line 70
    .line 71
    .line 72
    invoke-static {v8}, Lw4/h;->i(Landroid/media/metrics/LogSessionId;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-nez v9, :cond_2

    .line 77
    .line 78
    iget-object v9, p2, Lb7/b1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v9, Landroid/media/MediaFormat;

    .line 81
    .line 82
    const-string v10, "log-session-id"

    .line 83
    .line 84
    invoke-static {v8}, Lb5/b0;->p(Landroid/media/metrics/LogSessionId;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v9, v10, v8}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lg5/q;->r:Lg5/j;

    .line 107
    .line 108
    invoke-interface {v0, p2}, Lg5/j;->P0(Lb7/b1;)Lg5/k;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    iput-object p2, p0, Lg5/q;->K:Lg5/k;

    .line 113
    .line 114
    new-instance v0, Lb0/c1;

    .line 115
    .line 116
    const/16 v8, 0x15

    .line 117
    .line 118
    invoke-direct {v0, v8, p0}, Lb0/c1;-><init>(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p2, v0}, Lg5/k;->j0(Lb0/c1;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 125
    .line 126
    .line 127
    iget-object p2, p0, Lv4/e;->g:Lp4/v;

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move p2, v3

    .line 133
    const/16 v0, 0x17

    .line 134
    .line 135
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v3

    .line 139
    invoke-virtual {p1, v1}, Lg5/n;->d(Lm4/q;)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-nez v8, :cond_3

    .line 144
    .line 145
    invoke-static {v1}, Lm4/q;->c(Lm4/q;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 150
    .line 151
    new-instance v9, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v10, "Format exceeds selected codec\'s capabilities ["

    .line 154
    .line 155
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v8, ", "

    .line 162
    .line 163
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v8, "]"

    .line 170
    .line 171
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    const-string v9, "MediaCodecRenderer"

    .line 179
    .line 180
    invoke-static {v9, v8}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :cond_3
    iput-object p1, p0, Lg5/q;->R:Lg5/n;

    .line 184
    .line 185
    iput p2, p0, Lg5/q;->O:F

    .line 186
    .line 187
    iput-object v1, p0, Lg5/q;->L:Lm4/q;

    .line 188
    .line 189
    const/4 p2, 0x2

    .line 190
    const/16 v1, 0x19

    .line 191
    .line 192
    const/4 v8, 0x0

    .line 193
    const/4 v9, 0x1

    .line 194
    if-gt v2, v1, :cond_5

    .line 195
    .line 196
    const-string v10, "OMX.Exynos.avc.dec.secure"

    .line 197
    .line 198
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-eqz v10, :cond_5

    .line 203
    .line 204
    sget-object v10, Lp4/c0;->d:Ljava/lang/String;

    .line 205
    .line 206
    const-string v11, "SM-T585"

    .line 207
    .line 208
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-nez v11, :cond_4

    .line 213
    .line 214
    const-string v11, "SM-A510"

    .line 215
    .line 216
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    if-nez v11, :cond_4

    .line 221
    .line 222
    const-string v11, "SM-A520"

    .line 223
    .line 224
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    if-nez v11, :cond_4

    .line 229
    .line 230
    const-string v11, "SM-J700"

    .line 231
    .line 232
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_5

    .line 237
    .line 238
    :cond_4
    const/4 v10, 0x2

    .line 239
    goto :goto_2

    .line 240
    :cond_5
    const/16 v10, 0x18

    .line 241
    .line 242
    if-ge v2, v10, :cond_8

    .line 243
    .line 244
    const-string v10, "OMX.Nvidia.h264.decode"

    .line 245
    .line 246
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-nez v10, :cond_6

    .line 251
    .line 252
    const-string v10, "OMX.Nvidia.h264.decode.secure"

    .line 253
    .line 254
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    if-eqz v10, :cond_8

    .line 259
    .line 260
    :cond_6
    sget-object v10, Lp4/c0;->b:Ljava/lang/String;

    .line 261
    .line 262
    const-string v11, "flounder"

    .line 263
    .line 264
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    if-nez v11, :cond_7

    .line 269
    .line 270
    const-string v11, "flounder_lte"

    .line 271
    .line 272
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    if-nez v11, :cond_7

    .line 277
    .line 278
    const-string v11, "grouper"

    .line 279
    .line 280
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    if-nez v11, :cond_7

    .line 285
    .line 286
    const-string v11, "tilapia"

    .line 287
    .line 288
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    if-eqz v10, :cond_8

    .line 293
    .line 294
    :cond_7
    const/4 v10, 0x1

    .line 295
    goto :goto_2

    .line 296
    :cond_8
    const/4 v10, 0x0

    .line 297
    :goto_2
    iput v10, p0, Lg5/q;->S:I

    .line 298
    .line 299
    const/16 v10, 0x1d

    .line 300
    .line 301
    if-ne v2, v10, :cond_9

    .line 302
    .line 303
    const-string v11, "c2.android.aac.decoder"

    .line 304
    .line 305
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    if-eqz v11, :cond_9

    .line 310
    .line 311
    const/4 v11, 0x1

    .line 312
    goto :goto_3

    .line 313
    :cond_9
    const/4 v11, 0x0

    .line 314
    :goto_3
    iput-boolean v11, p0, Lg5/q;->T:Z

    .line 315
    .line 316
    if-gt v2, v0, :cond_a

    .line 317
    .line 318
    const-string v0, "OMX.google.vorbis.decoder"

    .line 319
    .line 320
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_a

    .line 325
    .line 326
    const/4 v0, 0x1

    .line 327
    goto :goto_4

    .line 328
    :cond_a
    const/4 v0, 0x0

    .line 329
    :goto_4
    iput-boolean v0, p0, Lg5/q;->U:Z

    .line 330
    .line 331
    const/16 v0, 0x15

    .line 332
    .line 333
    if-ne v2, v0, :cond_b

    .line 334
    .line 335
    const-string v0, "OMX.google.aac.decoder"

    .line 336
    .line 337
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_b

    .line 342
    .line 343
    const/4 v0, 0x1

    .line 344
    goto :goto_5

    .line 345
    :cond_b
    const/4 v0, 0x0

    .line 346
    :goto_5
    iput-boolean v0, p0, Lg5/q;->V:Z

    .line 347
    .line 348
    iget-object v0, p1, Lg5/n;->a:Ljava/lang/String;

    .line 349
    .line 350
    if-gt v2, v1, :cond_c

    .line 351
    .line 352
    const-string v1, "OMX.rk.video_decoder.avc"

    .line 353
    .line 354
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-nez v1, :cond_f

    .line 359
    .line 360
    :cond_c
    if-gt v2, v10, :cond_d

    .line 361
    .line 362
    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    .line 363
    .line 364
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-nez v1, :cond_f

    .line 369
    .line 370
    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 371
    .line 372
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-nez v1, :cond_f

    .line 377
    .line 378
    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    .line 379
    .line 380
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-nez v1, :cond_f

    .line 385
    .line 386
    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 387
    .line 388
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-nez v1, :cond_f

    .line 393
    .line 394
    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    .line 395
    .line 396
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-nez v1, :cond_f

    .line 401
    .line 402
    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 403
    .line 404
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_f

    .line 409
    .line 410
    :cond_d
    const-string v0, "Amazon"

    .line 411
    .line 412
    sget-object v1, Lp4/c0;->c:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_e

    .line 419
    .line 420
    const-string v0, "AFTS"

    .line 421
    .line 422
    sget-object v1, Lp4/c0;->d:Ljava/lang/String;

    .line 423
    .line 424
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-eqz v0, :cond_e

    .line 429
    .line 430
    iget-boolean p1, p1, Lg5/n;->f:Z

    .line 431
    .line 432
    if-eqz p1, :cond_e

    .line 433
    .line 434
    goto :goto_6

    .line 435
    :cond_e
    invoke-virtual {p0}, Lg5/q;->L()Z

    .line 436
    .line 437
    .line 438
    move-result p1

    .line 439
    if-eqz p1, :cond_10

    .line 440
    .line 441
    :cond_f
    :goto_6
    const/4 v8, 0x1

    .line 442
    :cond_10
    iput-boolean v8, p0, Lg5/q;->Y:Z

    .line 443
    .line 444
    iget-object p1, p0, Lg5/q;->K:Lg5/k;

    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iget p1, p0, Lv4/e;->h:I

    .line 450
    .line 451
    if-ne p1, p2, :cond_11

    .line 452
    .line 453
    iget-object p1, p0, Lv4/e;->g:Lp4/v;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 459
    .line 460
    .line 461
    move-result-wide p1

    .line 462
    const-wide/16 v0, 0x3e8

    .line 463
    .line 464
    add-long/2addr p1, v0

    .line 465
    iput-wide p1, p0, Lg5/q;->q0:J

    .line 466
    .line 467
    :cond_11
    iget-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 468
    .line 469
    iget p2, p1, Lv4/f;->a:I

    .line 470
    .line 471
    add-int/2addr p2, v9

    .line 472
    iput p2, p1, Lv4/f;->a:I

    .line 473
    .line 474
    sub-long v5, v3, v5

    .line 475
    .line 476
    move-object v2, p0

    .line 477
    invoke-virtual/range {v2 .. v7}, Lg5/q;->W(JJLjava/lang/String;)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :catchall_0
    move-exception v0

    .line 482
    move-object p1, v0

    .line 483
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 484
    .line 485
    .line 486
    throw p1
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
.end method

.method public final R(JJ)Z
    .locals 2

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    if-gez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lg5/q;->C:Lm4/q;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "audio/opus"

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sub-long/2addr p1, p3

    .line 20
    const-wide/32 p3, 0x13880

    .line 21
    .line 22
    .line 23
    cmp-long v0, p1, p3

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1
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

.method public final S()V
    .locals 8

    .line 1
    iget-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    iget-boolean v0, p0, Lg5/q;->w0:Z

    .line 6
    .line 7
    if-nez v0, :cond_b

    .line 8
    .line 9
    iget-object v0, p0, Lg5/q;->B:Lm4/q;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Lm4/q;->n:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lg5/q;->E:Lb5/l;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lg5/q;->p0(Lm4/q;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Lg5/q;->D()V

    .line 29
    .line 30
    .line 31
    const-string v0, "audio/mp4a-latm"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v2, p0, Lg5/q;->x:Lg5/g;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-string v0, "audio/mpeg"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const-string v0, "audio/opus"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iput v3, v2, Lg5/g;->l:I

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/16 v0, 0x20

    .line 67
    .line 68
    iput v0, v2, Lg5/g;->l:I

    .line 69
    .line 70
    :goto_0
    iput-boolean v3, p0, Lg5/q;->w0:Z

    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    iget-object v2, p0, Lg5/q;->E:Lb5/l;

    .line 74
    .line 75
    invoke-virtual {p0, v2}, Lg5/q;->l0(Lb5/l;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, p0, Lg5/q;->D:Lb5/l;

    .line 79
    .line 80
    const/4 v4, 0x4

    .line 81
    const/4 v5, 0x0

    .line 82
    if-eqz v2, :cond_7

    .line 83
    .line 84
    iget-object v2, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 85
    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    const/4 v2, 0x0

    .line 91
    :goto_1
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Lg5/q;->D:Lb5/l;

    .line 95
    .line 96
    invoke-interface {v2}, Lb5/l;->h()Lu4/a;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    sget-boolean v7, Lb5/y;->c:Z

    .line 101
    .line 102
    if-eqz v7, :cond_5

    .line 103
    .line 104
    instance-of v7, v6, Lb5/y;

    .line 105
    .line 106
    if-eqz v7, :cond_5

    .line 107
    .line 108
    invoke-interface {v2}, Lb5/l;->e()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eq v7, v3, :cond_4

    .line 113
    .line 114
    if-eq v7, v4, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_4
    invoke-interface {v2}, Lb5/l;->g()Lb5/k;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lg5/q;->B:Lm4/q;

    .line 125
    .line 126
    iget v2, v0, Lb5/k;->a:I

    .line 127
    .line 128
    invoke-virtual {p0, v0, v1, v5, v2}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    throw v0

    .line 133
    :cond_5
    if-nez v6, :cond_6

    .line 134
    .line 135
    invoke-interface {v2}, Lb5/l;->g()Lb5/k;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_a

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    instance-of v2, v6, Lb5/y;

    .line 143
    .line 144
    if-eqz v2, :cond_7

    .line 145
    .line 146
    check-cast v6, Lb5/y;

    .line 147
    .line 148
    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    .line 149
    .line 150
    iget-object v7, v6, Lb5/y;->a:Ljava/util/UUID;

    .line 151
    .line 152
    iget-object v6, v6, Lb5/y;->b:[B

    .line 153
    .line 154
    invoke-direct {v2, v7, v6}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    .line 155
    .line 156
    .line 157
    iput-object v2, p0, Lg5/q;->G:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catch_0
    move-exception v0

    .line 161
    iget-object v1, p0, Lg5/q;->B:Lm4/q;

    .line 162
    .line 163
    const/16 v2, 0x1776

    .line 164
    .line 165
    invoke-virtual {p0, v0, v1, v5, v2}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    throw v0

    .line 170
    :cond_7
    :goto_2
    :try_start_1
    iget-object v2, p0, Lg5/q;->D:Lb5/l;

    .line 171
    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    invoke-interface {v2}, Lb5/l;->e()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    const/4 v6, 0x3

    .line 179
    if-eq v2, v6, :cond_8

    .line 180
    .line 181
    iget-object v2, p0, Lg5/q;->D:Lb5/l;

    .line 182
    .line 183
    invoke-interface {v2}, Lb5/l;->e()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-ne v2, v4, :cond_9

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :catch_1
    move-exception v1

    .line 191
    goto :goto_6

    .line 192
    :cond_8
    :goto_3
    iget-object v2, p0, Lg5/q;->D:Lb5/l;

    .line 193
    .line 194
    invoke-static {v1}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v2, v1}, Lb5/l;->f(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_9

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_9
    const/4 v3, 0x0

    .line 205
    :goto_4
    iget-object v1, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 206
    .line 207
    invoke-virtual {p0, v1, v3}, Lg5/q;->T(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Lg5/o; {:try_start_1 .. :try_end_1} :catch_1

    .line 208
    .line 209
    .line 210
    :cond_a
    :goto_5
    iget-object v0, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 211
    .line 212
    if-eqz v0, :cond_b

    .line 213
    .line 214
    iget-object v1, p0, Lg5/q;->K:Lg5/k;

    .line 215
    .line 216
    if-nez v1, :cond_b

    .line 217
    .line 218
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    iput-object v0, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 223
    .line 224
    return-void

    .line 225
    :goto_6
    const/16 v2, 0xfa1

    .line 226
    .line 227
    invoke-virtual {p0, v1, v0, v5, v2}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    throw v0

    .line 232
    :cond_b
    :goto_7
    return-void
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

.method public final T(Landroid/media/MediaCrypto;Z)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    iget-object v9, v1, Lg5/q;->B:Lm4/q;

    .line 6
    .line 7
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, v6}, Lg5/q;->J(Z)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, v1, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lg5/n;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iput-object v10, v1, Lg5/q;->Q:Lg5/o;
    :try_end_0
    .catch Lg5/u; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_1
    new-instance v2, Lg5/o;

    .line 53
    .line 54
    const v3, -0xc34e

    .line 55
    .line 56
    .line 57
    invoke-direct {v2, v9, v0, v6, v3}, Lg5/o;-><init>(Lm4/q;Lg5/u;ZI)V

    .line 58
    .line 59
    .line 60
    throw v2

    .line 61
    :cond_1
    :goto_2
    iget-object v0, v1, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    iget-object v11, v1, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :goto_3
    iget-object v0, v1, Lg5/q;->K:Lg5/k;

    .line 75
    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v7, v0

    .line 83
    check-cast v7, Lg5/n;

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v9}, Lg5/q;->U(Lm4/q;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_2
    invoke-virtual {v1, v7}, Lg5/q;->n0(Lg5/n;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    :goto_4
    return-void

    .line 102
    :cond_3
    move-object/from16 v12, p1

    .line 103
    .line 104
    :try_start_1
    invoke-virtual {v1, v7, v12}, Lg5/q;->Q(Lg5/n;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catch_1
    move-exception v0

    .line 109
    move-object v4, v0

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Failed to initialize decoder: "

    .line 113
    .line 114
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v2, "MediaCodecRenderer"

    .line 125
    .line 126
    invoke-static {v2, v0, v4}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    new-instance v2, Lg5/o;

    .line 133
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v3, "Decoder init failed: "

    .line 137
    .line 138
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v3, v7, Lg5/n;->a:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v3, ", "

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget-object v5, v9, Lm4/q;->n:Ljava/lang/String;

    .line 159
    .line 160
    instance-of v0, v4, Landroid/media/MediaCodec$CodecException;

    .line 161
    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    move-object v0, v4

    .line 165
    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    move-object v8, v0

    .line 172
    goto :goto_5

    .line 173
    :cond_4
    move-object v8, v10

    .line 174
    :goto_5
    invoke-direct/range {v2 .. v8}, Lg5/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLg5/n;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, Lg5/q;->V(Ljava/lang/Exception;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, v1, Lg5/q;->Q:Lg5/o;

    .line 181
    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    iput-object v2, v1, Lg5/q;->Q:Lg5/o;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_5
    new-instance v13, Lg5/o;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    iget-object v2, v0, Lg5/o;->a:Ljava/lang/String;

    .line 198
    .line 199
    iget-boolean v3, v0, Lg5/o;->b:Z

    .line 200
    .line 201
    iget-object v4, v0, Lg5/o;->c:Lg5/n;

    .line 202
    .line 203
    iget-object v0, v0, Lg5/o;->d:Ljava/lang/String;

    .line 204
    .line 205
    move-object/from16 v19, v0

    .line 206
    .line 207
    move-object/from16 v16, v2

    .line 208
    .line 209
    move/from16 v17, v3

    .line 210
    .line 211
    move-object/from16 v18, v4

    .line 212
    .line 213
    invoke-direct/range {v13 .. v19}, Lg5/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLg5/n;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iput-object v13, v1, Lg5/q;->Q:Lg5/o;

    .line 217
    .line 218
    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_6

    .line 223
    .line 224
    goto/16 :goto_3

    .line 225
    .line 226
    :cond_6
    iget-object v0, v1, Lg5/q;->Q:Lg5/o;

    .line 227
    .line 228
    throw v0

    .line 229
    :cond_7
    iput-object v10, v1, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 230
    .line 231
    return-void

    .line 232
    :cond_8
    new-instance v0, Lg5/o;

    .line 233
    .line 234
    const v2, -0xc34f

    .line 235
    .line 236
    .line 237
    invoke-direct {v0, v9, v10, v6, v2}, Lg5/o;-><init>(Lm4/q;Lg5/u;ZI)V

    .line 238
    .line 239
    .line 240
    throw v0
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
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
.end method

.method public U(Lm4/q;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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

.method public abstract V(Ljava/lang/Exception;)V
.end method

.method public abstract W(JJLjava/lang/String;)V
.end method

.method public abstract X(Ljava/lang/String;)V
.end method

.method public Y(Lv2/e;)Lv4/g;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg5/q;->K0:Z

    .line 3
    .line 4
    iget-object v1, p1, Lv2/e;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lm4/q;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Lm4/q;->n:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_24

    .line 15
    .line 16
    const-string v4, "video/av01"

    .line 17
    .line 18
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Lm4/q;->q:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Lm4/q;->a()Lm4/p;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v4, v1, Lm4/p;->p:Ljava/util/List;

    .line 38
    .line 39
    new-instance v2, Lm4/q;

    .line 40
    .line 41
    invoke-direct {v2, v1}, Lm4/q;-><init>(Lm4/p;)V

    .line 42
    .line 43
    .line 44
    move-object v8, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v8, v1

    .line 47
    :goto_0
    iget-object p1, p1, Lv2/e;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lb5/l;

    .line 50
    .line 51
    iget-object v1, p0, Lg5/q;->E:Lb5/l;

    .line 52
    .line 53
    if-ne v1, p1, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-interface {p1, v4}, Lb5/l;->b(Lb5/q;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-interface {v1, v4}, Lb5/l;->c(Lb5/q;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_1
    iput-object p1, p0, Lg5/q;->E:Lb5/l;

    .line 67
    .line 68
    iput-object v8, p0, Lg5/q;->B:Lm4/q;

    .line 69
    .line 70
    iget-boolean p1, p0, Lg5/q;->w0:Z

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    iput-boolean v0, p0, Lg5/q;->y0:Z

    .line 75
    .line 76
    return-object v4

    .line 77
    :cond_4
    iget-object p1, p0, Lg5/q;->K:Lg5/k;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    iput-object v4, p0, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 84
    .line 85
    .line 86
    return-object v4

    .line 87
    :cond_5
    iget-object v1, p0, Lg5/q;->R:Lg5/n;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v7, p0, Lg5/q;->L:Lm4/q;

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Lg5/q;->D:Lb5/l;

    .line 98
    .line 99
    iget-object v4, p0, Lg5/q;->E:Lb5/l;

    .line 100
    .line 101
    const/16 v5, 0x17

    .line 102
    .line 103
    const/4 v6, 0x3

    .line 104
    const/4 v9, 0x2

    .line 105
    if-ne v2, v4, :cond_6

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_6
    if-eqz v4, :cond_22

    .line 110
    .line 111
    if-nez v2, :cond_7

    .line 112
    .line 113
    goto/16 :goto_a

    .line 114
    .line 115
    :cond_7
    invoke-interface {v4}, Lb5/l;->h()Lu4/a;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    if-nez v10, :cond_8

    .line 120
    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :cond_8
    invoke-interface {v2}, Lb5/l;->h()Lu4/a;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    if-eqz v11, :cond_22

    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-nez v11, :cond_9

    .line 142
    .line 143
    goto/16 :goto_a

    .line 144
    .line 145
    :cond_9
    instance-of v10, v10, Lb5/y;

    .line 146
    .line 147
    if-nez v10, :cond_a

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    invoke-interface {v4}, Lb5/l;->a()Ljava/util/UUID;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-interface {v2}, Lb5/l;->a()Ljava/util/UUID;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    invoke-virtual {v10, v11}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_b

    .line 163
    .line 164
    goto/16 :goto_a

    .line 165
    .line 166
    :cond_b
    sget v10, Lp4/c0;->a:I

    .line 167
    .line 168
    if-ge v10, v5, :cond_c

    .line 169
    .line 170
    goto/16 :goto_a

    .line 171
    .line 172
    :cond_c
    sget-object v10, Lm4/g;->e:Ljava/util/UUID;

    .line 173
    .line 174
    invoke-interface {v2}, Lb5/l;->a()Ljava/util/UUID;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-nez v2, :cond_22

    .line 183
    .line 184
    invoke-interface {v4}, Lb5/l;->a()Ljava/util/UUID;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_d

    .line 193
    .line 194
    goto/16 :goto_a

    .line 195
    .line 196
    :cond_d
    iget-boolean v2, v1, Lg5/n;->f:Z

    .line 197
    .line 198
    if-nez v2, :cond_f

    .line 199
    .line 200
    invoke-interface {v4}, Lb5/l;->e()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eq v2, v9, :cond_22

    .line 205
    .line 206
    invoke-interface {v4}, Lb5/l;->e()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eq v2, v6, :cond_e

    .line 211
    .line 212
    invoke-interface {v4}, Lb5/l;->e()I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    const/4 v10, 0x4

    .line 217
    if-ne v2, v10, :cond_f

    .line 218
    .line 219
    :cond_e
    iget-object v2, v8, Lm4/q;->n:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-interface {v4, v2}, Lb5/l;->f(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_f

    .line 229
    .line 230
    goto/16 :goto_a

    .line 231
    .line 232
    :cond_f
    :goto_2
    iget-object v2, p0, Lg5/q;->E:Lb5/l;

    .line 233
    .line 234
    iget-object v4, p0, Lg5/q;->D:Lb5/l;

    .line 235
    .line 236
    if-eq v2, v4, :cond_10

    .line 237
    .line 238
    const/4 v2, 0x1

    .line 239
    goto :goto_3

    .line 240
    :cond_10
    const/4 v2, 0x0

    .line 241
    :goto_3
    if-eqz v2, :cond_12

    .line 242
    .line 243
    sget v4, Lp4/c0;->a:I

    .line 244
    .line 245
    if-lt v4, v5, :cond_11

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_11
    const/4 v4, 0x0

    .line 249
    goto :goto_5

    .line 250
    :cond_12
    :goto_4
    const/4 v4, 0x1

    .line 251
    :goto_5
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, v1, v7, v8}, Lg5/q;->B(Lg5/n;Lm4/q;Lm4/q;)Lv4/g;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    iget v5, v4, Lv4/g;->d:I

    .line 259
    .line 260
    if-eqz v5, :cond_1d

    .line 261
    .line 262
    const/16 v10, 0x10

    .line 263
    .line 264
    if-eq v5, v0, :cond_19

    .line 265
    .line 266
    if-eq v5, v9, :cond_15

    .line 267
    .line 268
    if-ne v5, v6, :cond_14

    .line 269
    .line 270
    invoke-virtual {p0, v8}, Lg5/q;->r0(Lm4/q;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-nez v0, :cond_13

    .line 275
    .line 276
    goto/16 :goto_9

    .line 277
    .line 278
    :cond_13
    iput-object v8, p0, Lg5/q;->L:Lm4/q;

    .line 279
    .line 280
    if-eqz v2, :cond_1f

    .line 281
    .line 282
    invoke-virtual {p0}, Lg5/q;->E()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_1f

    .line 287
    .line 288
    :goto_6
    const/4 v10, 0x2

    .line 289
    goto/16 :goto_9

    .line 290
    .line 291
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :cond_15
    invoke-virtual {p0, v8}, Lg5/q;->r0(Lm4/q;)Z

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    if-nez v11, :cond_16

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_16
    iput-boolean v0, p0, Lg5/q;->z0:Z

    .line 305
    .line 306
    iput v0, p0, Lg5/q;->A0:I

    .line 307
    .line 308
    iget v10, p0, Lg5/q;->S:I

    .line 309
    .line 310
    if-eq v10, v9, :cond_18

    .line 311
    .line 312
    if-ne v10, v0, :cond_17

    .line 313
    .line 314
    iget v10, v8, Lm4/q;->u:I

    .line 315
    .line 316
    iget v11, v7, Lm4/q;->u:I

    .line 317
    .line 318
    if-ne v10, v11, :cond_17

    .line 319
    .line 320
    iget v10, v8, Lm4/q;->v:I

    .line 321
    .line 322
    iget v11, v7, Lm4/q;->v:I

    .line 323
    .line 324
    if-ne v10, v11, :cond_17

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_17
    const/4 v0, 0x0

    .line 328
    :cond_18
    :goto_7
    iput-boolean v0, p0, Lg5/q;->W:Z

    .line 329
    .line 330
    iput-object v8, p0, Lg5/q;->L:Lm4/q;

    .line 331
    .line 332
    if-eqz v2, :cond_1f

    .line 333
    .line 334
    invoke-virtual {p0}, Lg5/q;->E()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-nez v0, :cond_1f

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_19
    invoke-virtual {p0, v8}, Lg5/q;->r0(Lm4/q;)Z

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    if-nez v11, :cond_1a

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_1a
    iput-object v8, p0, Lg5/q;->L:Lm4/q;

    .line 349
    .line 350
    if-eqz v2, :cond_1b

    .line 351
    .line 352
    invoke-virtual {p0}, Lg5/q;->E()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_1f

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_1b
    iget-boolean v2, p0, Lg5/q;->D0:Z

    .line 360
    .line 361
    if-eqz v2, :cond_1f

    .line 362
    .line 363
    iput v0, p0, Lg5/q;->B0:I

    .line 364
    .line 365
    iget-boolean v2, p0, Lg5/q;->U:Z

    .line 366
    .line 367
    if-eqz v2, :cond_1c

    .line 368
    .line 369
    iput v6, p0, Lg5/q;->C0:I

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_1c
    iput v0, p0, Lg5/q;->C0:I

    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_1d
    iget-boolean v2, p0, Lg5/q;->D0:Z

    .line 376
    .line 377
    if-eqz v2, :cond_1e

    .line 378
    .line 379
    iput v0, p0, Lg5/q;->B0:I

    .line 380
    .line 381
    iput v6, p0, Lg5/q;->C0:I

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_1e
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 388
    .line 389
    .line 390
    :cond_1f
    :goto_8
    const/4 v10, 0x0

    .line 391
    :goto_9
    if-eqz v5, :cond_21

    .line 392
    .line 393
    iget-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 394
    .line 395
    if-ne v0, p1, :cond_20

    .line 396
    .line 397
    iget p1, p0, Lg5/q;->C0:I

    .line 398
    .line 399
    if-ne p1, v6, :cond_21

    .line 400
    .line 401
    :cond_20
    new-instance v5, Lv4/g;

    .line 402
    .line 403
    iget-object v6, v1, Lg5/n;->a:Ljava/lang/String;

    .line 404
    .line 405
    const/4 v9, 0x0

    .line 406
    invoke-direct/range {v5 .. v10}, Lv4/g;-><init>(Ljava/lang/String;Lm4/q;Lm4/q;II)V

    .line 407
    .line 408
    .line 409
    return-object v5

    .line 410
    :cond_21
    return-object v4

    .line 411
    :cond_22
    :goto_a
    iget-boolean p1, p0, Lg5/q;->D0:Z

    .line 412
    .line 413
    if-eqz p1, :cond_23

    .line 414
    .line 415
    iput v0, p0, Lg5/q;->B0:I

    .line 416
    .line 417
    iput v6, p0, Lg5/q;->C0:I

    .line 418
    .line 419
    goto :goto_b

    .line 420
    :cond_23
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 424
    .line 425
    .line 426
    :goto_b
    new-instance v5, Lv4/g;

    .line 427
    .line 428
    iget-object v6, v1, Lg5/n;->a:Ljava/lang/String;

    .line 429
    .line 430
    const/4 v9, 0x0

    .line 431
    const/16 v10, 0x80

    .line 432
    .line 433
    invoke-direct/range {v5 .. v10}, Lv4/g;-><init>(Ljava/lang/String;Lm4/q;Lm4/q;II)V

    .line 434
    .line 435
    .line 436
    return-object v5

    .line 437
    :cond_24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 438
    .line 439
    const-string v0, "Sample MIME type is null."

    .line 440
    .line 441
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    const/16 v0, 0xfa5

    .line 445
    .line 446
    invoke-virtual {p0, p1, v1, v3, v0}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    throw p1
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

.method public abstract Z(Lm4/q;Landroid/media/MediaFormat;)V
.end method

.method public a0()V
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
.end method

.method public b0(J)V
    .locals 4

    .line 1
    iput-wide p1, p0, Lg5/q;->P0:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Lg5/q;->z:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lg5/p;

    .line 16
    .line 17
    iget-wide v1, v1, Lg5/p;->a:J

    .line 18
    .line 19
    cmp-long v3, p1, v1

    .line 20
    .line 21
    if-ltz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lg5/p;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lg5/q;->m0(Lg5/p;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lg5/q;->c0()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
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
.end method

.method public abstract c0()V
.end method

.method public d0(Lu4/f;)V
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

.method public final e0()V
    .locals 3

    .line 1
    iget v0, p0, Lg5/q;->C0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, Lg5/q;->J0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lg5/q;->i0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, Lg5/q;->H()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lg5/q;->s0()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-virtual {p0}, Lg5/q;->H()V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method public abstract f0(JJLg5/k;Ljava/nio/ByteBuffer;IIIJZZLm4/q;)Z
.end method

.method public final g0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/e;->c:Lv2/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv2/e;->n()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg5/q;->u:Lu4/f;

    .line 7
    .line 8
    invoke-virtual {v1}, Lu4/f;->h()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    or-int/2addr p1, v2

    .line 13
    invoke-virtual {p0, v0, v1, p1}, Lv4/e;->u(Lv2/e;Lu4/f;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, -0x5

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne p1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lg5/q;->Y(Lv2/e;)Lv4/g;

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :cond_0
    const/4 v0, -0x4

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lq4/d;->d(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iput-boolean v4, p0, Lg5/q;->I0:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lg5/q;->e0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
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
.end method

.method public final h0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lg5/q;->K:Lg5/k;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Lg5/k;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lg5/q;->N0:Lv4/f;

    .line 10
    .line 11
    iget v2, v1, Lv4/f;->b:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, Lv4/f;->b:I

    .line 16
    .line 17
    iget-object v1, p0, Lg5/q;->R:Lg5/n;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Lg5/n;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lg5/q;->X(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_3

    .line 30
    :cond_0
    :goto_0
    iput-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 31
    .line 32
    :try_start_1
    iget-object v1, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    iput-object v0, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lg5/q;->l0(Lb5/l;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lg5/q;->k0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_2
    iput-object v0, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lg5/q;->l0(Lb5/l;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lg5/q;->k0()V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :goto_3
    iput-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 61
    .line 62
    :try_start_2
    iget-object v2, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 67
    .line 68
    .line 69
    goto :goto_4

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    goto :goto_5

    .line 72
    :cond_2
    :goto_4
    iput-object v0, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lg5/q;->l0(Lb5/l;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lg5/q;->k0()V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :goto_5
    iput-object v0, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lg5/q;->l0(Lb5/l;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lg5/q;->k0()V

    .line 87
    .line 88
    .line 89
    throw v1
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

.method public abstract i0()V
.end method

.method public j0()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lg5/q;->r0:I

    .line 3
    .line 4
    iget-object v1, p0, Lg5/q;->v:Lu4/f;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, Lg5/q;->s0:I

    .line 10
    .line 11
    iput-object v2, p0, Lg5/q;->t0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Lg5/q;->q0:J

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-boolean v2, p0, Lg5/q;->E0:Z

    .line 22
    .line 23
    iput-wide v0, p0, Lg5/q;->Z:J

    .line 24
    .line 25
    iput-boolean v2, p0, Lg5/q;->D0:Z

    .line 26
    .line 27
    iput-boolean v2, p0, Lg5/q;->W:Z

    .line 28
    .line 29
    iput-boolean v2, p0, Lg5/q;->X:Z

    .line 30
    .line 31
    iput-boolean v2, p0, Lg5/q;->u0:Z

    .line 32
    .line 33
    iput-boolean v2, p0, Lg5/q;->v0:Z

    .line 34
    .line 35
    iput-wide v0, p0, Lg5/q;->G0:J

    .line 36
    .line 37
    iput-wide v0, p0, Lg5/q;->H0:J

    .line 38
    .line 39
    iput-wide v0, p0, Lg5/q;->P0:J

    .line 40
    .line 41
    iput v2, p0, Lg5/q;->B0:I

    .line 42
    .line 43
    iput v2, p0, Lg5/q;->C0:I

    .line 44
    .line 45
    iget-boolean v0, p0, Lg5/q;->z0:Z

    .line 46
    .line 47
    iput v0, p0, Lg5/q;->A0:I

    .line 48
    .line 49
    return-void
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

.method public final k0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg5/q;->j0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lg5/q;->M0:Lv4/m;

    .line 6
    .line 7
    iput-object v0, p0, Lg5/q;->P:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iput-object v0, p0, Lg5/q;->R:Lg5/n;

    .line 10
    .line 11
    iput-object v0, p0, Lg5/q;->L:Lm4/q;

    .line 12
    .line 13
    iput-object v0, p0, Lg5/q;->M:Landroid/media/MediaFormat;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lg5/q;->N:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lg5/q;->F0:Z

    .line 19
    .line 20
    const/high16 v1, -0x40800000    # -1.0f

    .line 21
    .line 22
    iput v1, p0, Lg5/q;->O:F

    .line 23
    .line 24
    iput v0, p0, Lg5/q;->S:I

    .line 25
    .line 26
    iput-boolean v0, p0, Lg5/q;->T:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lg5/q;->U:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lg5/q;->V:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lg5/q;->Y:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lg5/q;->z0:Z

    .line 35
    .line 36
    iput v0, p0, Lg5/q;->A0:I

    .line 37
    .line 38
    return-void
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
.end method

.method public l()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lg5/q;->B:Lm4/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, Lv4/e;->j()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lv4/e;->n:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lv4/e;->i:Lj5/c1;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lj5/c1;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    const/4 v2, 0x1

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget v0, p0, Lg5/q;->s0:I

    .line 28
    .line 29
    if-ltz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_1
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-wide v3, p0, Lg5/q;->q0:J

    .line 37
    .line 38
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v0, v3, v5

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, Lv4/e;->g:Lp4/v;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    iget-wide v5, p0, Lg5/q;->q0:J

    .line 57
    .line 58
    cmp-long v0, v3, v5

    .line 59
    .line 60
    if-gez v0, :cond_3

    .line 61
    .line 62
    :cond_2
    return v2

    .line 63
    :cond_3
    return v1
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

.method public final l0(Lb5/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/q;->D:Lb5/l;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v1}, Lb5/l;->b(Lb5/q;)V

    .line 10
    .line 11
    .line 12
    :cond_1
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lb5/l;->c(Lb5/q;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    :goto_0
    iput-object p1, p0, Lg5/q;->D:Lb5/l;

    .line 18
    .line 19
    return-void
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

.method public m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lg5/q;->B:Lm4/q;

    .line 3
    .line 4
    sget-object v0, Lg5/p;->e:Lg5/p;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lg5/q;->m0(Lg5/p;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lg5/q;->z:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lg5/q;->I()Z

    .line 15
    .line 16
    .line 17
    return-void
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

.method public final m0(Lg5/p;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lg5/q;->O0:Lg5/p;

    .line 2
    .line 3
    iget-wide v0, p1, Lg5/p;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lg5/q;->Q0:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lg5/q;->a0()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

.method public n0(Lg5/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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

.method public o(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lg5/q;->I0:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Lg5/q;->J0:Z

    .line 5
    .line 6
    iput-boolean p1, p0, Lg5/q;->L0:Z

    .line 7
    .line 8
    iget-boolean p2, p0, Lg5/q;->w0:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lg5/q;->x:Lg5/g;

    .line 13
    .line 14
    invoke-virtual {p2}, Lg5/g;->h()V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lg5/q;->w:Lu4/f;

    .line 18
    .line 19
    invoke-virtual {p2}, Lu4/f;->h()V

    .line 20
    .line 21
    .line 22
    iput-boolean p1, p0, Lg5/q;->x0:Z

    .line 23
    .line 24
    iget-object p2, p0, Lg5/q;->A:Lx4/y;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object p3, Ln4/f;->a:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    iput-object p3, p2, Lx4/y;->a:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    iput p1, p2, Lx4/y;->c:I

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    iput p1, p2, Lx4/y;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lg5/q;->I()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object p1, p0, Lg5/q;->O0:Lg5/p;

    .line 49
    .line 50
    iget-object p1, p1, Lg5/p;->d:Lce/g;

    .line 51
    .line 52
    invoke-virtual {p1}, Lce/g;->D()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-lez p1, :cond_2

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Lg5/q;->K0:Z

    .line 60
    .line 61
    :cond_2
    iget-object p1, p0, Lg5/q;->O0:Lg5/p;

    .line 62
    .line 63
    iget-object p1, p1, Lg5/p;->d:Lce/g;

    .line 64
    .line 65
    invoke-virtual {p1}, Lce/g;->c()V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lg5/q;->z:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 71
    .line 72
    .line 73
    return-void
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

.method public o0(Lu4/f;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public p0(Lm4/q;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
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

.method public abstract q0(Lg5/r;Lm4/q;)I
.end method

.method public final r0(Lm4/q;)Z
    .locals 5

    .line 1
    sget v0, Lp4/c0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 10
    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    iget v0, p0, Lg5/q;->C0:I

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_6

    .line 17
    .line 18
    iget v0, p0, Lv4/e;->h:I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget v0, p0, Lg5/q;->J:F

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lv4/e;->j:[Lm4/q;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0, p1}, Lg5/q;->M(F[Lm4/q;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget v0, p0, Lg5/q;->O:F

    .line 38
    .line 39
    cmpl-float v3, v0, p1

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    .line 45
    .line 46
    cmpl-float v4, p1, v3

    .line 47
    .line 48
    if-nez v4, :cond_4

    .line 49
    .line 50
    iget-boolean p1, p0, Lg5/q;->D0:Z

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iput v2, p0, Lg5/q;->B0:I

    .line 55
    .line 56
    iput v1, p0, Lg5/q;->C0:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 63
    .line 64
    .line 65
    :goto_0
    const/4 p1, 0x0

    .line 66
    return p1

    .line 67
    :cond_4
    cmpl-float v0, v0, v3

    .line 68
    .line 69
    if-nez v0, :cond_5

    .line 70
    .line 71
    iget v0, p0, Lg5/q;->t:F

    .line 72
    .line 73
    cmpl-float v0, p1, v0

    .line 74
    .line 75
    if-lez v0, :cond_6

    .line 76
    .line 77
    :cond_5
    new-instance v0, Landroid/os/Bundle;

    .line 78
    .line 79
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v1, "operating-rate"

    .line 83
    .line 84
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lg5/q;->K:Lg5/k;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-interface {v1, v0}, Lg5/k;->c(Landroid/os/Bundle;)V

    .line 93
    .line 94
    .line 95
    iput p1, p0, Lg5/q;->O:F

    .line 96
    .line 97
    :cond_6
    :goto_1
    return v2
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final s0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg5/q;->E:Lb5/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lb5/l;->h()Lu4/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lb5/y;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-object v1, p0, Lg5/q;->G:Landroid/media/MediaCrypto;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, Lb5/y;

    .line 21
    .line 22
    iget-object v0, v0, Lb5/y;->b:[B

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/support/v4/media/c;->o(Landroid/media/MediaCrypto;[B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    iget-object v1, p0, Lg5/q;->B:Lm4/q;

    .line 30
    .line 31
    const/16 v3, 0x1776

    .line 32
    .line 33
    invoke-virtual {p0, v0, v1, v2, v3}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    throw v0

    .line 38
    :cond_0
    :goto_0
    iget-object v0, p0, Lg5/q;->E:Lb5/l;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lg5/q;->l0(Lb5/l;)V

    .line 41
    .line 42
    .line 43
    iput v2, p0, Lg5/q;->B0:I

    .line 44
    .line 45
    iput v2, p0, Lg5/q;->C0:I

    .line 46
    .line 47
    return-void
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

.method public t([Lm4/q;JJLj5/d0;)V
    .locals 12

    .line 1
    iget-object p1, p0, Lg5/q;->O0:Lg5/p;

    .line 2
    .line 3
    iget-wide v0, p1, Lg5/p;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance v4, Lg5/p;

    .line 15
    .line 16
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    move-wide v7, p2

    .line 22
    move-wide/from16 v9, p4

    .line 23
    .line 24
    invoke-direct/range {v4 .. v10}, Lg5/p;-><init>(JJJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v4}, Lg5/q;->m0(Lg5/p;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Lg5/q;->z:Ljava/util/ArrayDeque;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget-wide v0, p0, Lg5/q;->G0:J

    .line 40
    .line 41
    cmp-long v4, v0, v2

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    iget-wide v4, p0, Lg5/q;->P0:J

    .line 46
    .line 47
    cmp-long v6, v4, v2

    .line 48
    .line 49
    if-eqz v6, :cond_3

    .line 50
    .line 51
    cmp-long v6, v4, v0

    .line 52
    .line 53
    if-ltz v6, :cond_3

    .line 54
    .line 55
    :cond_1
    new-instance v5, Lg5/p;

    .line 56
    .line 57
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    move-wide v8, p2

    .line 63
    move-wide/from16 v10, p4

    .line 64
    .line 65
    invoke-direct/range {v5 .. v11}, Lg5/p;-><init>(JJJ)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v5}, Lg5/q;->m0(Lg5/p;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lg5/q;->O0:Lg5/p;

    .line 72
    .line 73
    iget-wide v0, p1, Lg5/p;->c:J

    .line 74
    .line 75
    cmp-long p1, v0, v2

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Lg5/q;->c0()V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void

    .line 83
    :cond_3
    new-instance v5, Lg5/p;

    .line 84
    .line 85
    iget-wide v6, p0, Lg5/q;->G0:J

    .line 86
    .line 87
    move-wide v8, p2

    .line 88
    move-wide/from16 v10, p4

    .line 89
    .line 90
    invoke-direct/range {v5 .. v11}, Lg5/p;-><init>(JJJ)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    return-void
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

.method public final t0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/q;->O0:Lg5/p;

    .line 2
    .line 3
    iget-object v0, v0, Lg5/p;->d:Lce/g;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lce/g;->y(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm4/q;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-boolean p2, p0, Lg5/q;->Q0:Z

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Lg5/q;->M:Landroid/media/MediaFormat;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lg5/q;->O0:Lg5/p;

    .line 22
    .line 23
    iget-object p1, p1, Lg5/p;->d:Lce/g;

    .line 24
    .line 25
    invoke-virtual {p1}, Lce/g;->x()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lm4/q;

    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iput-object p1, p0, Lg5/q;->C:Lm4/q;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-boolean p1, p0, Lg5/q;->N:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lg5/q;->C:Lm4/q;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    iget-object p1, p0, Lg5/q;->C:Lm4/q;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lg5/q;->M:Landroid/media/MediaFormat;

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Lg5/q;->Z(Lm4/q;Landroid/media/MediaFormat;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Lg5/q;->N:Z

    .line 56
    .line 57
    iput-boolean p1, p0, Lg5/q;->Q0:Z

    .line 58
    .line 59
    :cond_2
    return-void
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

.method public v(JJ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lg5/q;->L0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lg5/q;->L0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lg5/q;->e0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lg5/q;->M0:Lv4/m;

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, Lg5/q;->J0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lg5/q;->i0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :catch_1
    move-exception p1

    .line 28
    goto/16 :goto_b

    .line 29
    .line 30
    :cond_1
    iget-object v2, p0, Lg5/q;->B:Lm4/q;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {p0, v2}, Lg5/q;->g0(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p0, Lg5/q;->w0:Z

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    const-string v2, "bypassRender"

    .line 50
    .line 51
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lg5/q;->A(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_4
    iget-object v2, p0, Lg5/q;->K:Lg5/k;

    .line 67
    .line 68
    if-eqz v2, :cond_b

    .line 69
    .line 70
    iget-object v2, p0, Lv4/e;->g:Lp4/v;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    const-string v4, "drainAndFeed"

    .line 80
    .line 81
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lg5/q;->F(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    iget-wide v7, p0, Lg5/q;->H:J

    .line 96
    .line 97
    cmp-long v4, v7, v5

    .line 98
    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    iget-object v4, p0, Lv4/e;->g:Lp4/v;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    sub-long/2addr v9, v2

    .line 111
    cmp-long v4, v9, v7

    .line 112
    .line 113
    if-gez v4, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    const/4 v4, 0x0

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    :goto_2
    const/4 v4, 0x1

    .line 119
    :goto_3
    if-eqz v4, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    :goto_4
    invoke-virtual {p0}, Lg5/q;->G()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    iget-wide p1, p0, Lg5/q;->H:J

    .line 129
    .line 130
    cmp-long p3, p1, v5

    .line 131
    .line 132
    if-eqz p3, :cond_9

    .line 133
    .line 134
    iget-object p3, p0, Lv4/e;->g:Lp4/v;

    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 140
    .line 141
    .line 142
    move-result-wide p3

    .line 143
    sub-long/2addr p3, v2

    .line 144
    cmp-long v4, p3, p1

    .line 145
    .line 146
    if-gez v4, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    const/4 p1, 0x0

    .line 150
    goto :goto_6

    .line 151
    :cond_9
    :goto_5
    const/4 p1, 0x1

    .line 152
    :goto_6
    if-eqz p1, :cond_a

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_b
    iget-object p3, p0, Lg5/q;->N0:Lv4/f;

    .line 160
    .line 161
    iget p4, p3, Lv4/f;->d:I

    .line 162
    .line 163
    iget-object v2, p0, Lv4/e;->i:Lj5/c1;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-wide v3, p0, Lv4/e;->k:J

    .line 169
    .line 170
    sub-long/2addr p1, v3

    .line 171
    invoke-interface {v2, p1, p2}, Lj5/c1;->j(J)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    add-int/2addr p4, p1

    .line 176
    iput p4, p3, Lv4/f;->d:I

    .line 177
    .line 178
    invoke-virtual {p0, v0}, Lg5/q;->g0(I)Z

    .line 179
    .line 180
    .line 181
    :goto_7
    iget-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 182
    .line 183
    monitor-enter p1

    .line 184
    monitor-exit p1
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    return-void

    .line 186
    :goto_8
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 187
    .line 188
    if-eqz p2, :cond_c

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    array-length p4, p3

    .line 196
    if-lez p4, :cond_10

    .line 197
    .line 198
    aget-object p3, p3, v1

    .line 199
    .line 200
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    const-string p4, "android.media.MediaCodec"

    .line 205
    .line 206
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    if-eqz p3, :cond_10

    .line 211
    .line 212
    :goto_9
    invoke-virtual {p0, p1}, Lg5/q;->V(Ljava/lang/Exception;)V

    .line 213
    .line 214
    .line 215
    if-eqz p2, :cond_d

    .line 216
    .line 217
    move-object p2, p1

    .line 218
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 219
    .line 220
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-eqz p2, :cond_d

    .line 225
    .line 226
    const/4 v1, 0x1

    .line 227
    :cond_d
    if-eqz v1, :cond_e

    .line 228
    .line 229
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 230
    .line 231
    .line 232
    :cond_e
    iget-object p2, p0, Lg5/q;->R:Lg5/n;

    .line 233
    .line 234
    invoke-virtual {p0, p1, p2}, Lg5/q;->C(Ljava/lang/IllegalStateException;Lg5/n;)Lg5/m;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget p2, p1, Lg5/m;->a:I

    .line 239
    .line 240
    const/16 p3, 0x44d

    .line 241
    .line 242
    if-ne p2, p3, :cond_f

    .line 243
    .line 244
    const/16 p2, 0xfa6

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_f
    const/16 p2, 0xfa3

    .line 248
    .line 249
    :goto_a
    iget-object p3, p0, Lg5/q;->B:Lm4/q;

    .line 250
    .line 251
    invoke-virtual {p0, p1, p3, v1, p2}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    throw p1

    .line 256
    :cond_10
    throw p1

    .line 257
    :goto_b
    iget-object p2, p0, Lg5/q;->B:Lm4/q;

    .line 258
    .line 259
    invoke-virtual {p1}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    invoke-static {p3}, Lp4/c0;->w(I)I

    .line 264
    .line 265
    .line 266
    move-result p3

    .line 267
    invoke-virtual {p0, p1, p2, v1, p3}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    throw p1

    .line 272
    :cond_11
    const/4 p1, 0x0

    .line 273
    iput-object p1, p0, Lg5/q;->M0:Lv4/m;

    .line 274
    .line 275
    throw v0
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
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
.end method

.method public x(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lg5/q;->I:F

    .line 2
    .line 3
    iput p2, p0, Lg5/q;->J:F

    .line 4
    .line 5
    iget-object p1, p0, Lg5/q;->L:Lm4/q;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lg5/q;->r0(Lm4/q;)Z

    .line 8
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
.end method

.method public final y(Lm4/q;)I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lg5/q;->s:Lg5/r;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lg5/q;->q0(Lg5/r;Lm4/q;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch Lg5/u; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const/16 v1, 0xfa2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v0, p1, v2, v1}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    throw p1
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

.method public final z()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
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
.end method
