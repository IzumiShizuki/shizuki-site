.class public final Lp5/i;
.super Lg5/q;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final C1:[I

.field public static D1:Z

.field public static E1:Z


# instance fields
.field public A1:J

.field public B1:Z

.field public final S0:Landroid/content/Context;

.field public final T0:Z

.field public final U0:Lp5/y;

.field public final V0:I

.field public final W0:Z

.field public final X0:Lp5/r;

.field public final Y0:Lmh/f;

.field public Z0:Li7/j1;

.field public a1:Z

.field public b1:Z

.field public c1:Lp5/l;

.field public d1:Z

.field public e1:Ljava/util/List;

.field public f1:Landroid/view/Surface;

.field public g1:Lp5/k;

.field public h1:Lp4/u;

.field public i1:Z

.field public j1:I

.field public k1:I

.field public l1:J

.field public m1:I

.field public n1:I

.field public o1:I

.field public p1:J

.field public q1:I

.field public r1:J

.field public s1:Lm4/u1;

.field public t1:Lm4/u1;

.field public u1:I

.field public v1:Z

.field public w1:I

.field public x1:Lp5/h;

.field public y1:Lp5/q;

.field public z1:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lp5/i;->C1:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
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

.method public constructor <init>(Landroid/content/Context;Lg5/j;Landroid/os/Handler;Lv4/s;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    sget-object v1, Lg5/r;->d0:Lg5/i;

    .line 3
    .line 4
    const/high16 v2, 0x41f00000    # 30.0f

    .line 5
    .line 6
    invoke-direct {p0, v0, p2, v1, v2}, Lg5/q;-><init>(ILg5/j;Lg5/r;F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lp5/i;->S0:Landroid/content/Context;

    .line 14
    .line 15
    const/16 p2, 0x32

    .line 16
    .line 17
    iput p2, p0, Lp5/i;->V0:I

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    iput-object p2, p0, Lp5/i;->c1:Lp5/l;

    .line 21
    .line 22
    new-instance v0, Lp5/y;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p3, p4, v1}, Lp5/y;-><init>(Landroid/os/Handler;Lv4/s;I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lp5/i;->U0:Lp5/y;

    .line 29
    .line 30
    const/4 p3, 0x1

    .line 31
    iput-boolean p3, p0, Lp5/i;->T0:Z

    .line 32
    .line 33
    new-instance p4, Lp5/r;

    .line 34
    .line 35
    invoke-direct {p4, p1, p0}, Lp5/r;-><init>(Landroid/content/Context;Lp5/i;)V

    .line 36
    .line 37
    .line 38
    iput-object p4, p0, Lp5/i;->X0:Lp5/r;

    .line 39
    .line 40
    new-instance p1, Lmh/f;

    .line 41
    .line 42
    invoke-direct {p1}, Lmh/f;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lp5/i;->Y0:Lmh/f;

    .line 46
    .line 47
    const-string p1, "NVIDIA"

    .line 48
    .line 49
    sget-object p4, Lp4/c0;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput-boolean p1, p0, Lp5/i;->W0:Z

    .line 56
    .line 57
    sget-object p1, Lp4/u;->c:Lp4/u;

    .line 58
    .line 59
    iput-object p1, p0, Lp5/i;->h1:Lp4/u;

    .line 60
    .line 61
    iput p3, p0, Lp5/i;->j1:I

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    iput p1, p0, Lp5/i;->k1:I

    .line 65
    .line 66
    sget-object p3, Lm4/u1;->d:Lm4/u1;

    .line 67
    .line 68
    iput-object p3, p0, Lp5/i;->s1:Lm4/u1;

    .line 69
    .line 70
    iput p1, p0, Lp5/i;->w1:I

    .line 71
    .line 72
    iput-object p2, p0, Lp5/i;->t1:Lm4/u1;

    .line 73
    .line 74
    const/16 p1, -0x3e8

    .line 75
    .line 76
    iput p1, p0, Lp5/i;->u1:I

    .line 77
    .line 78
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    iput-wide p1, p0, Lp5/i;->z1:J

    .line 84
    .line 85
    iput-wide p1, p0, Lp5/i;->A1:J

    .line 86
    .line 87
    return-void
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

.method public static u0(Ljava/lang/String;)Z
    .locals 17

    .line 1
    const-string v0, "OMX.google"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const-class v2, Lp5/i;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    sget-boolean v0, Lp5/i;->D1:Z

    .line 17
    .line 18
    if-nez v0, :cond_a2

    .line 19
    .line 20
    sget v0, Lp4/c0;->a:I

    .line 21
    .line 22
    const/16 v3, 0x1c

    .line 23
    .line 24
    const/4 v4, 0x7

    .line 25
    const/4 v5, 0x6

    .line 26
    const/4 v6, 0x5

    .line 27
    const/4 v7, 0x4

    .line 28
    const/4 v8, 0x3

    .line 29
    const/4 v9, 0x2

    .line 30
    const/4 v10, -0x1

    .line 31
    const/4 v11, 0x1

    .line 32
    if-gt v0, v3, :cond_a

    .line 33
    .line 34
    sget-object v12, Lp4/c0;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    sparse-switch v13, :sswitch_data_0

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 v12, -0x1

    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :sswitch_0
    const-string v13, "machuca"

    .line 50
    .line 51
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    if-nez v12, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v12, 0x7

    .line 59
    goto :goto_1

    .line 60
    :sswitch_1
    const-string v13, "once"

    .line 61
    .line 62
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    if-nez v12, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/4 v12, 0x6

    .line 70
    goto :goto_1

    .line 71
    :sswitch_2
    const-string v13, "magnolia"

    .line 72
    .line 73
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    if-nez v12, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    const/4 v12, 0x5

    .line 81
    goto :goto_1

    .line 82
    :sswitch_3
    const-string v13, "aquaman"

    .line 83
    .line 84
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-nez v12, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    const/4 v12, 0x4

    .line 92
    goto :goto_1

    .line 93
    :sswitch_4
    const-string v13, "oneday"

    .line 94
    .line 95
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-nez v12, :cond_5

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    const/4 v12, 0x3

    .line 103
    goto :goto_1

    .line 104
    :sswitch_5
    const-string v13, "dangalUHD"

    .line 105
    .line 106
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-nez v12, :cond_6

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_6
    const/4 v12, 0x2

    .line 114
    goto :goto_1

    .line 115
    :sswitch_6
    const-string v13, "dangalFHD"

    .line 116
    .line 117
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    if-nez v12, :cond_7

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    const/4 v12, 0x1

    .line 125
    goto :goto_1

    .line 126
    :sswitch_7
    const-string v13, "dangal"

    .line 127
    .line 128
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    if-nez v12, :cond_8

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_8
    const/4 v12, 0x0

    .line 136
    :goto_1
    packed-switch v12, :pswitch_data_0

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_9
    :goto_2
    :pswitch_0
    const/4 v1, 0x1

    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :cond_a
    :goto_3
    const/16 v12, 0x1b

    .line 144
    .line 145
    if-gt v0, v12, :cond_b

    .line 146
    .line 147
    :try_start_1
    const-string v13, "HWEML"

    .line 148
    .line 149
    sget-object v14, Lp4/c0;->b:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_b

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_b
    sget-object v13, Lp4/c0;->d:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .line 162
    .line 163
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    const/16 v15, 0x8

    .line 168
    .line 169
    sparse-switch v14, :sswitch_data_1

    .line 170
    .line 171
    .line 172
    :goto_4
    const/4 v14, -0x1

    .line 173
    goto/16 :goto_5

    .line 174
    .line 175
    :sswitch_8
    const-string v14, "AFTEUFF014"

    .line 176
    .line 177
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    if-nez v14, :cond_c

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_c
    const/16 v14, 0x8

    .line 185
    .line 186
    goto/16 :goto_5

    .line 187
    .line 188
    :sswitch_9
    const-string v14, "AFTSO001"

    .line 189
    .line 190
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    if-nez v14, :cond_d

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_d
    const/4 v14, 0x7

    .line 198
    goto :goto_5

    .line 199
    :sswitch_a
    const-string v14, "AFTEU014"

    .line 200
    .line 201
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    if-nez v14, :cond_e

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_e
    const/4 v14, 0x6

    .line 209
    goto :goto_5

    .line 210
    :sswitch_b
    const-string v14, "AFTEU011"

    .line 211
    .line 212
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-nez v14, :cond_f

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_f
    const/4 v14, 0x5

    .line 220
    goto :goto_5

    .line 221
    :sswitch_c
    const-string v14, "AFTR"

    .line 222
    .line 223
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    if-nez v14, :cond_10

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_10
    const/4 v14, 0x4

    .line 231
    goto :goto_5

    .line 232
    :sswitch_d
    const-string v14, "AFTN"

    .line 233
    .line 234
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v14

    .line 238
    if-nez v14, :cond_11

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_11
    const/4 v14, 0x3

    .line 242
    goto :goto_5

    .line 243
    :sswitch_e
    const-string v14, "AFTA"

    .line 244
    .line 245
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v14

    .line 249
    if-nez v14, :cond_12

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_12
    const/4 v14, 0x2

    .line 253
    goto :goto_5

    .line 254
    :sswitch_f
    const-string v14, "AFTKMST12"

    .line 255
    .line 256
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v14

    .line 260
    if-nez v14, :cond_13

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_13
    const/4 v14, 0x1

    .line 264
    goto :goto_5

    .line 265
    :sswitch_10
    const-string v14, "AFTJMST12"

    .line 266
    .line 267
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v14

    .line 271
    if-nez v14, :cond_14

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_14
    const/4 v14, 0x0

    .line 275
    :goto_5
    packed-switch v14, :pswitch_data_1

    .line 276
    .line 277
    .line 278
    const/16 v14, 0x1a

    .line 279
    .line 280
    if-gt v0, v14, :cond_a1

    .line 281
    .line 282
    :try_start_2
    sget-object v0, Lp4/c0;->b:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 288
    .line 289
    .line 290
    move-result v16

    .line 291
    sparse-switch v16, :sswitch_data_2

    .line 292
    .line 293
    .line 294
    :goto_6
    const/4 v3, -0x1

    .line 295
    goto/16 :goto_7

    .line 296
    .line 297
    :sswitch_11
    const-string v3, "HWWAS-H"

    .line 298
    .line 299
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-nez v0, :cond_15

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_15
    const/16 v3, 0x8b

    .line 307
    .line 308
    goto/16 :goto_7

    .line 309
    .line 310
    :sswitch_12
    const-string v3, "HWVNS-H"

    .line 311
    .line 312
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-nez v0, :cond_16

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_16
    const/16 v3, 0x8a

    .line 320
    .line 321
    goto/16 :goto_7

    .line 322
    .line 323
    :sswitch_13
    const-string v3, "ELUGA_Prim"

    .line 324
    .line 325
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_17

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_17
    const/16 v3, 0x89

    .line 333
    .line 334
    goto/16 :goto_7

    .line 335
    .line 336
    :sswitch_14
    const-string v3, "ELUGA_Note"

    .line 337
    .line 338
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-nez v0, :cond_18

    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_18
    const/16 v3, 0x88

    .line 346
    .line 347
    goto/16 :goto_7

    .line 348
    .line 349
    :sswitch_15
    const-string v3, "ASUS_X00AD_2"

    .line 350
    .line 351
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-nez v0, :cond_19

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_19
    const/16 v3, 0x87

    .line 359
    .line 360
    goto/16 :goto_7

    .line 361
    .line 362
    :sswitch_16
    const-string v3, "HWCAM-H"

    .line 363
    .line 364
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_1a

    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_1a
    const/16 v3, 0x86

    .line 372
    .line 373
    goto/16 :goto_7

    .line 374
    .line 375
    :sswitch_17
    const-string v3, "HWBLN-H"

    .line 376
    .line 377
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-nez v0, :cond_1b

    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_1b
    const/16 v3, 0x85

    .line 385
    .line 386
    goto/16 :goto_7

    .line 387
    .line 388
    :sswitch_18
    const-string v3, "DM-01K"

    .line 389
    .line 390
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-nez v0, :cond_1c

    .line 395
    .line 396
    goto :goto_6

    .line 397
    :cond_1c
    const/16 v3, 0x84

    .line 398
    .line 399
    goto/16 :goto_7

    .line 400
    .line 401
    :sswitch_19
    const-string v3, "BRAVIA_ATV3_4K"

    .line 402
    .line 403
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    if-nez v0, :cond_1d

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_1d
    const/16 v3, 0x83

    .line 411
    .line 412
    goto/16 :goto_7

    .line 413
    .line 414
    :sswitch_1a
    const-string v3, "Infinix-X572"

    .line 415
    .line 416
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-nez v0, :cond_1e

    .line 421
    .line 422
    goto/16 :goto_6

    .line 423
    .line 424
    :cond_1e
    const/16 v3, 0x82

    .line 425
    .line 426
    goto/16 :goto_7

    .line 427
    .line 428
    :sswitch_1b
    const-string v3, "PB2-670M"

    .line 429
    .line 430
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-nez v0, :cond_1f

    .line 435
    .line 436
    goto/16 :goto_6

    .line 437
    .line 438
    :cond_1f
    const/16 v3, 0x81

    .line 439
    .line 440
    goto/16 :goto_7

    .line 441
    .line 442
    :sswitch_1c
    const-string v3, "santoni"

    .line 443
    .line 444
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-nez v0, :cond_20

    .line 449
    .line 450
    goto/16 :goto_6

    .line 451
    .line 452
    :cond_20
    const/16 v3, 0x80

    .line 453
    .line 454
    goto/16 :goto_7

    .line 455
    .line 456
    :sswitch_1d
    const-string v3, "iball8735_9806"

    .line 457
    .line 458
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_21

    .line 463
    .line 464
    goto/16 :goto_6

    .line 465
    .line 466
    :cond_21
    const/16 v3, 0x7f

    .line 467
    .line 468
    goto/16 :goto_7

    .line 469
    .line 470
    :sswitch_1e
    const-string v3, "CPH1715"

    .line 471
    .line 472
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-nez v0, :cond_22

    .line 477
    .line 478
    goto/16 :goto_6

    .line 479
    .line 480
    :cond_22
    const/16 v3, 0x7e

    .line 481
    .line 482
    goto/16 :goto_7

    .line 483
    .line 484
    :sswitch_1f
    const-string v3, "CPH1609"

    .line 485
    .line 486
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-nez v0, :cond_23

    .line 491
    .line 492
    goto/16 :goto_6

    .line 493
    .line 494
    :cond_23
    const/16 v3, 0x7d

    .line 495
    .line 496
    goto/16 :goto_7

    .line 497
    .line 498
    :sswitch_20
    const-string v3, "woods_f"

    .line 499
    .line 500
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    if-nez v0, :cond_24

    .line 505
    .line 506
    goto/16 :goto_6

    .line 507
    .line 508
    :cond_24
    const/16 v3, 0x7c

    .line 509
    .line 510
    goto/16 :goto_7

    .line 511
    .line 512
    :sswitch_21
    const-string v3, "htc_e56ml_dtul"

    .line 513
    .line 514
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-nez v0, :cond_25

    .line 519
    .line 520
    goto/16 :goto_6

    .line 521
    .line 522
    :cond_25
    const/16 v3, 0x7b

    .line 523
    .line 524
    goto/16 :goto_7

    .line 525
    .line 526
    :sswitch_22
    const-string v3, "EverStar_S"

    .line 527
    .line 528
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-nez v0, :cond_26

    .line 533
    .line 534
    goto/16 :goto_6

    .line 535
    .line 536
    :cond_26
    const/16 v3, 0x7a

    .line 537
    .line 538
    goto/16 :goto_7

    .line 539
    .line 540
    :sswitch_23
    const-string v3, "hwALE-H"

    .line 541
    .line 542
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-nez v0, :cond_27

    .line 547
    .line 548
    goto/16 :goto_6

    .line 549
    .line 550
    :cond_27
    const/16 v3, 0x79

    .line 551
    .line 552
    goto/16 :goto_7

    .line 553
    .line 554
    :sswitch_24
    const-string v3, "itel_S41"

    .line 555
    .line 556
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    if-nez v0, :cond_28

    .line 561
    .line 562
    goto/16 :goto_6

    .line 563
    .line 564
    :cond_28
    const/16 v3, 0x78

    .line 565
    .line 566
    goto/16 :goto_7

    .line 567
    .line 568
    :sswitch_25
    const-string v3, "LS-5017"

    .line 569
    .line 570
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-nez v0, :cond_29

    .line 575
    .line 576
    goto/16 :goto_6

    .line 577
    .line 578
    :cond_29
    const/16 v3, 0x77

    .line 579
    .line 580
    goto/16 :goto_7

    .line 581
    .line 582
    :sswitch_26
    const-string v3, "panell_d"

    .line 583
    .line 584
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-nez v0, :cond_2a

    .line 589
    .line 590
    goto/16 :goto_6

    .line 591
    .line 592
    :cond_2a
    const/16 v3, 0x76

    .line 593
    .line 594
    goto/16 :goto_7

    .line 595
    .line 596
    :sswitch_27
    const-string v3, "j2xlteins"

    .line 597
    .line 598
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v0

    .line 602
    if-nez v0, :cond_2b

    .line 603
    .line 604
    goto/16 :goto_6

    .line 605
    .line 606
    :cond_2b
    const/16 v3, 0x75

    .line 607
    .line 608
    goto/16 :goto_7

    .line 609
    .line 610
    :sswitch_28
    const-string v3, "A7000plus"

    .line 611
    .line 612
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-nez v0, :cond_2c

    .line 617
    .line 618
    goto/16 :goto_6

    .line 619
    .line 620
    :cond_2c
    const/16 v3, 0x74

    .line 621
    .line 622
    goto/16 :goto_7

    .line 623
    .line 624
    :sswitch_29
    const-string v3, "manning"

    .line 625
    .line 626
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    if-nez v0, :cond_2d

    .line 631
    .line 632
    goto/16 :goto_6

    .line 633
    .line 634
    :cond_2d
    const/16 v3, 0x73

    .line 635
    .line 636
    goto/16 :goto_7

    .line 637
    .line 638
    :sswitch_2a
    const-string v3, "GIONEE_WBL7519"

    .line 639
    .line 640
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-nez v0, :cond_2e

    .line 645
    .line 646
    goto/16 :goto_6

    .line 647
    .line 648
    :cond_2e
    const/16 v3, 0x72

    .line 649
    .line 650
    goto/16 :goto_7

    .line 651
    .line 652
    :sswitch_2b
    const-string v3, "GIONEE_WBL7365"

    .line 653
    .line 654
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    if-nez v0, :cond_2f

    .line 659
    .line 660
    goto/16 :goto_6

    .line 661
    .line 662
    :cond_2f
    const/16 v3, 0x71

    .line 663
    .line 664
    goto/16 :goto_7

    .line 665
    .line 666
    :sswitch_2c
    const-string v3, "GIONEE_WBL5708"

    .line 667
    .line 668
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    if-nez v0, :cond_30

    .line 673
    .line 674
    goto/16 :goto_6

    .line 675
    .line 676
    :cond_30
    const/16 v3, 0x70

    .line 677
    .line 678
    goto/16 :goto_7

    .line 679
    .line 680
    :sswitch_2d
    const-string v3, "QM16XE_U"

    .line 681
    .line 682
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-nez v0, :cond_31

    .line 687
    .line 688
    goto/16 :goto_6

    .line 689
    .line 690
    :cond_31
    const/16 v3, 0x6f

    .line 691
    .line 692
    goto/16 :goto_7

    .line 693
    .line 694
    :sswitch_2e
    const-string v3, "Pixi5-10_4G"

    .line 695
    .line 696
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    if-nez v0, :cond_32

    .line 701
    .line 702
    goto/16 :goto_6

    .line 703
    .line 704
    :cond_32
    const/16 v3, 0x6e

    .line 705
    .line 706
    goto/16 :goto_7

    .line 707
    .line 708
    :sswitch_2f
    const-string v3, "TB3-850M"

    .line 709
    .line 710
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    if-nez v0, :cond_33

    .line 715
    .line 716
    goto/16 :goto_6

    .line 717
    .line 718
    :cond_33
    const/16 v3, 0x6d

    .line 719
    .line 720
    goto/16 :goto_7

    .line 721
    .line 722
    :sswitch_30
    const-string v3, "TB3-850F"

    .line 723
    .line 724
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v0

    .line 728
    if-nez v0, :cond_34

    .line 729
    .line 730
    goto/16 :goto_6

    .line 731
    .line 732
    :cond_34
    const/16 v3, 0x6c

    .line 733
    .line 734
    goto/16 :goto_7

    .line 735
    .line 736
    :sswitch_31
    const-string v3, "TB3-730X"

    .line 737
    .line 738
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    if-nez v0, :cond_35

    .line 743
    .line 744
    goto/16 :goto_6

    .line 745
    .line 746
    :cond_35
    const/16 v3, 0x6b

    .line 747
    .line 748
    goto/16 :goto_7

    .line 749
    .line 750
    :sswitch_32
    const-string v3, "TB3-730F"

    .line 751
    .line 752
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    if-nez v0, :cond_36

    .line 757
    .line 758
    goto/16 :goto_6

    .line 759
    .line 760
    :cond_36
    const/16 v3, 0x6a

    .line 761
    .line 762
    goto/16 :goto_7

    .line 763
    .line 764
    :sswitch_33
    const-string v3, "A7020a48"

    .line 765
    .line 766
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result v0

    .line 770
    if-nez v0, :cond_37

    .line 771
    .line 772
    goto/16 :goto_6

    .line 773
    .line 774
    :cond_37
    const/16 v3, 0x69

    .line 775
    .line 776
    goto/16 :goto_7

    .line 777
    .line 778
    :sswitch_34
    const-string v3, "A7010a48"

    .line 779
    .line 780
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    if-nez v0, :cond_38

    .line 785
    .line 786
    goto/16 :goto_6

    .line 787
    .line 788
    :cond_38
    const/16 v3, 0x68

    .line 789
    .line 790
    goto/16 :goto_7

    .line 791
    .line 792
    :sswitch_35
    const-string v3, "griffin"

    .line 793
    .line 794
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    if-nez v0, :cond_39

    .line 799
    .line 800
    goto/16 :goto_6

    .line 801
    .line 802
    :cond_39
    const/16 v3, 0x67

    .line 803
    .line 804
    goto/16 :goto_7

    .line 805
    .line 806
    :sswitch_36
    const-string v3, "marino_f"

    .line 807
    .line 808
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    move-result v0

    .line 812
    if-nez v0, :cond_3a

    .line 813
    .line 814
    goto/16 :goto_6

    .line 815
    .line 816
    :cond_3a
    const/16 v3, 0x66

    .line 817
    .line 818
    goto/16 :goto_7

    .line 819
    .line 820
    :sswitch_37
    const-string v3, "CPY83_I00"

    .line 821
    .line 822
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result v0

    .line 826
    if-nez v0, :cond_3b

    .line 827
    .line 828
    goto/16 :goto_6

    .line 829
    .line 830
    :cond_3b
    const/16 v3, 0x65

    .line 831
    .line 832
    goto/16 :goto_7

    .line 833
    .line 834
    :sswitch_38
    const-string v3, "A2016a40"

    .line 835
    .line 836
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    if-nez v0, :cond_3c

    .line 841
    .line 842
    goto/16 :goto_6

    .line 843
    .line 844
    :cond_3c
    const/16 v3, 0x64

    .line 845
    .line 846
    goto/16 :goto_7

    .line 847
    .line 848
    :sswitch_39
    const-string v3, "le_x6"

    .line 849
    .line 850
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    if-nez v0, :cond_3d

    .line 855
    .line 856
    goto/16 :goto_6

    .line 857
    .line 858
    :cond_3d
    const/16 v3, 0x63

    .line 859
    .line 860
    goto/16 :goto_7

    .line 861
    .line 862
    :sswitch_3a
    const-string v3, "l5460"

    .line 863
    .line 864
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    if-nez v0, :cond_3e

    .line 869
    .line 870
    goto/16 :goto_6

    .line 871
    .line 872
    :cond_3e
    const/16 v3, 0x62

    .line 873
    .line 874
    goto/16 :goto_7

    .line 875
    .line 876
    :sswitch_3b
    const-string v3, "i9031"

    .line 877
    .line 878
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-nez v0, :cond_3f

    .line 883
    .line 884
    goto/16 :goto_6

    .line 885
    .line 886
    :cond_3f
    const/16 v3, 0x61

    .line 887
    .line 888
    goto/16 :goto_7

    .line 889
    .line 890
    :sswitch_3c
    const-string v3, "X3_HK"

    .line 891
    .line 892
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    if-nez v0, :cond_40

    .line 897
    .line 898
    goto/16 :goto_6

    .line 899
    .line 900
    :cond_40
    const/16 v3, 0x60

    .line 901
    .line 902
    goto/16 :goto_7

    .line 903
    .line 904
    :sswitch_3d
    const-string v3, "V23GB"

    .line 905
    .line 906
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    move-result v0

    .line 910
    if-nez v0, :cond_41

    .line 911
    .line 912
    goto/16 :goto_6

    .line 913
    .line 914
    :cond_41
    const/16 v3, 0x5f

    .line 915
    .line 916
    goto/16 :goto_7

    .line 917
    .line 918
    :sswitch_3e
    const-string v3, "Q4310"

    .line 919
    .line 920
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    if-nez v0, :cond_42

    .line 925
    .line 926
    goto/16 :goto_6

    .line 927
    .line 928
    :cond_42
    const/16 v3, 0x5e

    .line 929
    .line 930
    goto/16 :goto_7

    .line 931
    .line 932
    :sswitch_3f
    const-string v3, "Q4260"

    .line 933
    .line 934
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-nez v0, :cond_43

    .line 939
    .line 940
    goto/16 :goto_6

    .line 941
    .line 942
    :cond_43
    const/16 v3, 0x5d

    .line 943
    .line 944
    goto/16 :goto_7

    .line 945
    .line 946
    :sswitch_40
    const-string v3, "PRO7S"

    .line 947
    .line 948
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v0

    .line 952
    if-nez v0, :cond_44

    .line 953
    .line 954
    goto/16 :goto_6

    .line 955
    .line 956
    :cond_44
    const/16 v3, 0x5c

    .line 957
    .line 958
    goto/16 :goto_7

    .line 959
    .line 960
    :sswitch_41
    const-string v3, "F3311"

    .line 961
    .line 962
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    if-nez v0, :cond_45

    .line 967
    .line 968
    goto/16 :goto_6

    .line 969
    .line 970
    :cond_45
    const/16 v3, 0x5b

    .line 971
    .line 972
    goto/16 :goto_7

    .line 973
    .line 974
    :sswitch_42
    const-string v3, "F3215"

    .line 975
    .line 976
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    move-result v0

    .line 980
    if-nez v0, :cond_46

    .line 981
    .line 982
    goto/16 :goto_6

    .line 983
    .line 984
    :cond_46
    const/16 v3, 0x5a

    .line 985
    .line 986
    goto/16 :goto_7

    .line 987
    .line 988
    :sswitch_43
    const-string v3, "F3213"

    .line 989
    .line 990
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-nez v0, :cond_47

    .line 995
    .line 996
    goto/16 :goto_6

    .line 997
    .line 998
    :cond_47
    const/16 v3, 0x59

    .line 999
    .line 1000
    goto/16 :goto_7

    .line 1001
    .line 1002
    :sswitch_44
    const-string v3, "F3211"

    .line 1003
    .line 1004
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    if-nez v0, :cond_48

    .line 1009
    .line 1010
    goto/16 :goto_6

    .line 1011
    .line 1012
    :cond_48
    const/16 v3, 0x58

    .line 1013
    .line 1014
    goto/16 :goto_7

    .line 1015
    .line 1016
    :sswitch_45
    const-string v3, "F3116"

    .line 1017
    .line 1018
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v0

    .line 1022
    if-nez v0, :cond_49

    .line 1023
    .line 1024
    goto/16 :goto_6

    .line 1025
    .line 1026
    :cond_49
    const/16 v3, 0x57

    .line 1027
    .line 1028
    goto/16 :goto_7

    .line 1029
    .line 1030
    :sswitch_46
    const-string v3, "F3113"

    .line 1031
    .line 1032
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v0

    .line 1036
    if-nez v0, :cond_4a

    .line 1037
    .line 1038
    goto/16 :goto_6

    .line 1039
    .line 1040
    :cond_4a
    const/16 v3, 0x56

    .line 1041
    .line 1042
    goto/16 :goto_7

    .line 1043
    .line 1044
    :sswitch_47
    const-string v3, "F3111"

    .line 1045
    .line 1046
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    if-nez v0, :cond_4b

    .line 1051
    .line 1052
    goto/16 :goto_6

    .line 1053
    .line 1054
    :cond_4b
    const/16 v3, 0x55

    .line 1055
    .line 1056
    goto/16 :goto_7

    .line 1057
    .line 1058
    :sswitch_48
    const-string v3, "E5643"

    .line 1059
    .line 1060
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v0

    .line 1064
    if-nez v0, :cond_4c

    .line 1065
    .line 1066
    goto/16 :goto_6

    .line 1067
    .line 1068
    :cond_4c
    const/16 v3, 0x54

    .line 1069
    .line 1070
    goto/16 :goto_7

    .line 1071
    .line 1072
    :sswitch_49
    const-string v3, "A1601"

    .line 1073
    .line 1074
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    if-nez v0, :cond_4d

    .line 1079
    .line 1080
    goto/16 :goto_6

    .line 1081
    .line 1082
    :cond_4d
    const/16 v3, 0x53

    .line 1083
    .line 1084
    goto/16 :goto_7

    .line 1085
    .line 1086
    :sswitch_4a
    const-string v3, "Aura_Note_2"

    .line 1087
    .line 1088
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v0

    .line 1092
    if-nez v0, :cond_4e

    .line 1093
    .line 1094
    goto/16 :goto_6

    .line 1095
    .line 1096
    :cond_4e
    const/16 v3, 0x52

    .line 1097
    .line 1098
    goto/16 :goto_7

    .line 1099
    .line 1100
    :sswitch_4b
    const-string v3, "602LV"

    .line 1101
    .line 1102
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    if-nez v0, :cond_4f

    .line 1107
    .line 1108
    goto/16 :goto_6

    .line 1109
    .line 1110
    :cond_4f
    const/16 v3, 0x51

    .line 1111
    .line 1112
    goto/16 :goto_7

    .line 1113
    .line 1114
    :sswitch_4c
    const-string v3, "601LV"

    .line 1115
    .line 1116
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    if-nez v0, :cond_50

    .line 1121
    .line 1122
    goto/16 :goto_6

    .line 1123
    .line 1124
    :cond_50
    const/16 v3, 0x50

    .line 1125
    .line 1126
    goto/16 :goto_7

    .line 1127
    .line 1128
    :sswitch_4d
    const-string v3, "MEIZU_M5"

    .line 1129
    .line 1130
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v0

    .line 1134
    if-nez v0, :cond_51

    .line 1135
    .line 1136
    goto/16 :goto_6

    .line 1137
    .line 1138
    :cond_51
    const/16 v3, 0x4f

    .line 1139
    .line 1140
    goto/16 :goto_7

    .line 1141
    .line 1142
    :sswitch_4e
    const-string v3, "p212"

    .line 1143
    .line 1144
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    if-nez v0, :cond_52

    .line 1149
    .line 1150
    goto/16 :goto_6

    .line 1151
    .line 1152
    :cond_52
    const/16 v3, 0x4e

    .line 1153
    .line 1154
    goto/16 :goto_7

    .line 1155
    .line 1156
    :sswitch_4f
    const-string v3, "mido"

    .line 1157
    .line 1158
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v0

    .line 1162
    if-nez v0, :cond_53

    .line 1163
    .line 1164
    goto/16 :goto_6

    .line 1165
    .line 1166
    :cond_53
    const/16 v3, 0x4d

    .line 1167
    .line 1168
    goto/16 :goto_7

    .line 1169
    .line 1170
    :sswitch_50
    const-string v3, "kate"

    .line 1171
    .line 1172
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v0

    .line 1176
    if-nez v0, :cond_54

    .line 1177
    .line 1178
    goto/16 :goto_6

    .line 1179
    .line 1180
    :cond_54
    const/16 v3, 0x4c

    .line 1181
    .line 1182
    goto/16 :goto_7

    .line 1183
    .line 1184
    :sswitch_51
    const-string v3, "fugu"

    .line 1185
    .line 1186
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v0

    .line 1190
    if-nez v0, :cond_55

    .line 1191
    .line 1192
    goto/16 :goto_6

    .line 1193
    .line 1194
    :cond_55
    const/16 v3, 0x4b

    .line 1195
    .line 1196
    goto/16 :goto_7

    .line 1197
    .line 1198
    :sswitch_52
    const-string v3, "XE2X"

    .line 1199
    .line 1200
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v0

    .line 1204
    if-nez v0, :cond_56

    .line 1205
    .line 1206
    goto/16 :goto_6

    .line 1207
    .line 1208
    :cond_56
    const/16 v3, 0x4a

    .line 1209
    .line 1210
    goto/16 :goto_7

    .line 1211
    .line 1212
    :sswitch_53
    const-string v3, "Q427"

    .line 1213
    .line 1214
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v0

    .line 1218
    if-nez v0, :cond_57

    .line 1219
    .line 1220
    goto/16 :goto_6

    .line 1221
    .line 1222
    :cond_57
    const/16 v3, 0x49

    .line 1223
    .line 1224
    goto/16 :goto_7

    .line 1225
    .line 1226
    :sswitch_54
    const-string v3, "Q350"

    .line 1227
    .line 1228
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1229
    .line 1230
    .line 1231
    move-result v0

    .line 1232
    if-nez v0, :cond_58

    .line 1233
    .line 1234
    goto/16 :goto_6

    .line 1235
    .line 1236
    :cond_58
    const/16 v3, 0x48

    .line 1237
    .line 1238
    goto/16 :goto_7

    .line 1239
    .line 1240
    :sswitch_55
    const-string v3, "P681"

    .line 1241
    .line 1242
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v0

    .line 1246
    if-nez v0, :cond_59

    .line 1247
    .line 1248
    goto/16 :goto_6

    .line 1249
    .line 1250
    :cond_59
    const/16 v3, 0x47

    .line 1251
    .line 1252
    goto/16 :goto_7

    .line 1253
    .line 1254
    :sswitch_56
    const-string v3, "F04J"

    .line 1255
    .line 1256
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v0

    .line 1260
    if-nez v0, :cond_5a

    .line 1261
    .line 1262
    goto/16 :goto_6

    .line 1263
    .line 1264
    :cond_5a
    const/16 v3, 0x46

    .line 1265
    .line 1266
    goto/16 :goto_7

    .line 1267
    .line 1268
    :sswitch_57
    const-string v3, "F04H"

    .line 1269
    .line 1270
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v0

    .line 1274
    if-nez v0, :cond_5b

    .line 1275
    .line 1276
    goto/16 :goto_6

    .line 1277
    .line 1278
    :cond_5b
    const/16 v3, 0x45

    .line 1279
    .line 1280
    goto/16 :goto_7

    .line 1281
    .line 1282
    :sswitch_58
    const-string v3, "F03H"

    .line 1283
    .line 1284
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v0

    .line 1288
    if-nez v0, :cond_5c

    .line 1289
    .line 1290
    goto/16 :goto_6

    .line 1291
    .line 1292
    :cond_5c
    const/16 v3, 0x44

    .line 1293
    .line 1294
    goto/16 :goto_7

    .line 1295
    .line 1296
    :sswitch_59
    const-string v3, "F02H"

    .line 1297
    .line 1298
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v0

    .line 1302
    if-nez v0, :cond_5d

    .line 1303
    .line 1304
    goto/16 :goto_6

    .line 1305
    .line 1306
    :cond_5d
    const/16 v3, 0x43

    .line 1307
    .line 1308
    goto/16 :goto_7

    .line 1309
    .line 1310
    :sswitch_5a
    const-string v3, "F01J"

    .line 1311
    .line 1312
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v0

    .line 1316
    if-nez v0, :cond_5e

    .line 1317
    .line 1318
    goto/16 :goto_6

    .line 1319
    .line 1320
    :cond_5e
    const/16 v3, 0x42

    .line 1321
    .line 1322
    goto/16 :goto_7

    .line 1323
    .line 1324
    :sswitch_5b
    const-string v3, "F01H"

    .line 1325
    .line 1326
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v0

    .line 1330
    if-nez v0, :cond_5f

    .line 1331
    .line 1332
    goto/16 :goto_6

    .line 1333
    .line 1334
    :cond_5f
    const/16 v3, 0x41

    .line 1335
    .line 1336
    goto/16 :goto_7

    .line 1337
    .line 1338
    :sswitch_5c
    const-string v3, "1714"

    .line 1339
    .line 1340
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v0

    .line 1344
    if-nez v0, :cond_60

    .line 1345
    .line 1346
    goto/16 :goto_6

    .line 1347
    .line 1348
    :cond_60
    const/16 v3, 0x40

    .line 1349
    .line 1350
    goto/16 :goto_7

    .line 1351
    .line 1352
    :sswitch_5d
    const-string v3, "1713"

    .line 1353
    .line 1354
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    move-result v0

    .line 1358
    if-nez v0, :cond_61

    .line 1359
    .line 1360
    goto/16 :goto_6

    .line 1361
    .line 1362
    :cond_61
    const/16 v3, 0x3f

    .line 1363
    .line 1364
    goto/16 :goto_7

    .line 1365
    .line 1366
    :sswitch_5e
    const-string v3, "1601"

    .line 1367
    .line 1368
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1369
    .line 1370
    .line 1371
    move-result v0

    .line 1372
    if-nez v0, :cond_62

    .line 1373
    .line 1374
    goto/16 :goto_6

    .line 1375
    .line 1376
    :cond_62
    const/16 v3, 0x3e

    .line 1377
    .line 1378
    goto/16 :goto_7

    .line 1379
    .line 1380
    :sswitch_5f
    const-string v3, "flo"

    .line 1381
    .line 1382
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v0

    .line 1386
    if-nez v0, :cond_63

    .line 1387
    .line 1388
    goto/16 :goto_6

    .line 1389
    .line 1390
    :cond_63
    const/16 v3, 0x3d

    .line 1391
    .line 1392
    goto/16 :goto_7

    .line 1393
    .line 1394
    :sswitch_60
    const-string v3, "deb"

    .line 1395
    .line 1396
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    if-nez v0, :cond_64

    .line 1401
    .line 1402
    goto/16 :goto_6

    .line 1403
    .line 1404
    :cond_64
    const/16 v3, 0x3c

    .line 1405
    .line 1406
    goto/16 :goto_7

    .line 1407
    .line 1408
    :sswitch_61
    const-string v3, "cv3"

    .line 1409
    .line 1410
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v0

    .line 1414
    if-nez v0, :cond_65

    .line 1415
    .line 1416
    goto/16 :goto_6

    .line 1417
    .line 1418
    :cond_65
    const/16 v3, 0x3b

    .line 1419
    .line 1420
    goto/16 :goto_7

    .line 1421
    .line 1422
    :sswitch_62
    const-string v3, "cv1"

    .line 1423
    .line 1424
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1425
    .line 1426
    .line 1427
    move-result v0

    .line 1428
    if-nez v0, :cond_66

    .line 1429
    .line 1430
    goto/16 :goto_6

    .line 1431
    .line 1432
    :cond_66
    const/16 v3, 0x3a

    .line 1433
    .line 1434
    goto/16 :goto_7

    .line 1435
    .line 1436
    :sswitch_63
    const-string v3, "Z80"

    .line 1437
    .line 1438
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1439
    .line 1440
    .line 1441
    move-result v0

    .line 1442
    if-nez v0, :cond_67

    .line 1443
    .line 1444
    goto/16 :goto_6

    .line 1445
    .line 1446
    :cond_67
    const/16 v3, 0x39

    .line 1447
    .line 1448
    goto/16 :goto_7

    .line 1449
    .line 1450
    :sswitch_64
    const-string v3, "QX1"

    .line 1451
    .line 1452
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1453
    .line 1454
    .line 1455
    move-result v0

    .line 1456
    if-nez v0, :cond_68

    .line 1457
    .line 1458
    goto/16 :goto_6

    .line 1459
    .line 1460
    :cond_68
    const/16 v3, 0x38

    .line 1461
    .line 1462
    goto/16 :goto_7

    .line 1463
    .line 1464
    :sswitch_65
    const-string v3, "PLE"

    .line 1465
    .line 1466
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v0

    .line 1470
    if-nez v0, :cond_69

    .line 1471
    .line 1472
    goto/16 :goto_6

    .line 1473
    .line 1474
    :cond_69
    const/16 v3, 0x37

    .line 1475
    .line 1476
    goto/16 :goto_7

    .line 1477
    .line 1478
    :sswitch_66
    const-string v3, "P85"

    .line 1479
    .line 1480
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1481
    .line 1482
    .line 1483
    move-result v0

    .line 1484
    if-nez v0, :cond_6a

    .line 1485
    .line 1486
    goto/16 :goto_6

    .line 1487
    .line 1488
    :cond_6a
    const/16 v3, 0x36

    .line 1489
    .line 1490
    goto/16 :goto_7

    .line 1491
    .line 1492
    :sswitch_67
    const-string v3, "MX6"

    .line 1493
    .line 1494
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    if-nez v0, :cond_6b

    .line 1499
    .line 1500
    goto/16 :goto_6

    .line 1501
    .line 1502
    :cond_6b
    const/16 v3, 0x35

    .line 1503
    .line 1504
    goto/16 :goto_7

    .line 1505
    .line 1506
    :sswitch_68
    const-string v3, "M5c"

    .line 1507
    .line 1508
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1509
    .line 1510
    .line 1511
    move-result v0

    .line 1512
    if-nez v0, :cond_6c

    .line 1513
    .line 1514
    goto/16 :goto_6

    .line 1515
    .line 1516
    :cond_6c
    const/16 v3, 0x34

    .line 1517
    .line 1518
    goto/16 :goto_7

    .line 1519
    .line 1520
    :sswitch_69
    const-string v3, "M04"

    .line 1521
    .line 1522
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1523
    .line 1524
    .line 1525
    move-result v0

    .line 1526
    if-nez v0, :cond_6d

    .line 1527
    .line 1528
    goto/16 :goto_6

    .line 1529
    .line 1530
    :cond_6d
    const/16 v3, 0x33

    .line 1531
    .line 1532
    goto/16 :goto_7

    .line 1533
    .line 1534
    :sswitch_6a
    const-string v3, "JGZ"

    .line 1535
    .line 1536
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1537
    .line 1538
    .line 1539
    move-result v0

    .line 1540
    if-nez v0, :cond_6e

    .line 1541
    .line 1542
    goto/16 :goto_6

    .line 1543
    .line 1544
    :cond_6e
    const/16 v3, 0x32

    .line 1545
    .line 1546
    goto/16 :goto_7

    .line 1547
    .line 1548
    :sswitch_6b
    const-string v3, "mh"

    .line 1549
    .line 1550
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v0

    .line 1554
    if-nez v0, :cond_6f

    .line 1555
    .line 1556
    goto/16 :goto_6

    .line 1557
    .line 1558
    :cond_6f
    const/16 v3, 0x31

    .line 1559
    .line 1560
    goto/16 :goto_7

    .line 1561
    .line 1562
    :sswitch_6c
    const-string v3, "b5"

    .line 1563
    .line 1564
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1565
    .line 1566
    .line 1567
    move-result v0

    .line 1568
    if-nez v0, :cond_70

    .line 1569
    .line 1570
    goto/16 :goto_6

    .line 1571
    .line 1572
    :cond_70
    const/16 v3, 0x30

    .line 1573
    .line 1574
    goto/16 :goto_7

    .line 1575
    .line 1576
    :sswitch_6d
    const-string v3, "V5"

    .line 1577
    .line 1578
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v0

    .line 1582
    if-nez v0, :cond_71

    .line 1583
    .line 1584
    goto/16 :goto_6

    .line 1585
    .line 1586
    :cond_71
    const/16 v3, 0x2f

    .line 1587
    .line 1588
    goto/16 :goto_7

    .line 1589
    .line 1590
    :sswitch_6e
    const-string v3, "V1"

    .line 1591
    .line 1592
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1593
    .line 1594
    .line 1595
    move-result v0

    .line 1596
    if-nez v0, :cond_72

    .line 1597
    .line 1598
    goto/16 :goto_6

    .line 1599
    .line 1600
    :cond_72
    const/16 v3, 0x2e

    .line 1601
    .line 1602
    goto/16 :goto_7

    .line 1603
    .line 1604
    :sswitch_6f
    const-string v3, "Q5"

    .line 1605
    .line 1606
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1607
    .line 1608
    .line 1609
    move-result v0

    .line 1610
    if-nez v0, :cond_73

    .line 1611
    .line 1612
    goto/16 :goto_6

    .line 1613
    .line 1614
    :cond_73
    const/16 v3, 0x2d

    .line 1615
    .line 1616
    goto/16 :goto_7

    .line 1617
    .line 1618
    :sswitch_70
    const-string v3, "C1"

    .line 1619
    .line 1620
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1621
    .line 1622
    .line 1623
    move-result v0

    .line 1624
    if-nez v0, :cond_74

    .line 1625
    .line 1626
    goto/16 :goto_6

    .line 1627
    .line 1628
    :cond_74
    const/16 v3, 0x2c

    .line 1629
    .line 1630
    goto/16 :goto_7

    .line 1631
    .line 1632
    :sswitch_71
    const-string v3, "woods_fn"

    .line 1633
    .line 1634
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1635
    .line 1636
    .line 1637
    move-result v0

    .line 1638
    if-nez v0, :cond_75

    .line 1639
    .line 1640
    goto/16 :goto_6

    .line 1641
    .line 1642
    :cond_75
    const/16 v3, 0x2b

    .line 1643
    .line 1644
    goto/16 :goto_7

    .line 1645
    .line 1646
    :sswitch_72
    const-string v3, "ELUGA_A3_Pro"

    .line 1647
    .line 1648
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1649
    .line 1650
    .line 1651
    move-result v0

    .line 1652
    if-nez v0, :cond_76

    .line 1653
    .line 1654
    goto/16 :goto_6

    .line 1655
    .line 1656
    :cond_76
    const/16 v3, 0x2a

    .line 1657
    .line 1658
    goto/16 :goto_7

    .line 1659
    .line 1660
    :sswitch_73
    const-string v3, "Z12_PRO"

    .line 1661
    .line 1662
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1663
    .line 1664
    .line 1665
    move-result v0

    .line 1666
    if-nez v0, :cond_77

    .line 1667
    .line 1668
    goto/16 :goto_6

    .line 1669
    .line 1670
    :cond_77
    const/16 v3, 0x29

    .line 1671
    .line 1672
    goto/16 :goto_7

    .line 1673
    .line 1674
    :sswitch_74
    const-string v3, "BLACK-1X"

    .line 1675
    .line 1676
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1677
    .line 1678
    .line 1679
    move-result v0

    .line 1680
    if-nez v0, :cond_78

    .line 1681
    .line 1682
    goto/16 :goto_6

    .line 1683
    .line 1684
    :cond_78
    const/16 v3, 0x28

    .line 1685
    .line 1686
    goto/16 :goto_7

    .line 1687
    .line 1688
    :sswitch_75
    const-string v3, "taido_row"

    .line 1689
    .line 1690
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    if-nez v0, :cond_79

    .line 1695
    .line 1696
    goto/16 :goto_6

    .line 1697
    .line 1698
    :cond_79
    const/16 v3, 0x27

    .line 1699
    .line 1700
    goto/16 :goto_7

    .line 1701
    .line 1702
    :sswitch_76
    const-string v3, "Pixi4-7_3G"

    .line 1703
    .line 1704
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v0

    .line 1708
    if-nez v0, :cond_7a

    .line 1709
    .line 1710
    goto/16 :goto_6

    .line 1711
    .line 1712
    :cond_7a
    const/16 v3, 0x26

    .line 1713
    .line 1714
    goto/16 :goto_7

    .line 1715
    .line 1716
    :sswitch_77
    const-string v3, "GIONEE_GBL7360"

    .line 1717
    .line 1718
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1719
    .line 1720
    .line 1721
    move-result v0

    .line 1722
    if-nez v0, :cond_7b

    .line 1723
    .line 1724
    goto/16 :goto_6

    .line 1725
    .line 1726
    :cond_7b
    const/16 v3, 0x25

    .line 1727
    .line 1728
    goto/16 :goto_7

    .line 1729
    .line 1730
    :sswitch_78
    const-string v3, "GiONEE_CBL7513"

    .line 1731
    .line 1732
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1733
    .line 1734
    .line 1735
    move-result v0

    .line 1736
    if-nez v0, :cond_7c

    .line 1737
    .line 1738
    goto/16 :goto_6

    .line 1739
    .line 1740
    :cond_7c
    const/16 v3, 0x24

    .line 1741
    .line 1742
    goto/16 :goto_7

    .line 1743
    .line 1744
    :sswitch_79
    const-string v3, "OnePlus5T"

    .line 1745
    .line 1746
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1747
    .line 1748
    .line 1749
    move-result v0

    .line 1750
    if-nez v0, :cond_7d

    .line 1751
    .line 1752
    goto/16 :goto_6

    .line 1753
    .line 1754
    :cond_7d
    const/16 v3, 0x23

    .line 1755
    .line 1756
    goto/16 :goto_7

    .line 1757
    .line 1758
    :sswitch_7a
    const-string v3, "whyred"

    .line 1759
    .line 1760
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1761
    .line 1762
    .line 1763
    move-result v0

    .line 1764
    if-nez v0, :cond_7e

    .line 1765
    .line 1766
    goto/16 :goto_6

    .line 1767
    .line 1768
    :cond_7e
    const/16 v3, 0x22

    .line 1769
    .line 1770
    goto/16 :goto_7

    .line 1771
    .line 1772
    :sswitch_7b
    const-string v3, "watson"

    .line 1773
    .line 1774
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1775
    .line 1776
    .line 1777
    move-result v0

    .line 1778
    if-nez v0, :cond_7f

    .line 1779
    .line 1780
    goto/16 :goto_6

    .line 1781
    .line 1782
    :cond_7f
    const/16 v3, 0x21

    .line 1783
    .line 1784
    goto/16 :goto_7

    .line 1785
    .line 1786
    :sswitch_7c
    const-string v3, "SVP-DTV15"

    .line 1787
    .line 1788
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1789
    .line 1790
    .line 1791
    move-result v0

    .line 1792
    if-nez v0, :cond_80

    .line 1793
    .line 1794
    goto/16 :goto_6

    .line 1795
    .line 1796
    :cond_80
    const/16 v3, 0x20

    .line 1797
    .line 1798
    goto/16 :goto_7

    .line 1799
    .line 1800
    :sswitch_7d
    const-string v3, "A7000-a"

    .line 1801
    .line 1802
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1803
    .line 1804
    .line 1805
    move-result v0

    .line 1806
    if-nez v0, :cond_81

    .line 1807
    .line 1808
    goto/16 :goto_6

    .line 1809
    .line 1810
    :cond_81
    const/16 v3, 0x1f

    .line 1811
    .line 1812
    goto/16 :goto_7

    .line 1813
    .line 1814
    :sswitch_7e
    const-string v3, "nicklaus_f"

    .line 1815
    .line 1816
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1817
    .line 1818
    .line 1819
    move-result v0

    .line 1820
    if-nez v0, :cond_82

    .line 1821
    .line 1822
    goto/16 :goto_6

    .line 1823
    .line 1824
    :cond_82
    const/16 v3, 0x1e

    .line 1825
    .line 1826
    goto/16 :goto_7

    .line 1827
    .line 1828
    :sswitch_7f
    const-string v3, "tcl_eu"

    .line 1829
    .line 1830
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1831
    .line 1832
    .line 1833
    move-result v0

    .line 1834
    if-nez v0, :cond_83

    .line 1835
    .line 1836
    goto/16 :goto_6

    .line 1837
    .line 1838
    :cond_83
    const/16 v3, 0x1d

    .line 1839
    .line 1840
    goto/16 :goto_7

    .line 1841
    .line 1842
    :sswitch_80
    const-string v4, "ELUGA_Ray_X"

    .line 1843
    .line 1844
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1845
    .line 1846
    .line 1847
    move-result v0

    .line 1848
    if-nez v0, :cond_a0

    .line 1849
    .line 1850
    goto/16 :goto_6

    .line 1851
    .line 1852
    :sswitch_81
    const-string v3, "s905x018"

    .line 1853
    .line 1854
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1855
    .line 1856
    .line 1857
    move-result v0

    .line 1858
    if-nez v0, :cond_84

    .line 1859
    .line 1860
    goto/16 :goto_6

    .line 1861
    .line 1862
    :cond_84
    const/16 v3, 0x1b

    .line 1863
    .line 1864
    goto/16 :goto_7

    .line 1865
    .line 1866
    :sswitch_82
    const-string v3, "A10-70L"

    .line 1867
    .line 1868
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1869
    .line 1870
    .line 1871
    move-result v0

    .line 1872
    if-nez v0, :cond_85

    .line 1873
    .line 1874
    goto/16 :goto_6

    .line 1875
    .line 1876
    :cond_85
    const/16 v3, 0x1a

    .line 1877
    .line 1878
    goto/16 :goto_7

    .line 1879
    .line 1880
    :sswitch_83
    const-string v3, "A10-70F"

    .line 1881
    .line 1882
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1883
    .line 1884
    .line 1885
    move-result v0

    .line 1886
    if-nez v0, :cond_86

    .line 1887
    .line 1888
    goto/16 :goto_6

    .line 1889
    .line 1890
    :cond_86
    const/16 v3, 0x19

    .line 1891
    .line 1892
    goto/16 :goto_7

    .line 1893
    .line 1894
    :sswitch_84
    const-string v3, "namath"

    .line 1895
    .line 1896
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1897
    .line 1898
    .line 1899
    move-result v0

    .line 1900
    if-nez v0, :cond_87

    .line 1901
    .line 1902
    goto/16 :goto_6

    .line 1903
    .line 1904
    :cond_87
    const/16 v3, 0x18

    .line 1905
    .line 1906
    goto/16 :goto_7

    .line 1907
    .line 1908
    :sswitch_85
    const-string v3, "Slate_Pro"

    .line 1909
    .line 1910
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1911
    .line 1912
    .line 1913
    move-result v0

    .line 1914
    if-nez v0, :cond_88

    .line 1915
    .line 1916
    goto/16 :goto_6

    .line 1917
    .line 1918
    :cond_88
    const/16 v3, 0x17

    .line 1919
    .line 1920
    goto/16 :goto_7

    .line 1921
    .line 1922
    :sswitch_86
    const-string v3, "iris60"

    .line 1923
    .line 1924
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1925
    .line 1926
    .line 1927
    move-result v0

    .line 1928
    if-nez v0, :cond_89

    .line 1929
    .line 1930
    goto/16 :goto_6

    .line 1931
    .line 1932
    :cond_89
    const/16 v3, 0x16

    .line 1933
    .line 1934
    goto/16 :goto_7

    .line 1935
    .line 1936
    :sswitch_87
    const-string v3, "BRAVIA_ATV2"

    .line 1937
    .line 1938
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1939
    .line 1940
    .line 1941
    move-result v0

    .line 1942
    if-nez v0, :cond_8a

    .line 1943
    .line 1944
    goto/16 :goto_6

    .line 1945
    .line 1946
    :cond_8a
    const/16 v3, 0x15

    .line 1947
    .line 1948
    goto/16 :goto_7

    .line 1949
    .line 1950
    :sswitch_88
    const-string v3, "GiONEE_GBL7319"

    .line 1951
    .line 1952
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1953
    .line 1954
    .line 1955
    move-result v0

    .line 1956
    if-nez v0, :cond_8b

    .line 1957
    .line 1958
    goto/16 :goto_6

    .line 1959
    .line 1960
    :cond_8b
    const/16 v3, 0x14

    .line 1961
    .line 1962
    goto/16 :goto_7

    .line 1963
    .line 1964
    :sswitch_89
    const-string v3, "panell_dt"

    .line 1965
    .line 1966
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1967
    .line 1968
    .line 1969
    move-result v0

    .line 1970
    if-nez v0, :cond_8c

    .line 1971
    .line 1972
    goto/16 :goto_6

    .line 1973
    .line 1974
    :cond_8c
    const/16 v3, 0x13

    .line 1975
    .line 1976
    goto/16 :goto_7

    .line 1977
    .line 1978
    :sswitch_8a
    const-string v3, "panell_ds"

    .line 1979
    .line 1980
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1981
    .line 1982
    .line 1983
    move-result v0

    .line 1984
    if-nez v0, :cond_8d

    .line 1985
    .line 1986
    goto/16 :goto_6

    .line 1987
    .line 1988
    :cond_8d
    const/16 v3, 0x12

    .line 1989
    .line 1990
    goto/16 :goto_7

    .line 1991
    .line 1992
    :sswitch_8b
    const-string v3, "panell_dl"

    .line 1993
    .line 1994
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1995
    .line 1996
    .line 1997
    move-result v0

    .line 1998
    if-nez v0, :cond_8e

    .line 1999
    .line 2000
    goto/16 :goto_6

    .line 2001
    .line 2002
    :cond_8e
    const/16 v3, 0x11

    .line 2003
    .line 2004
    goto/16 :goto_7

    .line 2005
    .line 2006
    :sswitch_8c
    const-string v3, "vernee_M5"

    .line 2007
    .line 2008
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2009
    .line 2010
    .line 2011
    move-result v0

    .line 2012
    if-nez v0, :cond_8f

    .line 2013
    .line 2014
    goto/16 :goto_6

    .line 2015
    .line 2016
    :cond_8f
    const/16 v3, 0x10

    .line 2017
    .line 2018
    goto/16 :goto_7

    .line 2019
    .line 2020
    :sswitch_8d
    const-string v3, "pacificrim"

    .line 2021
    .line 2022
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2023
    .line 2024
    .line 2025
    move-result v0

    .line 2026
    if-nez v0, :cond_90

    .line 2027
    .line 2028
    goto/16 :goto_6

    .line 2029
    .line 2030
    :cond_90
    const/16 v3, 0xf

    .line 2031
    .line 2032
    goto/16 :goto_7

    .line 2033
    .line 2034
    :sswitch_8e
    const-string v3, "Phantom6"

    .line 2035
    .line 2036
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2037
    .line 2038
    .line 2039
    move-result v0

    .line 2040
    if-nez v0, :cond_91

    .line 2041
    .line 2042
    goto/16 :goto_6

    .line 2043
    .line 2044
    :cond_91
    const/16 v3, 0xe

    .line 2045
    .line 2046
    goto/16 :goto_7

    .line 2047
    .line 2048
    :sswitch_8f
    const-string v3, "ComioS1"

    .line 2049
    .line 2050
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2051
    .line 2052
    .line 2053
    move-result v0

    .line 2054
    if-nez v0, :cond_92

    .line 2055
    .line 2056
    goto/16 :goto_6

    .line 2057
    .line 2058
    :cond_92
    const/16 v3, 0xd

    .line 2059
    .line 2060
    goto/16 :goto_7

    .line 2061
    .line 2062
    :sswitch_90
    const-string v3, "XT1663"

    .line 2063
    .line 2064
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2065
    .line 2066
    .line 2067
    move-result v0

    .line 2068
    if-nez v0, :cond_93

    .line 2069
    .line 2070
    goto/16 :goto_6

    .line 2071
    .line 2072
    :cond_93
    const/16 v3, 0xc

    .line 2073
    .line 2074
    goto/16 :goto_7

    .line 2075
    .line 2076
    :sswitch_91
    const-string v3, "RAIJIN"

    .line 2077
    .line 2078
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2079
    .line 2080
    .line 2081
    move-result v0

    .line 2082
    if-nez v0, :cond_94

    .line 2083
    .line 2084
    goto/16 :goto_6

    .line 2085
    .line 2086
    :cond_94
    const/16 v3, 0xb

    .line 2087
    .line 2088
    goto/16 :goto_7

    .line 2089
    .line 2090
    :sswitch_92
    const-string v3, "AquaPowerM"

    .line 2091
    .line 2092
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2093
    .line 2094
    .line 2095
    move-result v0

    .line 2096
    if-nez v0, :cond_95

    .line 2097
    .line 2098
    goto/16 :goto_6

    .line 2099
    .line 2100
    :cond_95
    const/16 v3, 0xa

    .line 2101
    .line 2102
    goto/16 :goto_7

    .line 2103
    .line 2104
    :sswitch_93
    const-string v3, "PGN611"

    .line 2105
    .line 2106
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2107
    .line 2108
    .line 2109
    move-result v0

    .line 2110
    if-nez v0, :cond_96

    .line 2111
    .line 2112
    goto/16 :goto_6

    .line 2113
    .line 2114
    :cond_96
    const/16 v3, 0x9

    .line 2115
    .line 2116
    goto/16 :goto_7

    .line 2117
    .line 2118
    :sswitch_94
    const-string v3, "PGN610"

    .line 2119
    .line 2120
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2121
    .line 2122
    .line 2123
    move-result v0

    .line 2124
    if-nez v0, :cond_97

    .line 2125
    .line 2126
    goto/16 :goto_6

    .line 2127
    .line 2128
    :cond_97
    const/16 v3, 0x8

    .line 2129
    .line 2130
    goto/16 :goto_7

    .line 2131
    .line 2132
    :sswitch_95
    const-string v3, "PGN528"

    .line 2133
    .line 2134
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2135
    .line 2136
    .line 2137
    move-result v0

    .line 2138
    if-nez v0, :cond_98

    .line 2139
    .line 2140
    goto/16 :goto_6

    .line 2141
    .line 2142
    :cond_98
    const/4 v3, 0x7

    .line 2143
    goto :goto_7

    .line 2144
    :sswitch_96
    const-string v3, "NX573J"

    .line 2145
    .line 2146
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2147
    .line 2148
    .line 2149
    move-result v0

    .line 2150
    if-nez v0, :cond_99

    .line 2151
    .line 2152
    goto/16 :goto_6

    .line 2153
    .line 2154
    :cond_99
    const/4 v3, 0x6

    .line 2155
    goto :goto_7

    .line 2156
    :sswitch_97
    const-string v3, "NX541J"

    .line 2157
    .line 2158
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2159
    .line 2160
    .line 2161
    move-result v0

    .line 2162
    if-nez v0, :cond_9a

    .line 2163
    .line 2164
    goto/16 :goto_6

    .line 2165
    .line 2166
    :cond_9a
    const/4 v3, 0x5

    .line 2167
    goto :goto_7

    .line 2168
    :sswitch_98
    const-string v3, "CP8676_I02"

    .line 2169
    .line 2170
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2171
    .line 2172
    .line 2173
    move-result v0

    .line 2174
    if-nez v0, :cond_9b

    .line 2175
    .line 2176
    goto/16 :goto_6

    .line 2177
    .line 2178
    :cond_9b
    const/4 v3, 0x4

    .line 2179
    goto :goto_7

    .line 2180
    :sswitch_99
    const-string v3, "K50a40"

    .line 2181
    .line 2182
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2183
    .line 2184
    .line 2185
    move-result v0

    .line 2186
    if-nez v0, :cond_9c

    .line 2187
    .line 2188
    goto/16 :goto_6

    .line 2189
    .line 2190
    :cond_9c
    const/4 v3, 0x3

    .line 2191
    goto :goto_7

    .line 2192
    :sswitch_9a
    const-string v3, "GIONEE_SWW1631"

    .line 2193
    .line 2194
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2195
    .line 2196
    .line 2197
    move-result v0

    .line 2198
    if-nez v0, :cond_9d

    .line 2199
    .line 2200
    goto/16 :goto_6

    .line 2201
    .line 2202
    :cond_9d
    const/4 v3, 0x2

    .line 2203
    goto :goto_7

    .line 2204
    :sswitch_9b
    const-string v3, "GIONEE_SWW1627"

    .line 2205
    .line 2206
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2207
    .line 2208
    .line 2209
    move-result v0

    .line 2210
    if-nez v0, :cond_9e

    .line 2211
    .line 2212
    goto/16 :goto_6

    .line 2213
    .line 2214
    :cond_9e
    const/4 v3, 0x1

    .line 2215
    goto :goto_7

    .line 2216
    :sswitch_9c
    const-string v3, "GIONEE_SWW1609"

    .line 2217
    .line 2218
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2219
    .line 2220
    .line 2221
    move-result v0

    .line 2222
    if-nez v0, :cond_9f

    .line 2223
    .line 2224
    goto/16 :goto_6

    .line 2225
    .line 2226
    :cond_9f
    const/4 v3, 0x0

    .line 2227
    :cond_a0
    :goto_7
    packed-switch v3, :pswitch_data_2

    .line 2228
    .line 2229
    .line 2230
    const-string v0, "JSN-L21"

    .line 2231
    .line 2232
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2233
    .line 2234
    .line 2235
    move-result v0

    .line 2236
    if-nez v0, :cond_9

    .line 2237
    .line 2238
    :cond_a1
    :goto_8
    :try_start_3
    sput-boolean v1, Lp5/i;->E1:Z

    .line 2239
    .line 2240
    sput-boolean v11, Lp5/i;->D1:Z

    .line 2241
    .line 2242
    goto :goto_9

    .line 2243
    :catchall_0
    move-exception v0

    .line 2244
    goto :goto_a

    .line 2245
    :cond_a2
    :goto_9
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2246
    sget-boolean v0, Lp5/i;->E1:Z

    .line 2247
    .line 2248
    return v0

    .line 2249
    :goto_a
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 2250
    throw v0

    .line 2251
    :sswitch_data_0
    .sparse-switch
        -0x4fd0ea5f -> :sswitch_7
        -0x48b8f57f -> :sswitch_6
        -0x48b8bd30 -> :sswitch_5
        -0x3c588c8a -> :sswitch_4
        -0x2d5172e2 -> :sswitch_3
        -0x3de1850 -> :sswitch_2
        0x341e81 -> :sswitch_1
        0x31316ffa -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

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
    :sswitch_data_1
    .sparse-switch
        -0x14d76e6c -> :sswitch_10
        -0x132295cd -> :sswitch_f
        0x1e9d52 -> :sswitch_e
        0x1e9d5f -> :sswitch_d
        0x1e9d63 -> :sswitch_c
        0x6a6b6031 -> :sswitch_b
        0x6a6b6034 -> :sswitch_a
        0x6b2deee6 -> :sswitch_9
        0x7e53ab34 -> :sswitch_8
    .end sparse-switch

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
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

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
    :sswitch_data_2
    .sparse-switch
        -0x7fd6c3bd -> :sswitch_9c
        -0x7fd6c381 -> :sswitch_9b
        -0x7fd6c368 -> :sswitch_9a
        -0x7d026749 -> :sswitch_99
        -0x78929d6a -> :sswitch_98
        -0x75f50a1e -> :sswitch_97
        -0x75f4fe9d -> :sswitch_96
        -0x736f875c -> :sswitch_95
        -0x736f83c2 -> :sswitch_94
        -0x736f83c1 -> :sswitch_93
        -0x7327ce1c -> :sswitch_92
        -0x705c574b -> :sswitch_91
        -0x651ebb62 -> :sswitch_90
        -0x6423293b -> :sswitch_8f
        -0x604f5117 -> :sswitch_8e
        -0x5f691e13 -> :sswitch_8d
        -0x5ca40cc4 -> :sswitch_8c
        -0x58520ec1 -> :sswitch_8b
        -0x58520eba -> :sswitch_8a
        -0x58520eb9 -> :sswitch_89
        -0x4eaed329 -> :sswitch_88
        -0x4892fb4f -> :sswitch_87
        -0x465b3df3 -> :sswitch_86
        -0x43e6c939 -> :sswitch_85
        -0x3ec0fcc5 -> :sswitch_84
        -0x3b33cca0 -> :sswitch_83
        -0x3b33cc9a -> :sswitch_82
        -0x398ae3f6 -> :sswitch_81
        -0x391f0fb4 -> :sswitch_80
        -0x346837ae -> :sswitch_7f
        -0x323788e3 -> :sswitch_7e
        -0x30f57652 -> :sswitch_7d
        -0x2f88a116 -> :sswitch_7c
        -0x2f61ed98 -> :sswitch_7b
        -0x2efd0837 -> :sswitch_7a
        -0x2e9e9441 -> :sswitch_79
        -0x2247b8b1 -> :sswitch_78
        -0x1f0fa2b7 -> :sswitch_77
        -0x19af3b41 -> :sswitch_76
        -0x114fad3e -> :sswitch_75
        -0x10dae90b -> :sswitch_74
        -0x1084b7b7 -> :sswitch_73
        -0xa5988e9 -> :sswitch_72
        -0x35f9fbf -> :sswitch_71
        0x84e -> :sswitch_70
        0xa04 -> :sswitch_6f
        0xa9b -> :sswitch_6e
        0xa9f -> :sswitch_6d
        0xc13 -> :sswitch_6c
        0xd9b -> :sswitch_6b
        0x11ebd -> :sswitch_6a
        0x12711 -> :sswitch_69
        0x127db -> :sswitch_68
        0x12beb -> :sswitch_67
        0x1334d -> :sswitch_66
        0x135c9 -> :sswitch_65
        0x13aea -> :sswitch_64
        0x158d2 -> :sswitch_63
        0x1821e -> :sswitch_62
        0x18220 -> :sswitch_61
        0x18401 -> :sswitch_60
        0x18c69 -> :sswitch_5f
        0x1716e6 -> :sswitch_5e
        0x171ac8 -> :sswitch_5d
        0x171ac9 -> :sswitch_5c
        0x208c61 -> :sswitch_5b
        0x208c63 -> :sswitch_5a
        0x208c80 -> :sswitch_59
        0x208c9f -> :sswitch_58
        0x208cbe -> :sswitch_57
        0x208cc0 -> :sswitch_56
        0x252f5f -> :sswitch_55
        0x25981d -> :sswitch_54
        0x259b88 -> :sswitch_53
        0x290a13 -> :sswitch_52
        0x3021fd -> :sswitch_51
        0x321e47 -> :sswitch_50
        0x332327 -> :sswitch_4f
        0x33ab63 -> :sswitch_4e
        0x27691fb -> :sswitch_4d
        0x30f8881 -> :sswitch_4c
        0x30f8c42 -> :sswitch_4b
        0x349f581 -> :sswitch_4a
        0x3ab0ea7 -> :sswitch_49
        0x3e53ea5 -> :sswitch_48
        0x3f25a44 -> :sswitch_47
        0x3f25a46 -> :sswitch_46
        0x3f25a49 -> :sswitch_45
        0x3f25e05 -> :sswitch_44
        0x3f25e07 -> :sswitch_43
        0x3f25e09 -> :sswitch_42
        0x3f261c6 -> :sswitch_41
        0x48dce49 -> :sswitch_40
        0x48dd589 -> :sswitch_3f
        0x48dd8af -> :sswitch_3e
        0x4d36832 -> :sswitch_3d
        0x4f0b0e7 -> :sswitch_3c
        0x5e2479e -> :sswitch_3b
        0x60acc05 -> :sswitch_3a
        0x6214744 -> :sswitch_39
        0x9d91379 -> :sswitch_38
        0xadc0551 -> :sswitch_37
        0xea056b3 -> :sswitch_36
        0x1121dbc3 -> :sswitch_35
        0x1255818c -> :sswitch_34
        0x1263990d -> :sswitch_33
        0x12d90f3a -> :sswitch_32
        0x12d90f4c -> :sswitch_31
        0x12d98b1b -> :sswitch_30
        0x12d98b22 -> :sswitch_2f
        0x1844c711 -> :sswitch_2e
        0x1e3e8044 -> :sswitch_2d
        0x2f5336ed -> :sswitch_2c
        0x2f54115e -> :sswitch_2b
        0x2f541849 -> :sswitch_2a
        0x31cf010e -> :sswitch_29
        0x36ad82f4 -> :sswitch_28
        0x391a0b61 -> :sswitch_27
        0x3f3728cd -> :sswitch_26
        0x448ec687 -> :sswitch_25
        0x46260f63 -> :sswitch_24
        0x4c505106 -> :sswitch_23
        0x4de67084 -> :sswitch_22
        0x506ac5a9 -> :sswitch_21
        0x5abad9cd -> :sswitch_20
        0x64d2e6e9 -> :sswitch_1f
        0x64d2eac5 -> :sswitch_1e
        0x65e4085b -> :sswitch_1d
        0x6f373556 -> :sswitch_1c
        0x719f1dcb -> :sswitch_1b
        0x75d9a0f0 -> :sswitch_1a
        0x7796d144 -> :sswitch_19
        0x785bcb26 -> :sswitch_18
        0x78fc0e50 -> :sswitch_17
        0x790521fb -> :sswitch_16
        0x7933207f -> :sswitch_15
        0x7a05a409 -> :sswitch_14
        0x7a0696bd -> :sswitch_13
        0x7a16dfe7 -> :sswitch_12
        0x7a1f0e95 -> :sswitch_11
    .end sparse-switch

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
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
.end method

.method public static v0(Lg5/n;Lm4/q;)I
    .locals 11

    .line 1
    iget v0, p1, Lm4/q;->u:I

    .line 2
    .line 3
    iget v1, p1, Lm4/q;->v:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v0, v2, :cond_d

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    iget-object v3, p1, Lm4/q;->n:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v4, "video/dolby-vision"

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const-string v5, "video/avc"

    .line 24
    .line 25
    const-string v6, "video/av01"

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    const-string v8, "video/hevc"

    .line 29
    .line 30
    const/4 v9, 0x2

    .line 31
    if-eqz v4, :cond_4

    .line 32
    .line 33
    invoke-static {p1}, Lg5/y;->d(Lm4/q;)Landroid/util/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/16 v3, 0x200

    .line 48
    .line 49
    if-eq p1, v3, :cond_2

    .line 50
    .line 51
    if-eq p1, v7, :cond_2

    .line 52
    .line 53
    if-ne p1, v9, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/16 v3, 0x400

    .line 57
    .line 58
    if-ne p1, v3, :cond_3

    .line 59
    .line 60
    move-object v3, v6

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    move-object v3, v5

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move-object v3, v8

    .line 65
    :cond_4
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/4 v4, 0x4

    .line 70
    const/4 v10, 0x3

    .line 71
    sparse-switch p1, :sswitch_data_0

    .line 72
    .line 73
    .line 74
    :goto_2
    const/4 v7, -0x1

    .line 75
    goto :goto_3

    .line 76
    :sswitch_0
    const-string p1, "video/x-vnd.on2.vp9"

    .line 77
    .line 78
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    const/4 v7, 0x6

    .line 86
    goto :goto_3

    .line 87
    :sswitch_1
    const-string p1, "video/x-vnd.on2.vp8"

    .line 88
    .line 89
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    const/4 v7, 0x5

    .line 97
    goto :goto_3

    .line 98
    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_7

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    const/4 v7, 0x4

    .line 106
    goto :goto_3

    .line 107
    :sswitch_3
    const-string p1, "video/mp4v-es"

    .line 108
    .line 109
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    const/4 v7, 0x3

    .line 117
    goto :goto_3

    .line 118
    :sswitch_4
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_9

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_9
    const/4 v7, 0x2

    .line 126
    goto :goto_3

    .line 127
    :sswitch_5
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_b

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :sswitch_6
    const-string p1, "video/3gpp"

    .line 135
    .line 136
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_a

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_a
    const/4 v7, 0x0

    .line 144
    :cond_b
    :goto_3
    packed-switch v7, :pswitch_data_0

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :pswitch_0
    mul-int v0, v0, v1

    .line 149
    .line 150
    mul-int/lit8 v0, v0, 0x3

    .line 151
    .line 152
    div-int/lit8 v0, v0, 0x8

    .line 153
    .line 154
    return v0

    .line 155
    :pswitch_1
    sget-object p1, Lp4/c0;->d:Ljava/lang/String;

    .line 156
    .line 157
    const-string v3, "BRAVIA 4K 2015"

    .line 158
    .line 159
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_d

    .line 164
    .line 165
    const-string v3, "Amazon"

    .line 166
    .line 167
    sget-object v5, Lp4/c0;->c:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_c

    .line 174
    .line 175
    const-string v3, "KFSOWI"

    .line 176
    .line 177
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_d

    .line 182
    .line 183
    const-string v3, "AFTS"

    .line 184
    .line 185
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_c

    .line 190
    .line 191
    iget-boolean p0, p0, Lg5/n;->f:Z

    .line 192
    .line 193
    if-eqz p0, :cond_c

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_c
    const/16 p0, 0x10

    .line 197
    .line 198
    invoke-static {v0, p0}, Lp4/c0;->f(II)I

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    invoke-static {v1, p0}, Lp4/c0;->f(II)I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    mul-int p0, p0, p1

    .line 207
    .line 208
    mul-int/lit16 p0, p0, 0x300

    .line 209
    .line 210
    div-int/2addr p0, v4

    .line 211
    return p0

    .line 212
    :pswitch_2
    mul-int v0, v0, v1

    .line 213
    .line 214
    mul-int/lit8 v0, v0, 0x3

    .line 215
    .line 216
    div-int/2addr v0, v4

    .line 217
    const/high16 p0, 0x200000

    .line 218
    .line 219
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    return p0

    .line 224
    :pswitch_3
    mul-int v0, v0, v1

    .line 225
    .line 226
    mul-int/lit8 v0, v0, 0x3

    .line 227
    .line 228
    div-int/2addr v0, v4

    .line 229
    return v0

    .line 230
    :cond_d
    :goto_4
    return v2

    .line 231
    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_6
        -0x631b55f6 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
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

.method public static w0(Landroid/content/Context;Lg5/r;Lm4/q;ZZ)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p2, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lya/a1;->e:Lya/a1;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget v1, Lp4/c0;->a:I

    .line 9
    .line 10
    const/16 v2, 0x1a

    .line 11
    .line 12
    if-lt v1, v2, :cond_2

    .line 13
    .line 14
    const-string v1, "video/dolby-vision"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-static {p0}, Ln7/b0;->i(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_2

    .line 27
    .line 28
    invoke-static {p2}, Lg5/y;->b(Lm4/q;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    sget-object p0, Lya/a1;->e:Lya/a1;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {p1, p0, p3, p4}, Lg5/r;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {p1, p2, p3, p4}, Lg5/y;->g(Lg5/r;Lm4/q;ZZ)Lya/a1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
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
.end method

.method public static x0(Lg5/n;Lm4/q;)I
    .locals 4

    .line 1
    iget v0, p1, Lm4/q;->o:I

    .line 2
    .line 3
    iget-object v1, p1, Lm4/q;->q:Ljava/util/List;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v0, v2, :cond_1

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v0, p0, :cond_0

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, [B

    .line 21
    .line 22
    array-length v3, v3

    .line 23
    add-int/2addr v2, v3

    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget p0, p1, Lm4/q;->o:I

    .line 28
    .line 29
    add-int/2addr p0, v2

    .line 30
    return p0

    .line 31
    :cond_1
    invoke-static {p0, p1}, Lp5/i;->v0(Lg5/n;Lm4/q;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
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
.method public final A0()V
    .locals 8

    .line 1
    iget v0, p0, Lp5/i;->m1:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lv4/e;->g:Lp4/v;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lp5/i;->l1:J

    .line 15
    .line 16
    sub-long v2, v0, v2

    .line 17
    .line 18
    iget v4, p0, Lp5/i;->m1:I

    .line 19
    .line 20
    iget-object v5, p0, Lp5/i;->U0:Lp5/y;

    .line 21
    .line 22
    iget-object v6, v5, Lp5/y;->b:Landroid/os/Handler;

    .line 23
    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    new-instance v7, Lp5/w;

    .line 27
    .line 28
    invoke-direct {v7, v5, v4, v2, v3}, Lp5/w;-><init>(Lp5/y;IJ)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    iput v2, p0, Lp5/i;->m1:I

    .line 36
    .line 37
    iput-wide v0, p0, Lp5/i;->l1:J

    .line 38
    .line 39
    :cond_1
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
.end method

.method public final B(Lg5/n;Lm4/q;Lm4/q;)Lv4/g;
    .locals 8

    .line 1
    invoke-virtual {p1, p2, p3}, Lg5/n;->b(Lm4/q;Lm4/q;)Lv4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lv4/g;->e:I

    .line 6
    .line 7
    iget-object v2, p0, Lp5/i;->Z0:Li7/j1;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget v3, p3, Lm4/q;->u:I

    .line 13
    .line 14
    iget v4, v2, Li7/j1;->a:I

    .line 15
    .line 16
    if-gt v3, v4, :cond_0

    .line 17
    .line 18
    iget v3, p3, Lm4/q;->v:I

    .line 19
    .line 20
    iget v4, v2, Li7/j1;->b:I

    .line 21
    .line 22
    if-le v3, v4, :cond_1

    .line 23
    .line 24
    :cond_0
    or-int/lit16 v1, v1, 0x100

    .line 25
    .line 26
    :cond_1
    invoke-static {p1, p3}, Lp5/i;->x0(Lg5/n;Lm4/q;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget v2, v2, Li7/j1;->c:I

    .line 31
    .line 32
    if-le v3, v2, :cond_2

    .line 33
    .line 34
    or-int/lit8 v1, v1, 0x40

    .line 35
    .line 36
    :cond_2
    move v7, v1

    .line 37
    new-instance v2, Lv4/g;

    .line 38
    .line 39
    iget-object v3, p1, Lg5/n;->a:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v7, :cond_3

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    :goto_0
    move-object v4, p2

    .line 46
    move-object v5, p3

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    iget p1, v0, Lv4/g;->d:I

    .line 49
    .line 50
    move v6, p1

    .line 51
    goto :goto_0

    .line 52
    :goto_1
    invoke-direct/range {v2 .. v7}, Lv4/g;-><init>(Ljava/lang/String;Lm4/q;Lm4/q;II)V

    .line 53
    .line 54
    .line 55
    return-object v2
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

.method public final B0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lp5/i;->v1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget v0, Lp4/c0;->a:I

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lg5/q;->K:Lg5/k;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v2, Lp5/h;

    .line 18
    .line 19
    invoke-direct {v2, p0, v1}, Lp5/h;-><init>(Lp5/i;Lg5/k;)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Lp5/i;->x1:Lp5/h;

    .line 23
    .line 24
    const/16 v2, 0x21

    .line 25
    .line 26
    if-lt v0, v2, :cond_2

    .line 27
    .line 28
    new-instance v0, Landroid/os/Bundle;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, "tunnel-peek"

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1, v0}, Lg5/k;->c(Landroid/os/Bundle;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
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

.method public final C(Ljava/lang/IllegalStateException;Lg5/n;)Lg5/m;
    .locals 2

    .line 1
    new-instance v0, Lp5/f;

    .line 2
    .line 3
    iget-object v1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lg5/m;-><init>(Ljava/lang/IllegalStateException;Lg5/n;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
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

.method public final C0(Lg5/k;IJ)V
    .locals 3

    .line 1
    const-string v0, "releaseOutputBuffer"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p3, p4}, Lg5/k;->N(IJ)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 13
    .line 14
    iget p2, p1, Lv4/f;->e:I

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    add-int/2addr p2, p3

    .line 18
    iput p2, p1, Lv4/f;->e:I

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lp5/i;->n1:I

    .line 22
    .line 23
    iget-object p2, p0, Lp5/i;->c1:Lp5/l;

    .line 24
    .line 25
    if-nez p2, :cond_3

    .line 26
    .line 27
    iget-object p2, p0, Lp5/i;->s1:Lm4/u1;

    .line 28
    .line 29
    sget-object p4, Lm4/u1;->d:Lm4/u1;

    .line 30
    .line 31
    invoke-virtual {p2, p4}, Lm4/u1;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    iget-object v0, p0, Lp5/i;->U0:Lp5/y;

    .line 36
    .line 37
    if-nez p4, :cond_0

    .line 38
    .line 39
    iget-object p4, p0, Lp5/i;->t1:Lm4/u1;

    .line 40
    .line 41
    invoke-virtual {p2, p4}, Lm4/u1;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    if-nez p4, :cond_0

    .line 46
    .line 47
    iput-object p2, p0, Lp5/i;->t1:Lm4/u1;

    .line 48
    .line 49
    invoke-virtual {v0, p2}, Lp5/y;->c(Lm4/u1;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object p2, p0, Lp5/i;->X0:Lp5/r;

    .line 53
    .line 54
    iget p4, p2, Lp5/r;->d:I

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    if-eq p4, v1, :cond_1

    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    :cond_1
    iput v1, p2, Lp5/r;->d:I

    .line 61
    .line 62
    iget-object p4, p2, Lp5/r;->k:Lp4/v;

    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    invoke-static {v1, v2}, Lp4/c0;->N(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    iput-wide v1, p2, Lp5/r;->f:J

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget-object p1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object p2, v0, Lp5/y;->b:Landroid/os/Handler;

    .line 84
    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    new-instance p4, Lp5/x;

    .line 92
    .line 93
    invoke-direct {p4, v0, p1, v1, v2}, Lp5/x;-><init>(Lp5/y;Ljava/lang/Object;J)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    iput-boolean p3, p0, Lp5/i;->i1:Z

    .line 100
    .line 101
    :cond_3
    return-void
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

.method public final D0(Ljava/lang/Object;)V
    .locals 9

    .line 1
    instance-of v0, p1, Landroid/view/Surface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroid/view/Surface;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    :goto_0
    iget-object v0, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 11
    .line 12
    iget-object v2, p0, Lp5/i;->U0:Lp5/y;

    .line 13
    .line 14
    if-eq v0, p1, :cond_b

    .line 15
    .line 16
    iput-object p1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 17
    .line 18
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 19
    .line 20
    iget-object v3, p0, Lp5/i;->X0:Lp5/r;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, v3, Lp5/r;->b:Lp5/u;

    .line 25
    .line 26
    iget-object v4, v0, Lp5/u;->e:Landroid/view/Surface;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-ne v4, p1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v0}, Lp5/u;->b()V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Lp5/u;->e:Landroid/view/Surface;

    .line 36
    .line 37
    invoke-virtual {v0, v5}, Lp5/u;->d(Z)V

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {v3, v5}, Lp5/r;->d(I)V

    .line 41
    .line 42
    .line 43
    :cond_2
    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lp5/i;->i1:Z

    .line 45
    .line 46
    iget v0, p0, Lv4/e;->h:I

    .line 47
    .line 48
    iget-object v4, p0, Lg5/q;->K:Lg5/k;

    .line 49
    .line 50
    if-eqz v4, :cond_6

    .line 51
    .line 52
    iget-object v5, p0, Lp5/i;->c1:Lp5/l;

    .line 53
    .line 54
    if-nez v5, :cond_6

    .line 55
    .line 56
    iget-object v5, p0, Lg5/q;->R:Lg5/n;

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v5}, Lp5/i;->z0(Lg5/n;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    sget v7, Lp4/c0;->a:I

    .line 66
    .line 67
    const/16 v8, 0x17

    .line 68
    .line 69
    if-lt v7, v8, :cond_5

    .line 70
    .line 71
    if-eqz v6, :cond_5

    .line 72
    .line 73
    iget-boolean v6, p0, Lp5/i;->a1:Z

    .line 74
    .line 75
    if-nez v6, :cond_5

    .line 76
    .line 77
    invoke-virtual {p0, v5}, Lp5/i;->y0(Lg5/n;)Landroid/view/Surface;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-lt v7, v8, :cond_3

    .line 82
    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    invoke-interface {v4, v5}, Lg5/k;->y0(Landroid/view/Surface;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    const/16 v5, 0x23

    .line 90
    .line 91
    if-lt v7, v5, :cond_4

    .line 92
    .line 93
    invoke-interface {v4}, Lg5/k;->B()V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_5
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lg5/q;->S()V

    .line 107
    .line 108
    .line 109
    :cond_6
    :goto_2
    if-eqz p1, :cond_9

    .line 110
    .line 111
    iget-object p1, p0, Lp5/i;->t1:Lm4/u1;

    .line 112
    .line 113
    if-eqz p1, :cond_7

    .line 114
    .line 115
    invoke-virtual {v2, p1}, Lp5/y;->c(Lm4/u1;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    const/4 p1, 0x2

    .line 119
    if-ne v0, p1, :cond_a

    .line 120
    .line 121
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 122
    .line 123
    const/4 v0, 0x1

    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lp5/l;->c(Z)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    invoke-virtual {v3, v0}, Lp5/r;->c(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_9
    iput-object v1, p0, Lp5/i;->t1:Lm4/u1;

    .line 135
    .line 136
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 137
    .line 138
    if-eqz p1, :cond_a

    .line 139
    .line 140
    iget-object p1, p1, Lp5/l;->f:Lp5/p;

    .line 141
    .line 142
    sget-object v0, Lp4/u;->c:Lp4/u;

    .line 143
    .line 144
    iget v0, v0, Lp4/u;->a:I

    .line 145
    .line 146
    iput-object v1, p1, Lp5/p;->j:Landroid/util/Pair;

    .line 147
    .line 148
    :cond_a
    :goto_3
    invoke-virtual {p0}, Lp5/i;->B0()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_b
    if-eqz p1, :cond_d

    .line 153
    .line 154
    iget-object p1, p0, Lp5/i;->t1:Lm4/u1;

    .line 155
    .line 156
    if-eqz p1, :cond_c

    .line 157
    .line 158
    invoke-virtual {v2, p1}, Lp5/y;->c(Lm4/u1;)V

    .line 159
    .line 160
    .line 161
    :cond_c
    iget-object p1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 162
    .line 163
    if-eqz p1, :cond_d

    .line 164
    .line 165
    iget-boolean v0, p0, Lp5/i;->i1:Z

    .line 166
    .line 167
    if-eqz v0, :cond_d

    .line 168
    .line 169
    iget-object v0, v2, Lp5/y;->b:Landroid/os/Handler;

    .line 170
    .line 171
    if-eqz v0, :cond_d

    .line 172
    .line 173
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 174
    .line 175
    .line 176
    move-result-wide v3

    .line 177
    new-instance v1, Lp5/x;

    .line 178
    .line 179
    invoke-direct {v1, v2, p1, v3, v4}, Lp5/x;-><init>(Lp5/y;Ljava/lang/Object;J)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 183
    .line 184
    .line 185
    :cond_d
    return-void
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

.method public final E0(Lg5/n;)Z
    .locals 2

    .line 1
    sget v0, Lp4/c0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lp5/i;->v1:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p1, Lg5/n;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Lp5/i;->u0(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-boolean p1, p1, Lg5/n;->f:Z

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lp5/i;->S0:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {p1}, Lp5/k;->a(Landroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    :cond_0
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    return p1
    .line 35
    .line 36
.end method

.method public final F0(Lg5/k;I)V
    .locals 1

    .line 1
    const-string v0, "skipVideoBuffer"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2}, Lg5/k;->i(I)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 13
    .line 14
    iget p2, p1, Lv4/f;->f:I

    .line 15
    .line 16
    add-int/lit8 p2, p2, 0x1

    .line 17
    .line 18
    iput p2, p1, Lv4/f;->f:I

    .line 19
    .line 20
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

.method public final G0(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/q;->N0:Lv4/f;

    .line 2
    .line 3
    iget v1, v0, Lv4/f;->h:I

    .line 4
    .line 5
    add-int/2addr v1, p1

    .line 6
    iput v1, v0, Lv4/f;->h:I

    .line 7
    .line 8
    add-int/2addr p1, p2

    .line 9
    iget p2, v0, Lv4/f;->g:I

    .line 10
    .line 11
    add-int/2addr p2, p1

    .line 12
    iput p2, v0, Lv4/f;->g:I

    .line 13
    .line 14
    iget p2, p0, Lp5/i;->m1:I

    .line 15
    .line 16
    add-int/2addr p2, p1

    .line 17
    iput p2, p0, Lp5/i;->m1:I

    .line 18
    .line 19
    iget p2, p0, Lp5/i;->n1:I

    .line 20
    .line 21
    add-int/2addr p2, p1

    .line 22
    iput p2, p0, Lp5/i;->n1:I

    .line 23
    .line 24
    iget p1, v0, Lv4/f;->i:I

    .line 25
    .line 26
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, v0, Lv4/f;->i:I

    .line 31
    .line 32
    iget p1, p0, Lp5/i;->V0:I

    .line 33
    .line 34
    if-lez p1, :cond_0

    .line 35
    .line 36
    iget p2, p0, Lp5/i;->m1:I

    .line 37
    .line 38
    if-lt p2, p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Lp5/i;->A0()V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
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

.method public final H0(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg5/q;->N0:Lv4/f;

    .line 2
    .line 3
    iget-wide v1, v0, Lv4/f;->k:J

    .line 4
    .line 5
    add-long/2addr v1, p1

    .line 6
    iput-wide v1, v0, Lv4/f;->k:J

    .line 7
    .line 8
    iget v1, v0, Lv4/f;->l:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    iput v1, v0, Lv4/f;->l:I

    .line 13
    .line 14
    iget-wide v0, p0, Lp5/i;->p1:J

    .line 15
    .line 16
    add-long/2addr v0, p1

    .line 17
    iput-wide v0, p0, Lp5/i;->p1:J

    .line 18
    .line 19
    iget p1, p0, Lp5/i;->q1:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    iput p1, p0, Lp5/i;->q1:I

    .line 24
    .line 25
    return-void
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

.method public final K(Lu4/f;)I
    .locals 4

    .line 1
    sget v0, Lp4/c0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lp5/i;->v1:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p1, Lu4/f;->g:J

    .line 12
    .line 13
    iget-wide v2, p0, Lv4/e;->l:J

    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-gez p1, :cond_0

    .line 18
    .line 19
    const/16 p1, 0x20

    .line 20
    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
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

.method public final L()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lp5/i;->v1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Lp4/c0;->a:I

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
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

.method public final M(F[Lm4/q;)F
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/high16 v1, -0x40800000    # -1.0f

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/high16 v3, -0x40800000    # -1.0f

    .line 6
    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    aget-object v4, p2, v2

    .line 10
    .line 11
    iget v4, v4, Lm4/q;->w:F

    .line 12
    .line 13
    cmpl-float v5, v4, v1

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    cmpl-float p2, v3, v1

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    mul-float v3, v3, p1

    .line 30
    .line 31
    return v3
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

.method public final N(Lg5/r;Lm4/q;Z)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/i;->S0:Landroid/content/Context;

    .line 2
    .line 3
    iget-boolean v1, p0, Lp5/i;->v1:Z

    .line 4
    .line 5
    invoke-static {v0, p1, p2, p3, v1}, Lp5/i;->w0(Landroid/content/Context;Lg5/r;Lm4/q;ZZ)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p3, Lg5/y;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance p3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Landroidx/media3/exoplayer/offline/g;

    .line 17
    .line 18
    const/16 v0, 0xc

    .line 19
    .line 20
    invoke-direct {p1, v0, p2}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Lg5/s;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p2, v0, p1}, Lg5/s;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 30
    .line 31
    .line 32
    return-object p3
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

.method public final O(Lg5/n;Lm4/q;Landroid/media/MediaCrypto;F)Lb7/b1;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    iget-object v3, v2, Lg5/n;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, v0, Lv4/e;->j:[Lm4/q;

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v6, v4, Lm4/q;->u:I

    .line 15
    .line 16
    iget v7, v4, Lm4/q;->w:F

    .line 17
    .line 18
    iget-object v8, v4, Lm4/q;->B:Lm4/h;

    .line 19
    .line 20
    iget v9, v4, Lm4/q;->v:I

    .line 21
    .line 22
    invoke-static/range {p1 .. p2}, Lp5/i;->x0(Lg5/n;Lm4/q;)I

    .line 23
    .line 24
    .line 25
    move-result v10

    .line 26
    array-length v11, v5

    .line 27
    const/4 v13, -0x1

    .line 28
    const/4 v14, 0x1

    .line 29
    if-ne v11, v14, :cond_1

    .line 30
    .line 31
    if-eq v10, v13, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p2}, Lp5/i;->v0(Lg5/n;Lm4/q;)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eq v5, v13, :cond_0

    .line 38
    .line 39
    int-to-float v10, v10

    .line 40
    const/high16 v11, 0x3fc00000    # 1.5f

    .line 41
    .line 42
    mul-float v10, v10, v11

    .line 43
    .line 44
    float-to-int v10, v10

    .line 45
    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    :cond_0
    new-instance v5, Li7/j1;

    .line 50
    .line 51
    invoke-direct {v5, v6, v9, v10}, Li7/j1;-><init>(III)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v19, v8

    .line 55
    .line 56
    move v15, v9

    .line 57
    goto/16 :goto_11

    .line 58
    .line 59
    :cond_1
    array-length v11, v5

    .line 60
    move v14, v6

    .line 61
    move v12, v9

    .line 62
    const/4 v15, 0x0

    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    :goto_0
    if-ge v15, v11, :cond_6

    .line 66
    .line 67
    aget-object v13, v5, v15

    .line 68
    .line 69
    move-object/from16 v18, v5

    .line 70
    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    iget-object v5, v13, Lm4/q;->B:Lm4/h;

    .line 74
    .line 75
    if-nez v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {v13}, Lm4/q;->a()Lm4/p;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iput-object v8, v5, Lm4/p;->A:Lm4/h;

    .line 82
    .line 83
    new-instance v13, Lm4/q;

    .line 84
    .line 85
    invoke-direct {v13, v5}, Lm4/q;-><init>(Lm4/p;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v2, v4, v13}, Lg5/n;->b(Lm4/q;Lm4/q;)Lv4/g;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    move/from16 v19, v11

    .line 93
    .line 94
    iget v11, v13, Lm4/q;->v:I

    .line 95
    .line 96
    iget v5, v5, Lv4/g;->d:I

    .line 97
    .line 98
    if-eqz v5, :cond_5

    .line 99
    .line 100
    iget v5, v13, Lm4/q;->u:I

    .line 101
    .line 102
    move/from16 v20, v15

    .line 103
    .line 104
    const/4 v15, -0x1

    .line 105
    if-eq v5, v15, :cond_4

    .line 106
    .line 107
    if-ne v11, v15, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    const/16 v17, 0x0

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    :goto_1
    const/16 v17, 0x1

    .line 114
    .line 115
    :goto_2
    or-int v16, v16, v17

    .line 116
    .line 117
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 118
    .line 119
    .line 120
    move-result v14

    .line 121
    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    .line 122
    .line 123
    .line 124
    move-result v12

    .line 125
    invoke-static {v2, v13}, Lp5/i;->x0(Lg5/n;Lm4/q;)I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    invoke-static {v10, v5}, Ljava/lang/Math;->max(II)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    move v10, v5

    .line 134
    goto :goto_3

    .line 135
    :cond_5
    move/from16 v20, v15

    .line 136
    .line 137
    const/4 v15, -0x1

    .line 138
    :goto_3
    add-int/lit8 v5, v20, 0x1

    .line 139
    .line 140
    move v15, v5

    .line 141
    move-object/from16 v5, v18

    .line 142
    .line 143
    move/from16 v11, v19

    .line 144
    .line 145
    const/4 v13, -0x1

    .line 146
    goto :goto_0

    .line 147
    :cond_6
    if-eqz v16, :cond_12

    .line 148
    .line 149
    new-instance v5, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v11, "Resolutions unknown. Codec max resolution: "

    .line 152
    .line 153
    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v11, "x"

    .line 160
    .line 161
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    const-string v13, "MediaCodecVideoRenderer"

    .line 172
    .line 173
    invoke-static {v13, v5}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    if-le v9, v6, :cond_7

    .line 177
    .line 178
    const/4 v5, 0x1

    .line 179
    goto :goto_4

    .line 180
    :cond_7
    const/4 v5, 0x0

    .line 181
    :goto_4
    if-eqz v5, :cond_8

    .line 182
    .line 183
    move v15, v9

    .line 184
    goto :goto_5

    .line 185
    :cond_8
    move v15, v6

    .line 186
    :goto_5
    move/from16 v16, v5

    .line 187
    .line 188
    if-eqz v5, :cond_9

    .line 189
    .line 190
    move v5, v6

    .line 191
    goto :goto_6

    .line 192
    :cond_9
    move v5, v9

    .line 193
    :goto_6
    int-to-float v1, v5

    .line 194
    move/from16 v17, v1

    .line 195
    .line 196
    int-to-float v1, v15

    .line 197
    div-float v1, v17, v1

    .line 198
    .line 199
    move/from16 v17, v1

    .line 200
    .line 201
    const/4 v1, 0x0

    .line 202
    :goto_7
    const/16 v18, 0x0

    .line 203
    .line 204
    move-object/from16 v19, v8

    .line 205
    .line 206
    const/16 v8, 0x9

    .line 207
    .line 208
    if-ge v1, v8, :cond_11

    .line 209
    .line 210
    sget-object v8, Lp5/i;->C1:[I

    .line 211
    .line 212
    aget v8, v8, v1

    .line 213
    .line 214
    move/from16 v20, v1

    .line 215
    .line 216
    int-to-float v1, v8

    .line 217
    mul-float v1, v1, v17

    .line 218
    .line 219
    float-to-int v1, v1

    .line 220
    if-le v8, v15, :cond_11

    .line 221
    .line 222
    if-gt v1, v5, :cond_a

    .line 223
    .line 224
    goto/16 :goto_e

    .line 225
    .line 226
    :cond_a
    move/from16 v21, v1

    .line 227
    .line 228
    if-eqz v16, :cond_b

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_b
    move v1, v8

    .line 232
    :goto_8
    if-eqz v16, :cond_c

    .line 233
    .line 234
    :goto_9
    move/from16 v21, v5

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_c
    move/from16 v8, v21

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :goto_a
    iget-object v5, v2, Lg5/n;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 241
    .line 242
    if-nez v5, :cond_d

    .line 243
    .line 244
    :goto_b
    move/from16 v23, v15

    .line 245
    .line 246
    move-object/from16 v4, v18

    .line 247
    .line 248
    goto :goto_c

    .line 249
    :cond_d
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    if-nez v5, :cond_e

    .line 254
    .line 255
    goto :goto_b

    .line 256
    :cond_e
    move-object/from16 v22, v5

    .line 257
    .line 258
    invoke-virtual/range {v22 .. v22}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    move/from16 v23, v15

    .line 263
    .line 264
    invoke-virtual/range {v22 .. v22}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    new-instance v4, Landroid/graphics/Point;

    .line 269
    .line 270
    invoke-static {v1, v5}, Lp4/c0;->f(II)I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    mul-int v1, v1, v5

    .line 275
    .line 276
    invoke-static {v8, v15}, Lp4/c0;->f(II)I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    mul-int v5, v5, v15

    .line 281
    .line 282
    invoke-direct {v4, v1, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 283
    .line 284
    .line 285
    :goto_c
    if-eqz v4, :cond_f

    .line 286
    .line 287
    iget v1, v4, Landroid/graphics/Point;->x:I

    .line 288
    .line 289
    iget v5, v4, Landroid/graphics/Point;->y:I

    .line 290
    .line 291
    move v15, v9

    .line 292
    float-to-double v8, v7

    .line 293
    invoke-virtual {v2, v1, v5, v8, v9}, Lg5/n;->f(IID)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_10

    .line 298
    .line 299
    goto :goto_f

    .line 300
    :cond_f
    move v15, v9

    .line 301
    :cond_10
    add-int/lit8 v1, v20, 0x1

    .line 302
    .line 303
    move-object/from16 v4, p2

    .line 304
    .line 305
    move v9, v15

    .line 306
    move-object/from16 v8, v19

    .line 307
    .line 308
    move/from16 v5, v21

    .line 309
    .line 310
    move/from16 v15, v23

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :goto_d
    move-object/from16 v4, v18

    .line 314
    .line 315
    goto :goto_f

    .line 316
    :cond_11
    :goto_e
    move v15, v9

    .line 317
    goto :goto_d

    .line 318
    :goto_f
    if-eqz v4, :cond_13

    .line 319
    .line 320
    iget v1, v4, Landroid/graphics/Point;->x:I

    .line 321
    .line 322
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    iget v1, v4, Landroid/graphics/Point;->y:I

    .line 327
    .line 328
    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    invoke-virtual/range {p2 .. p2}, Lm4/q;->a()Lm4/p;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    iput v14, v1, Lm4/p;->t:I

    .line 337
    .line 338
    iput v12, v1, Lm4/p;->u:I

    .line 339
    .line 340
    new-instance v4, Lm4/q;

    .line 341
    .line 342
    invoke-direct {v4, v1}, Lm4/q;-><init>(Lm4/p;)V

    .line 343
    .line 344
    .line 345
    invoke-static {v2, v4}, Lp5/i;->v0(Lg5/n;Lm4/q;)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    new-instance v1, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v4, "Codec max resolution adjusted to: "

    .line 356
    .line 357
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-static {v13, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    goto :goto_10

    .line 377
    :cond_12
    move-object/from16 v19, v8

    .line 378
    .line 379
    move v15, v9

    .line 380
    :cond_13
    :goto_10
    new-instance v5, Li7/j1;

    .line 381
    .line 382
    invoke-direct {v5, v14, v12, v10}, Li7/j1;-><init>(III)V

    .line 383
    .line 384
    .line 385
    :goto_11
    iput-object v5, v0, Lp5/i;->Z0:Li7/j1;

    .line 386
    .line 387
    iget-boolean v1, v0, Lp5/i;->v1:Z

    .line 388
    .line 389
    if-eqz v1, :cond_14

    .line 390
    .line 391
    iget v1, v0, Lp5/i;->w1:I

    .line 392
    .line 393
    goto :goto_12

    .line 394
    :cond_14
    const/4 v1, 0x0

    .line 395
    :goto_12
    new-instance v4, Landroid/media/MediaFormat;

    .line 396
    .line 397
    invoke-direct {v4}, Landroid/media/MediaFormat;-><init>()V

    .line 398
    .line 399
    .line 400
    const-string v8, "mime"

    .line 401
    .line 402
    invoke-virtual {v4, v8, v3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    const-string v3, "width"

    .line 406
    .line 407
    invoke-virtual {v4, v3, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 408
    .line 409
    .line 410
    const-string v3, "height"

    .line 411
    .line 412
    invoke-virtual {v4, v3, v15}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 413
    .line 414
    .line 415
    move-object/from16 v3, p2

    .line 416
    .line 417
    iget-object v6, v3, Lm4/q;->q:Ljava/util/List;

    .line 418
    .line 419
    invoke-static {v4, v6}, Lp4/c;->z(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 420
    .line 421
    .line 422
    const/high16 v6, -0x40800000    # -1.0f

    .line 423
    .line 424
    cmpl-float v8, v7, v6

    .line 425
    .line 426
    if-eqz v8, :cond_15

    .line 427
    .line 428
    const-string v8, "frame-rate"

    .line 429
    .line 430
    invoke-virtual {v4, v8, v7}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 431
    .line 432
    .line 433
    :cond_15
    const-string v7, "rotation-degrees"

    .line 434
    .line 435
    iget v8, v3, Lm4/q;->x:I

    .line 436
    .line 437
    invoke-static {v4, v7, v8}, Lp4/c;->v(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 438
    .line 439
    .line 440
    if-eqz v19, :cond_16

    .line 441
    .line 442
    const-string v7, "color-transfer"

    .line 443
    .line 444
    move-object/from16 v8, v19

    .line 445
    .line 446
    iget v9, v8, Lm4/h;->c:I

    .line 447
    .line 448
    invoke-static {v4, v7, v9}, Lp4/c;->v(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 449
    .line 450
    .line 451
    const-string v7, "color-standard"

    .line 452
    .line 453
    iget v9, v8, Lm4/h;->a:I

    .line 454
    .line 455
    invoke-static {v4, v7, v9}, Lp4/c;->v(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 456
    .line 457
    .line 458
    const-string v7, "color-range"

    .line 459
    .line 460
    iget v9, v8, Lm4/h;->b:I

    .line 461
    .line 462
    invoke-static {v4, v7, v9}, Lp4/c;->v(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 463
    .line 464
    .line 465
    iget-object v7, v8, Lm4/h;->d:[B

    .line 466
    .line 467
    if-eqz v7, :cond_16

    .line 468
    .line 469
    invoke-static {v7}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    const-string v8, "hdr-static-info"

    .line 474
    .line 475
    invoke-virtual {v4, v8, v7}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 476
    .line 477
    .line 478
    :cond_16
    const-string v7, "video/dolby-vision"

    .line 479
    .line 480
    iget-object v8, v3, Lm4/q;->n:Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v7

    .line 486
    if-eqz v7, :cond_17

    .line 487
    .line 488
    invoke-static {v3}, Lg5/y;->d(Lm4/q;)Landroid/util/Pair;

    .line 489
    .line 490
    .line 491
    move-result-object v7

    .line 492
    if-eqz v7, :cond_17

    .line 493
    .line 494
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v7, Ljava/lang/Integer;

    .line 497
    .line 498
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 499
    .line 500
    .line 501
    move-result v7

    .line 502
    const-string v8, "profile"

    .line 503
    .line 504
    invoke-static {v4, v8, v7}, Lp4/c;->v(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 505
    .line 506
    .line 507
    :cond_17
    const-string v7, "max-width"

    .line 508
    .line 509
    iget v8, v5, Li7/j1;->a:I

    .line 510
    .line 511
    invoke-virtual {v4, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 512
    .line 513
    .line 514
    const-string v7, "max-height"

    .line 515
    .line 516
    iget v8, v5, Li7/j1;->b:I

    .line 517
    .line 518
    invoke-virtual {v4, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 519
    .line 520
    .line 521
    const-string v7, "max-input-size"

    .line 522
    .line 523
    iget v5, v5, Li7/j1;->c:I

    .line 524
    .line 525
    invoke-static {v4, v7, v5}, Lp4/c;->v(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 526
    .line 527
    .line 528
    sget v5, Lp4/c0;->a:I

    .line 529
    .line 530
    const/16 v7, 0x17

    .line 531
    .line 532
    if-lt v5, v7, :cond_18

    .line 533
    .line 534
    const-string v7, "priority"

    .line 535
    .line 536
    const/4 v8, 0x0

    .line 537
    invoke-virtual {v4, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 538
    .line 539
    .line 540
    cmpl-float v6, p4, v6

    .line 541
    .line 542
    if-eqz v6, :cond_18

    .line 543
    .line 544
    const-string v6, "operating-rate"

    .line 545
    .line 546
    move/from16 v7, p4

    .line 547
    .line 548
    invoke-virtual {v4, v6, v7}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 549
    .line 550
    .line 551
    :cond_18
    iget-boolean v6, v0, Lp5/i;->W0:Z

    .line 552
    .line 553
    if-eqz v6, :cond_19

    .line 554
    .line 555
    const-string v6, "no-post-process"

    .line 556
    .line 557
    const/4 v7, 0x1

    .line 558
    invoke-virtual {v4, v6, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 559
    .line 560
    .line 561
    const-string v6, "auto-frc"

    .line 562
    .line 563
    const/4 v8, 0x0

    .line 564
    invoke-virtual {v4, v6, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 565
    .line 566
    .line 567
    goto :goto_13

    .line 568
    :cond_19
    const/4 v7, 0x1

    .line 569
    :goto_13
    if-eqz v1, :cond_1a

    .line 570
    .line 571
    const-string v6, "tunneled-playback"

    .line 572
    .line 573
    invoke-virtual {v4, v6, v7}, Landroid/media/MediaFormat;->setFeatureEnabled(Ljava/lang/String;Z)V

    .line 574
    .line 575
    .line 576
    const-string v6, "audio-session-id"

    .line 577
    .line 578
    invoke-virtual {v4, v6, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 579
    .line 580
    .line 581
    :cond_1a
    const/16 v1, 0x23

    .line 582
    .line 583
    if-lt v5, v1, :cond_1b

    .line 584
    .line 585
    iget v1, v0, Lp5/i;->u1:I

    .line 586
    .line 587
    neg-int v1, v1

    .line 588
    const/4 v8, 0x0

    .line 589
    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    const-string v5, "importance"

    .line 594
    .line 595
    invoke-virtual {v4, v5, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 596
    .line 597
    .line 598
    :cond_1b
    invoke-virtual/range {p0 .. p1}, Lp5/i;->y0(Lg5/n;)Landroid/view/Surface;

    .line 599
    .line 600
    .line 601
    move-result-object v5

    .line 602
    iget-object v1, v0, Lp5/i;->c1:Lp5/l;

    .line 603
    .line 604
    if-eqz v1, :cond_1c

    .line 605
    .line 606
    iget-object v1, v0, Lp5/i;->S0:Landroid/content/Context;

    .line 607
    .line 608
    invoke-static {v1}, Lp4/c0;->J(Landroid/content/Context;)Z

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    if-nez v1, :cond_1c

    .line 613
    .line 614
    const-string v1, "allow-frame-drop"

    .line 615
    .line 616
    const/4 v8, 0x0

    .line 617
    invoke-virtual {v4, v1, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    :cond_1c
    new-instance v1, Lb7/b1;

    .line 621
    .line 622
    const/4 v7, 0x0

    .line 623
    move-object v6, v4

    .line 624
    move-object v4, v3

    .line 625
    move-object v3, v6

    .line 626
    move-object/from16 v6, p3

    .line 627
    .line 628
    invoke-direct/range {v1 .. v7}, Lb7/b1;-><init>(Lg5/n;Landroid/media/MediaFormat;Lm4/q;Landroid/view/Surface;Landroid/media/MediaCrypto;Lc7/e1;)V

    .line 629
    .line 630
    .line 631
    return-object v1
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
.end method

.method public final P(Lu4/f;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lp5/i;->b1:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p1, Lu4/f;->h:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x7

    .line 16
    if-lt v0, v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 40
    .line 41
    .line 42
    const/16 v6, -0x4b

    .line 43
    .line 44
    if-ne v0, v6, :cond_2

    .line 45
    .line 46
    const/16 v0, 0x3c

    .line 47
    .line 48
    if-ne v1, v0, :cond_2

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    if-ne v2, v0, :cond_2

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    if-ne v3, v1, :cond_2

    .line 55
    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    if-ne v4, v0, :cond_2

    .line 59
    .line 60
    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    new-array v0, v0, [B

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lg5/q;->K:Lg5/k;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v1, Landroid/os/Bundle;

    .line 78
    .line 79
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "hdr10-plus-info"

    .line 83
    .line 84
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v1}, Lg5/k;->c(Landroid/os/Bundle;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    :goto_0
    return-void
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

.method public final U(Lm4/q;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Lp5/l;->b(Lm4/q;)Z

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    throw v0
    :try_end_0
    .catch Lp5/a0; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    const/16 v1, 0x1b58

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v0, p1, v2, v1}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    throw p1
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

.method public final V(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecVideoRenderer"

    .line 2
    .line 3
    const-string v1, "Video codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lp5/i;->U0:Lp5/y;

    .line 9
    .line 10
    iget-object v1, v0, Lp5/y;->b:Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v2, Lp5/w;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, v0, p1, v3}, Lp5/w;-><init>(Lp5/y;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
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

.method public final W(JJLjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lp5/i;->U0:Lp5/y;

    .line 2
    .line 3
    iget-object v7, v1, Lp5/y;->b:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v7, :cond_0

    .line 6
    .line 7
    new-instance v0, Lp5/w;

    .line 8
    .line 9
    move-wide v3, p1

    .line 10
    move-wide v5, p3

    .line 11
    move-object v2, p5

    .line 12
    invoke-direct/range {v0 .. v6}, Lp5/w;-><init>(Lp5/y;Ljava/lang/String;JJ)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, p5

    .line 20
    :goto_0
    invoke-static {v2}, Lp5/i;->u0(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput-boolean p1, p0, Lp5/i;->a1:Z

    .line 25
    .line 26
    iget-object p1, p0, Lg5/q;->R:Lg5/n;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget p2, Lp4/c0;->a:I

    .line 32
    .line 33
    const/16 p3, 0x1d

    .line 34
    .line 35
    const/4 p4, 0x0

    .line 36
    if-lt p2, p3, :cond_4

    .line 37
    .line 38
    const-string p2, "video/x-vnd.on2.vp9"

    .line 39
    .line 40
    iget-object p3, p1, Lg5/n;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_4

    .line 47
    .line 48
    iget-object p1, p1, Lg5/n;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    iget-object p1, p1, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    :cond_1
    new-array p1, p4, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 57
    .line 58
    :cond_2
    array-length p2, p1

    .line 59
    const/4 p3, 0x0

    .line 60
    :goto_1
    if-ge p3, p2, :cond_4

    .line 61
    .line 62
    aget-object p5, p1, p3

    .line 63
    .line 64
    iget p5, p5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 65
    .line 66
    const/16 v0, 0x4000

    .line 67
    .line 68
    if-ne p5, v0, :cond_3

    .line 69
    .line 70
    const/4 p4, 0x1

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    :goto_2
    iput-boolean p4, p0, Lp5/i;->b1:Z

    .line 76
    .line 77
    invoke-virtual {p0}, Lp5/i;->B0()V

    .line 78
    .line 79
    .line 80
    return-void
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

.method public final X(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp5/i;->U0:Lp5/y;

    .line 2
    .line 3
    iget-object v1, v0, Lp5/y;->b:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Lp5/w;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-direct {v2, v0, p1, v3}, Lp5/w;-><init>(Lp5/y;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

.method public final Y(Lv2/e;)Lv4/g;
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lg5/q;->Y(Lv2/e;)Lv4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p1, p1, Lv2/e;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lm4/q;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lp5/i;->U0:Lp5/y;

    .line 13
    .line 14
    iget-object v2, v1, Lp5/y;->b:Landroid/os/Handler;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    new-instance v3, Lp5/w;

    .line 19
    .line 20
    invoke-direct {v3, v1, p1, v0}, Lp5/w;-><init>(Lp5/y;Lm4/q;Lv4/g;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object v0
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

.method public final Z(Lm4/q;Landroid/media/MediaFormat;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lg5/q;->K:Lg5/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lp5/i;->j1:I

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lg5/k;->o0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lp5/i;->v1:Z

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget p2, p1, Lm4/q;->u:I

    .line 16
    .line 17
    iget v0, p1, Lm4/q;->v:I

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v0, "crop-right"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "crop-top"

    .line 30
    .line 31
    const-string v4, "crop-bottom"

    .line 32
    .line 33
    const-string v5, "crop-left"

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v2, 0x0

    .line 59
    :goto_0
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    sub-int/2addr v0, v5

    .line 70
    add-int/2addr v0, v6

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const-string v0, "width"

    .line 73
    .line 74
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    :goto_1
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    sub-int/2addr v2, p2

    .line 89
    add-int/2addr v2, v6

    .line 90
    move p2, v2

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const-string v2, "height"

    .line 93
    .line 94
    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    :goto_2
    move v7, v0

    .line 99
    move v0, p2

    .line 100
    move p2, v7

    .line 101
    :goto_3
    iget v2, p1, Lm4/q;->y:F

    .line 102
    .line 103
    iget v3, p1, Lm4/q;->x:I

    .line 104
    .line 105
    const/16 v4, 0x5a

    .line 106
    .line 107
    if-eq v3, v4, :cond_5

    .line 108
    .line 109
    const/16 v4, 0x10e

    .line 110
    .line 111
    if-ne v3, v4, :cond_6

    .line 112
    .line 113
    :cond_5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 114
    .line 115
    div-float v2, v3, v2

    .line 116
    .line 117
    move v7, v0

    .line 118
    move v0, p2

    .line 119
    move p2, v7

    .line 120
    :cond_6
    new-instance v3, Lm4/u1;

    .line 121
    .line 122
    invoke-direct {v3, v2, p2, v0}, Lm4/u1;-><init>(FII)V

    .line 123
    .line 124
    .line 125
    iput-object v3, p0, Lp5/i;->s1:Lm4/u1;

    .line 126
    .line 127
    iget-object v3, p0, Lp5/i;->c1:Lp5/l;

    .line 128
    .line 129
    if-eqz v3, :cond_a

    .line 130
    .line 131
    iget-boolean v4, p0, Lp5/i;->B1:Z

    .line 132
    .line 133
    if-eqz v4, :cond_a

    .line 134
    .line 135
    invoke-virtual {p1}, Lm4/q;->a()Lm4/p;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput p2, p1, Lm4/p;->t:I

    .line 140
    .line 141
    iput v0, p1, Lm4/p;->u:I

    .line 142
    .line 143
    iput v2, p1, Lm4/p;->x:F

    .line 144
    .line 145
    new-instance p2, Lm4/q;

    .line 146
    .line 147
    invoke-direct {p2, p1}, Lm4/q;-><init>(Lm4/p;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lp5/i;->e1:Ljava/util/List;

    .line 151
    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    sget-object p1, Lya/i0;->b:Lya/g0;

    .line 156
    .line 157
    sget-object p1, Lya/a1;->e:Lya/a1;

    .line 158
    .line 159
    :goto_4
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v3, Lp5/l;->f:Lp5/p;

    .line 163
    .line 164
    iget-object v1, v0, Lp5/p;->c:Lp5/o;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v1, Lya/f0;

    .line 170
    .line 171
    const/4 v2, 0x4

    .line 172
    invoke-direct {v1, v2}, Lya/c0;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, p1}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, v0, Lp5/p;->e:Lya/a1;

    .line 179
    .line 180
    invoke-virtual {v1, p1}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Lya/f0;->f()Lya/a1;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iput-object p1, v3, Lp5/l;->a:Lya/a1;

    .line 188
    .line 189
    iput-object p2, v3, Lp5/l;->b:Lm4/q;

    .line 190
    .line 191
    invoke-virtual {p2}, Lm4/q;->a()Lm4/p;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iget-object p2, p2, Lm4/q;->B:Lm4/h;

    .line 196
    .line 197
    if-eqz p2, :cond_8

    .line 198
    .line 199
    invoke-virtual {p2}, Lm4/h;->d()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-nez v0, :cond_9

    .line 204
    .line 205
    :cond_8
    sget-object p2, Lm4/h;->h:Lm4/h;

    .line 206
    .line 207
    :cond_9
    iput-object p2, p1, Lm4/p;->A:Lm4/h;

    .line 208
    .line 209
    invoke-virtual {p1}, Lm4/p;->a()Lm4/q;

    .line 210
    .line 211
    .line 212
    const/4 p1, 0x0

    .line 213
    invoke-static {p1}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :cond_a
    iget p1, p1, Lm4/q;->w:F

    .line 218
    .line 219
    iget-object p2, p0, Lp5/i;->X0:Lp5/r;

    .line 220
    .line 221
    iget-object p2, p2, Lp5/r;->b:Lp5/u;

    .line 222
    .line 223
    iput p1, p2, Lp5/u;->f:F

    .line 224
    .line 225
    iget-object p1, p2, Lp5/u;->a:Lp5/e;

    .line 226
    .line 227
    iget-object v0, p1, Lp5/e;->a:Lp5/d;

    .line 228
    .line 229
    invoke-virtual {v0}, Lp5/d;->c()V

    .line 230
    .line 231
    .line 232
    iget-object v0, p1, Lp5/e;->b:Lp5/d;

    .line 233
    .line 234
    invoke-virtual {v0}, Lp5/d;->c()V

    .line 235
    .line 236
    .line 237
    iput-boolean v1, p1, Lp5/e;->c:Z

    .line 238
    .line 239
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    iput-wide v2, p1, Lp5/e;->d:J

    .line 245
    .line 246
    iput v1, p1, Lp5/e;->e:I

    .line 247
    .line 248
    invoke-virtual {p2}, Lp5/u;->c()V

    .line 249
    .line 250
    .line 251
    iput-boolean v1, p0, Lp5/i;->B1:Z

    .line 252
    .line 253
    return-void
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

.method public final b0(J)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lg5/q;->b0(J)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lp5/i;->v1:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iget p1, p0, Lp5/i;->o1:I

    .line 9
    .line 10
    add-int/lit8 p1, p1, -0x1

    .line 11
    .line 12
    iput p1, p0, Lp5/i;->o1:I

    .line 13
    .line 14
    :cond_0
    return-void
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

.method public final c0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lp5/l;->j()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp5/i;->c1:Lp5/l;

    .line 9
    .line 10
    iget-object v0, p0, Lg5/q;->O0:Lg5/p;

    .line 11
    .line 12
    iget-wide v2, v0, Lg5/p;->b:J

    .line 13
    .line 14
    iget-wide v4, p0, Lp5/i;->z1:J

    .line 15
    .line 16
    neg-long v4, v4

    .line 17
    iget-wide v6, p0, Lv4/e;->l:J

    .line 18
    .line 19
    invoke-virtual/range {v1 .. v7}, Lp5/l;->g(JJJ)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lp5/i;->X0:Lp5/r;

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    invoke-virtual {v0, v1}, Lp5/r;->d(I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lp5/i;->B1:Z

    .line 31
    .line 32
    invoke-virtual {p0}, Lp5/i;->B0()V

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

.method public final d(ILjava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_c

    .line 3
    .line 4
    const/4 v1, 0x7

    .line 5
    if-eq p1, v1, :cond_a

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-eq p1, v1, :cond_9

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq p1, v1, :cond_8

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    if-eq p1, v1, :cond_5

    .line 16
    .line 17
    const/16 v1, 0xd

    .line 18
    .line 19
    if-eq p1, v1, :cond_4

    .line 20
    .line 21
    const/16 v1, 0xe

    .line 22
    .line 23
    if-eq p1, v1, :cond_3

    .line 24
    .line 25
    const/16 v1, 0x10

    .line 26
    .line 27
    if-eq p1, v1, :cond_1

    .line 28
    .line 29
    const/16 v1, 0x11

    .line 30
    .line 31
    if-eq p1, v1, :cond_0

    .line 32
    .line 33
    const/16 v0, 0xb

    .line 34
    .line 35
    if-ne p1, v0, :cond_b

    .line 36
    .line 37
    check-cast p2, Lv4/w;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lg5/q;->F:Lv4/w;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object p1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {p0, v1}, Lp5/i;->D0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast p2, Lp5/i;

    .line 55
    .line 56
    invoke-virtual {p2, v0, p1}, Lp5/i;->d(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput p1, p0, Lp5/i;->u1:I

    .line 70
    .line 71
    iget-object p1, p0, Lg5/q;->K:Lg5/k;

    .line 72
    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_2
    sget p2, Lp4/c0;->a:I

    .line 78
    .line 79
    const/16 v0, 0x23

    .line 80
    .line 81
    if-lt p2, v0, :cond_b

    .line 82
    .line 83
    new-instance p2, Landroid/os/Bundle;

    .line 84
    .line 85
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 86
    .line 87
    .line 88
    iget v0, p0, Lp5/i;->u1:I

    .line 89
    .line 90
    neg-int v0, v0

    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const-string v1, "importance"

    .line 97
    .line 98
    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, p2}, Lg5/k;->c(Landroid/os/Bundle;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast p2, Lp4/u;

    .line 109
    .line 110
    iget p1, p2, Lp4/u;->a:I

    .line 111
    .line 112
    if-eqz p1, :cond_b

    .line 113
    .line 114
    iget p1, p2, Lp4/u;->b:I

    .line 115
    .line 116
    if-eqz p1, :cond_b

    .line 117
    .line 118
    iput-object p2, p0, Lp5/i;->h1:Lp4/u;

    .line 119
    .line 120
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 121
    .line 122
    if-eqz p1, :cond_b

    .line 123
    .line 124
    iget-object v0, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 125
    .line 126
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0, p2}, Lp5/l;->e(Landroid/view/Surface;Lp4/u;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    check-cast p2, Ljava/util/List;

    .line 137
    .line 138
    iput-object p2, p0, Lp5/i;->e1:Ljava/util/List;

    .line 139
    .line 140
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 141
    .line 142
    if-eqz p1, :cond_b

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Lp5/l;->h(Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast p2, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iput p1, p0, Lp5/i;->k1:I

    .line 158
    .line 159
    iget-object p2, p0, Lp5/i;->c1:Lp5/l;

    .line 160
    .line 161
    if-eqz p2, :cond_6

    .line 162
    .line 163
    invoke-virtual {p2, p1}, Lp5/l;->d(I)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_6
    iget-object p2, p0, Lp5/i;->X0:Lp5/r;

    .line 168
    .line 169
    iget-object p2, p2, Lp5/r;->b:Lp5/u;

    .line 170
    .line 171
    iget v1, p2, Lp5/u;->j:I

    .line 172
    .line 173
    if-ne v1, p1, :cond_7

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_7
    iput p1, p2, Lp5/u;->j:I

    .line 177
    .line 178
    invoke-virtual {p2, v0}, Lp5/u;->d(Z)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    check-cast p2, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    iput p1, p0, Lp5/i;->j1:I

    .line 192
    .line 193
    iget-object p2, p0, Lg5/q;->K:Lg5/k;

    .line 194
    .line 195
    if-eqz p2, :cond_b

    .line 196
    .line 197
    invoke-interface {p2, p1}, Lg5/k;->o0(I)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    check-cast p2, Ljava/lang/Integer;

    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    iget p2, p0, Lp5/i;->w1:I

    .line 211
    .line 212
    if-eq p2, p1, :cond_b

    .line 213
    .line 214
    iput p1, p0, Lp5/i;->w1:I

    .line 215
    .line 216
    iget-boolean p1, p0, Lp5/i;->v1:Z

    .line 217
    .line 218
    if-eqz p1, :cond_b

    .line 219
    .line 220
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    check-cast p2, Lp5/q;

    .line 228
    .line 229
    iput-object p2, p0, Lp5/i;->y1:Lp5/q;

    .line 230
    .line 231
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 232
    .line 233
    if-eqz p1, :cond_b

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Lp5/l;->i(Lp5/q;)V

    .line 236
    .line 237
    .line 238
    :cond_b
    :goto_0
    return-void

    .line 239
    :cond_c
    invoke-virtual {p0, p2}, Lp5/i;->D0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-void
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

.method public final d0(Lu4/f;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lp5/i;->v1:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget v2, p0, Lp5/i;->o1:I

    .line 7
    .line 8
    add-int/2addr v2, v1

    .line 9
    iput v2, p0, Lp5/i;->o1:I

    .line 10
    .line 11
    :cond_0
    sget v2, Lp4/c0;->a:I

    .line 12
    .line 13
    const/16 v3, 0x17

    .line 14
    .line 15
    if-ge v2, v3, :cond_5

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    iget-wide v2, p1, Lu4/f;->g:J

    .line 20
    .line 21
    invoke-virtual {p0, v2, v3}, Lg5/q;->t0(J)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lp5/i;->s1:Lm4/u1;

    .line 25
    .line 26
    sget-object v0, Lm4/u1;->d:Lm4/u1;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lm4/u1;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v4, p0, Lp5/i;->U0:Lp5/y;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lp5/i;->t1:Lm4/u1;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lm4/u1;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    iput-object p1, p0, Lp5/i;->t1:Lm4/u1;

    .line 45
    .line 46
    invoke-virtual {v4, p1}, Lp5/y;->c(Lm4/u1;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 50
    .line 51
    iget v0, p1, Lv4/f;->e:I

    .line 52
    .line 53
    add-int/2addr v0, v1

    .line 54
    iput v0, p1, Lv4/f;->e:I

    .line 55
    .line 56
    iget-object p1, p0, Lp5/i;->X0:Lp5/r;

    .line 57
    .line 58
    iget v0, p1, Lp5/r;->d:I

    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    if-eq v0, v5, :cond_2

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v0, 0x0

    .line 66
    :goto_0
    iput v5, p1, Lp5/r;->d:I

    .line 67
    .line 68
    iget-object v5, p1, Lp5/r;->k:Lp4/v;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    invoke-static {v5, v6}, Lp4/c0;->N(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    iput-wide v5, p1, Lp5/r;->f:J

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object p1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 86
    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    iget-object v0, v4, Lp5/y;->b:Landroid/os/Handler;

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    new-instance v7, Lp5/x;

    .line 98
    .line 99
    invoke-direct {v7, v4, p1, v5, v6}, Lp5/x;-><init>(Lp5/y;Ljava/lang/Object;J)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 103
    .line 104
    .line 105
    :cond_3
    iput-boolean v1, p0, Lp5/i;->i1:Z

    .line 106
    .line 107
    :cond_4
    invoke-virtual {p0, v2, v3}, Lp5/i;->b0(J)V

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
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

.method public final f0(JJLg5/k;Ljava/nio/ByteBuffer;IIIJZZLm4/q;)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    move/from16 v2, p7

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lg5/q;->O0:Lg5/p;

    .line 11
    .line 12
    iget-wide v4, v3, Lg5/p;->c:J

    .line 13
    .line 14
    sub-long v7, p10, v4

    .line 15
    .line 16
    iget-object v4, v0, Lp5/i;->c1:Lp5/l;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    if-eqz v4, :cond_2

    .line 21
    .line 22
    iget-wide v6, v0, Lp5/i;->z1:J

    .line 23
    .line 24
    neg-long v6, v6

    .line 25
    add-long v6, p10, v6

    .line 26
    .line 27
    invoke-static {v5}, Lp4/c;->i(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v4, Lp5/l;->f:Lp5/p;

    .line 31
    .line 32
    iget v3, v3, Lp5/p;->n:I

    .line 33
    .line 34
    const/4 v8, -0x1

    .line 35
    if-eq v3, v8, :cond_1

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    iget-wide v8, v4, Lp5/l;->c:J

    .line 40
    .line 41
    sub-long/2addr v6, v8

    .line 42
    iget-wide v3, v4, Lp5/l;->d:J

    .line 43
    .line 44
    cmp-long v5, v6, v3

    .line 45
    .line 46
    if-gez v5, :cond_0

    .line 47
    .line 48
    if-nez p13, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lp5/i;->F0(Lg5/k;I)V

    .line 51
    .line 52
    .line 53
    return v13

    .line 54
    :cond_0
    const/4 v1, 0x0

    .line 55
    invoke-static {v1}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_1
    return v5

    .line 60
    :cond_2
    iget-wide v3, v3, Lg5/p;->b:J

    .line 61
    .line 62
    iget-object v6, v0, Lp5/i;->Y0:Lmh/f;

    .line 63
    .line 64
    iget-object v14, v0, Lp5/i;->X0:Lp5/r;

    .line 65
    .line 66
    move-wide/from16 v17, p1

    .line 67
    .line 68
    move-wide/from16 v19, p3

    .line 69
    .line 70
    move-wide/from16 v15, p10

    .line 71
    .line 72
    move/from16 v23, p13

    .line 73
    .line 74
    move-wide/from16 v21, v3

    .line 75
    .line 76
    move-object/from16 v24, v6

    .line 77
    .line 78
    invoke-virtual/range {v14 .. v24}, Lp5/r;->a(JJJJZLmh/f;)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v4, 0x4

    .line 83
    if-ne v3, v4, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    if-eqz p12, :cond_4

    .line 87
    .line 88
    if-nez p13, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Lp5/i;->F0(Lg5/k;I)V

    .line 91
    .line 92
    .line 93
    return v13

    .line 94
    :cond_4
    iget-object v4, v0, Lp5/i;->f1:Landroid/view/Surface;

    .line 95
    .line 96
    const/4 v6, 0x5

    .line 97
    iget-object v14, v0, Lp5/i;->Y0:Lmh/f;

    .line 98
    .line 99
    if-nez v4, :cond_6

    .line 100
    .line 101
    iget-wide v7, v14, Lmh/f;->a:J

    .line 102
    .line 103
    const-wide/16 v9, 0x0

    .line 104
    .line 105
    cmp-long v4, v7, v9

    .line 106
    .line 107
    if-gez v4, :cond_5

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    const-wide/16 v9, 0x7530

    .line 111
    .line 112
    cmp-long v4, v7, v9

    .line 113
    .line 114
    if-gez v4, :cond_7

    .line 115
    .line 116
    if-eq v3, v6, :cond_7

    .line 117
    .line 118
    :goto_0
    invoke-virtual {v0, v1, v2}, Lp5/i;->F0(Lg5/k;I)V

    .line 119
    .line 120
    .line 121
    iget-wide v1, v14, Lmh/f;->a:J

    .line 122
    .line 123
    invoke-virtual {v0, v1, v2}, Lp5/i;->H0(J)V

    .line 124
    .line 125
    .line 126
    return v13

    .line 127
    :cond_6
    if-eqz v3, :cond_e

    .line 128
    .line 129
    if-eq v3, v13, :cond_b

    .line 130
    .line 131
    const/4 v4, 0x2

    .line 132
    if-eq v3, v4, :cond_a

    .line 133
    .line 134
    const/4 v4, 0x3

    .line 135
    if-eq v3, v4, :cond_9

    .line 136
    .line 137
    if-ne v3, v6, :cond_8

    .line 138
    .line 139
    :cond_7
    :goto_1
    return v5

    .line 140
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :cond_9
    invoke-virtual {v0, v1, v2}, Lp5/i;->F0(Lg5/k;I)V

    .line 151
    .line 152
    .line 153
    iget-wide v1, v14, Lmh/f;->a:J

    .line 154
    .line 155
    invoke-virtual {v0, v1, v2}, Lp5/i;->H0(J)V

    .line 156
    .line 157
    .line 158
    return v13

    .line 159
    :cond_a
    const-string v3, "dropVideoBuffer"

    .line 160
    .line 161
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v1, v2}, Lg5/k;->i(I)V

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v5, v13}, Lp5/i;->G0(II)V

    .line 171
    .line 172
    .line 173
    iget-wide v1, v14, Lmh/f;->a:J

    .line 174
    .line 175
    invoke-virtual {v0, v1, v2}, Lp5/i;->H0(J)V

    .line 176
    .line 177
    .line 178
    return v13

    .line 179
    :cond_b
    iget-wide v9, v14, Lmh/f;->b:J

    .line 180
    .line 181
    iget-wide v3, v14, Lmh/f;->a:J

    .line 182
    .line 183
    iget-wide v5, v0, Lp5/i;->r1:J

    .line 184
    .line 185
    cmp-long v11, v9, v5

    .line 186
    .line 187
    if-nez v11, :cond_c

    .line 188
    .line 189
    invoke-virtual {v0, v1, v2}, Lp5/i;->F0(Lg5/k;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_c
    iget-object v6, v0, Lp5/i;->y1:Lp5/q;

    .line 194
    .line 195
    if-eqz v6, :cond_d

    .line 196
    .line 197
    iget-object v12, v0, Lg5/q;->M:Landroid/media/MediaFormat;

    .line 198
    .line 199
    move-object/from16 v11, p14

    .line 200
    .line 201
    invoke-interface/range {v6 .. v12}, Lp5/q;->c(JJLm4/q;Landroid/media/MediaFormat;)V

    .line 202
    .line 203
    .line 204
    :cond_d
    invoke-virtual {v0, v1, v2, v9, v10}, Lp5/i;->C0(Lg5/k;IJ)V

    .line 205
    .line 206
    .line 207
    :goto_2
    invoke-virtual {v0, v3, v4}, Lp5/i;->H0(J)V

    .line 208
    .line 209
    .line 210
    iput-wide v9, v0, Lp5/i;->r1:J

    .line 211
    .line 212
    return v13

    .line 213
    :cond_e
    iget-object v3, v0, Lv4/e;->g:Lp4/v;

    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 219
    .line 220
    .line 221
    move-result-wide v9

    .line 222
    iget-object v6, v0, Lp5/i;->y1:Lp5/q;

    .line 223
    .line 224
    if-eqz v6, :cond_f

    .line 225
    .line 226
    iget-object v12, v0, Lg5/q;->M:Landroid/media/MediaFormat;

    .line 227
    .line 228
    move-object/from16 v11, p14

    .line 229
    .line 230
    invoke-interface/range {v6 .. v12}, Lp5/q;->c(JJLm4/q;Landroid/media/MediaFormat;)V

    .line 231
    .line 232
    .line 233
    :cond_f
    invoke-virtual {v0, v1, v2, v9, v10}, Lp5/i;->C0(Lg5/k;IJ)V

    .line 234
    .line 235
    .line 236
    iget-wide v1, v14, Lmh/f;->a:J

    .line 237
    .line 238
    invoke-virtual {v0, v1, v2}, Lp5/i;->H0(J)V

    .line 239
    .line 240
    .line 241
    return v13
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
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, Lp5/l;->f:Lp5/p;

    .line 6
    .line 7
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 8
    .line 9
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 10
    .line 11
    iget v1, v0, Lp5/r;->d:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput v1, v0, Lp5/r;->d:I

    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lp5/i;->X0:Lp5/r;

    .line 20
    .line 21
    iget v1, v0, Lp5/r;->d:I

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iput v1, v0, Lp5/r;->d:I

    .line 27
    .line 28
    :cond_2
    return-void
    .line 29
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MediaCodecVideoRenderer"

    .line 2
    .line 3
    return-object v0
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

.method public final i0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lp5/l;->j()V

    .line 6
    .line 7
    .line 8
    :cond_0
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

.method public final j0()V
    .locals 1

    .line 1
    invoke-super {p0}, Lg5/q;->j0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lp5/i;->o1:I

    .line 6
    .line 7
    return-void
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

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg5/q;->J0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 13
    return v0
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

.method public final l()Z
    .locals 2

    .line 1
    invoke-super {p0}, Lg5/q;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lp5/i;->c1:Lp5/l;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v1, Lp5/l;->f:Lp5/p;

    .line 10
    .line 11
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lp5/r;->b(Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lg5/q;->K:Lg5/k;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v1, p0, Lp5/i;->v1:Z

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    :cond_1
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_2
    iget-object v1, p0, Lp5/i;->X0:Lp5/r;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lp5/r;->b(Z)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    return v0
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

.method public final m()V
    .locals 5

    .line 1
    iget-object v0, p0, Lp5/i;->U0:Lp5/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lp5/i;->t1:Lm4/u1;

    .line 5
    .line 6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v2, p0, Lp5/i;->A1:J

    .line 12
    .line 13
    iget-object v2, p0, Lp5/i;->c1:Lp5/l;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Lp5/l;->f:Lp5/p;

    .line 19
    .line 20
    iget-object v2, v2, Lp5/p;->f:Lp5/c;

    .line 21
    .line 22
    iget-object v2, v2, Lp5/c;->a:Lp5/r;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual {v2, v4}, Lp5/r;->d(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v2, p0, Lp5/i;->X0:Lp5/r;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lp5/r;->d(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0}, Lp5/i;->B0()V

    .line 35
    .line 36
    .line 37
    iput-boolean v3, p0, Lp5/i;->i1:Z

    .line 38
    .line 39
    iput-object v1, p0, Lp5/i;->x1:Lp5/h;

    .line 40
    .line 41
    :try_start_0
    invoke-super {p0}, Lg5/q;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lg5/q;->N0:Lv4/f;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    monitor-enter v1

    .line 50
    monitor-exit v1

    .line 51
    iget-object v2, v0, Lp5/y;->b:Landroid/os/Handler;

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    new-instance v3, Lb5/h;

    .line 56
    .line 57
    const/16 v4, 0x17

    .line 58
    .line 59
    invoke-direct {v3, v4, v0, v1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    sget-object v1, Lm4/u1;->d:Lm4/u1;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lp5/y;->c(Lm4/u1;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v1

    .line 72
    iget-object v2, p0, Lg5/q;->N0:Lv4/f;

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Lp5/y;->a(Lv4/f;)V

    .line 75
    .line 76
    .line 77
    sget-object v2, Lm4/u1;->d:Lm4/u1;

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Lp5/y;->c(Lm4/u1;)V

    .line 80
    .line 81
    .line 82
    throw v1
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

.method public final n(ZZ)V
    .locals 6

    .line 1
    new-instance p1, Lv4/f;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 7
    .line 8
    iget-object p1, p0, Lv4/e;->d:Lv4/z0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p1, Lv4/z0;->b:Z

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget v2, p0, Lp5/i;->w1:I

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 27
    :goto_1
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 28
    .line 29
    .line 30
    iget-boolean v2, p0, Lp5/i;->v1:Z

    .line 31
    .line 32
    if-eq v2, p1, :cond_2

    .line 33
    .line 34
    iput-boolean p1, p0, Lp5/i;->v1:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lg5/q;->h0()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object p1, p0, Lg5/q;->N0:Lv4/f;

    .line 40
    .line 41
    iget-object v2, p0, Lp5/i;->U0:Lp5/y;

    .line 42
    .line 43
    iget-object v3, v2, Lp5/y;->b:Landroid/os/Handler;

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    new-instance v4, Lp5/w;

    .line 48
    .line 49
    const/4 v5, 0x5

    .line 50
    invoke-direct {v4, v2, p1, v5}, Lp5/w;-><init>(Lp5/y;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-boolean p1, p0, Lp5/i;->d1:Z

    .line 57
    .line 58
    iget-object v2, p0, Lp5/i;->X0:Lp5/r;

    .line 59
    .line 60
    if-nez p1, :cond_7

    .line 61
    .line 62
    iget-object p1, p0, Lp5/i;->e1:Ljava/util/List;

    .line 63
    .line 64
    if-eqz p1, :cond_6

    .line 65
    .line 66
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 67
    .line 68
    if-nez p1, :cond_6

    .line 69
    .line 70
    new-instance p1, Lc0/s;

    .line 71
    .line 72
    iget-object v3, p0, Lp5/i;->S0:Landroid/content/Context;

    .line 73
    .line 74
    invoke-direct {p1, v3, v2}, Lc0/s;-><init>(Landroid/content/Context;Lp5/r;)V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Lv4/e;->g:Lp4/v;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iput-object v3, p1, Lc0/s;->h:Ljava/lang/Object;

    .line 83
    .line 84
    iget-boolean v3, p1, Lc0/s;->a:Z

    .line 85
    .line 86
    xor-int/2addr v3, v1

    .line 87
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p1, Lc0/s;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Lp5/o;

    .line 93
    .line 94
    if-nez v3, :cond_5

    .line 95
    .line 96
    iget-object v3, p1, Lc0/s;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Lp5/n;

    .line 99
    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    new-instance v3, Lp5/n;

    .line 103
    .line 104
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object v3, p1, Lc0/s;->d:Ljava/lang/Object;

    .line 108
    .line 109
    :cond_4
    new-instance v3, Lp5/o;

    .line 110
    .line 111
    iget-object v4, p1, Lc0/s;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, Lp5/n;

    .line 114
    .line 115
    invoke-direct {v3, v4}, Lp5/o;-><init>(Lm4/t1;)V

    .line 116
    .line 117
    .line 118
    iput-object v3, p1, Lc0/s;->e:Ljava/lang/Object;

    .line 119
    .line 120
    :cond_5
    new-instance v3, Lp5/p;

    .line 121
    .line 122
    invoke-direct {v3, p1}, Lp5/p;-><init>(Lc0/s;)V

    .line 123
    .line 124
    .line 125
    iput-boolean v1, p1, Lc0/s;->a:Z

    .line 126
    .line 127
    iput v1, v3, Lp5/p;->n:I

    .line 128
    .line 129
    iget-object p1, v3, Lp5/p;->d:Landroid/util/SparseArray;

    .line 130
    .line 131
    invoke-static {p1, v0}, Lp4/c0;->k(Landroid/util/SparseArray;I)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    xor-int/2addr v4, v1

    .line 136
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 137
    .line 138
    .line 139
    new-instance v4, Lp5/l;

    .line 140
    .line 141
    iget-object v5, v3, Lp5/p;->a:Landroid/content/Context;

    .line 142
    .line 143
    invoke-direct {v4, v3, v5}, Lp5/l;-><init>(Lp5/p;Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    iget-object v3, v3, Lp5/p;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 147
    .line 148
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iput-object v4, p0, Lp5/i;->c1:Lp5/l;

    .line 155
    .line 156
    :cond_6
    iput-boolean v1, p0, Lp5/i;->d1:Z

    .line 157
    .line 158
    :cond_7
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 159
    .line 160
    if-eqz p1, :cond_c

    .line 161
    .line 162
    iget-object v0, p0, Lp5/i;->y1:Lp5/q;

    .line 163
    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Lp5/l;->i(Lp5/q;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    iget-object p1, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 170
    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    iget-object p1, p0, Lp5/i;->h1:Lp4/u;

    .line 174
    .line 175
    sget-object v0, Lp4/u;->c:Lp4/u;

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Lp4/u;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_9

    .line 182
    .line 183
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 184
    .line 185
    iget-object v0, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 186
    .line 187
    iget-object v1, p0, Lp5/i;->h1:Lp4/u;

    .line 188
    .line 189
    invoke-virtual {p1, v0, v1}, Lp5/l;->e(Landroid/view/Surface;Lp4/u;)V

    .line 190
    .line 191
    .line 192
    :cond_9
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 193
    .line 194
    iget v0, p0, Lp5/i;->k1:I

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Lp5/l;->d(I)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 200
    .line 201
    iget v0, p0, Lg5/q;->I:F

    .line 202
    .line 203
    invoke-virtual {p1, v0}, Lp5/l;->f(F)V

    .line 204
    .line 205
    .line 206
    iget-object p1, p0, Lp5/i;->e1:Ljava/util/List;

    .line 207
    .line 208
    if-eqz p1, :cond_a

    .line 209
    .line 210
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 211
    .line 212
    invoke-virtual {v0, p1}, Lp5/l;->h(Ljava/util/List;)V

    .line 213
    .line 214
    .line 215
    :cond_a
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 216
    .line 217
    iget-object v0, p1, Lp5/l;->f:Lp5/p;

    .line 218
    .line 219
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 220
    .line 221
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 222
    .line 223
    iput p2, v0, Lp5/r;->d:I

    .line 224
    .line 225
    iget-object p2, p0, Lg5/q;->F:Lv4/w;

    .line 226
    .line 227
    if-eqz p2, :cond_b

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    :cond_b
    return-void

    .line 233
    :cond_c
    iget-object p1, p0, Lv4/e;->g:Lp4/v;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iput-object p1, v2, Lp5/r;->k:Lp4/v;

    .line 239
    .line 240
    iput p2, v2, Lp5/r;->d:I

    .line 241
    .line 242
    return-void
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

.method public final n0(Lg5/n;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lp5/i;->z0(Lg5/n;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public final o(JZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lp5/l;->a(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v2, p0, Lp5/i;->c1:Lp5/l;

    .line 12
    .line 13
    iget-object v0, p0, Lg5/q;->O0:Lg5/p;

    .line 14
    .line 15
    iget-wide v3, v0, Lg5/p;->b:J

    .line 16
    .line 17
    iget-wide v5, p0, Lp5/i;->z1:J

    .line 18
    .line 19
    neg-long v5, v5

    .line 20
    iget-wide v7, p0, Lv4/e;->l:J

    .line 21
    .line 22
    invoke-virtual/range {v2 .. v8}, Lp5/l;->g(JJJ)V

    .line 23
    .line 24
    .line 25
    iput-boolean v1, p0, Lp5/i;->B1:Z

    .line 26
    .line 27
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lg5/q;->o(JZ)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lp5/i;->c1:Lp5/l;

    .line 31
    .line 32
    iget-object p2, p0, Lp5/i;->X0:Lp5/r;

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p2, Lp5/r;->b:Lp5/u;

    .line 37
    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    iput-wide v2, p1, Lp5/u;->m:J

    .line 41
    .line 42
    const-wide/16 v2, -0x1

    .line 43
    .line 44
    iput-wide v2, p1, Lp5/u;->p:J

    .line 45
    .line 46
    iput-wide v2, p1, Lp5/u;->n:J

    .line 47
    .line 48
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    iput-wide v2, p2, Lp5/r;->g:J

    .line 54
    .line 55
    iput-wide v2, p2, Lp5/r;->e:J

    .line 56
    .line 57
    invoke-virtual {p2, v1}, Lp5/r;->d(I)V

    .line 58
    .line 59
    .line 60
    iput-wide v2, p2, Lp5/r;->h:J

    .line 61
    .line 62
    :cond_2
    const/4 p1, 0x0

    .line 63
    if-eqz p3, :cond_4

    .line 64
    .line 65
    iget-object p3, p0, Lp5/i;->c1:Lp5/l;

    .line 66
    .line 67
    if-eqz p3, :cond_3

    .line 68
    .line 69
    invoke-virtual {p3, p1}, Lp5/l;->c(Z)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {p2, p1}, Lp5/r;->c(Z)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lp5/i;->B0()V

    .line 77
    .line 78
    .line 79
    iput p1, p0, Lp5/i;->n1:I

    .line 80
    .line 81
    return-void
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

.method public final o0(Lu4/f;)Z
    .locals 8

    .line 1
    const/high16 v0, 0x4000000

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lq4/d;->d(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lv4/e;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_5

    .line 16
    .line 17
    const/high16 v0, 0x20000000

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lq4/d;->d(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-wide v2, p0, Lp5/i;->A1:J

    .line 27
    .line 28
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v0, v2, v4

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-wide v4, p1, Lu4/f;->g:J

    .line 39
    .line 40
    iget-object v0, p0, Lg5/q;->O0:Lg5/p;

    .line 41
    .line 42
    iget-wide v6, v0, Lg5/p;->c:J

    .line 43
    .line 44
    sub-long/2addr v4, v6

    .line 45
    sub-long/2addr v2, v4

    .line 46
    const-wide/32 v4, 0x186a0

    .line 47
    .line 48
    .line 49
    cmp-long v0, v2, v4

    .line 50
    .line 51
    if-gtz v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/high16 v0, 0x40000000    # 2.0f

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lq4/d;->d(I)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    iget-wide v2, p1, Lu4/f;->g:J

    .line 64
    .line 65
    iget-wide v4, p0, Lv4/e;->l:J

    .line 66
    .line 67
    cmp-long p1, v2, v4

    .line 68
    .line 69
    if-gez p1, :cond_5

    .line 70
    .line 71
    const/4 p1, 0x1

    .line 72
    return p1

    .line 73
    :cond_5
    :goto_0
    return v1
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

.method public final p()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v1, p0, Lp5/i;->T0:Z

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-object v0, v0, Lp5/l;->f:Lp5/p;

    .line 10
    .line 11
    iget v1, v0, Lp5/p;->k:I

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, v0, Lp5/p;->i:Lp4/x;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, v1, Lp4/x;->a:Landroid/os/Handler;

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v3, v0, Lp5/p;->j:Landroid/util/Pair;

    .line 28
    .line 29
    iput v2, v0, Lp5/p;->k:I

    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void
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
.end method

.method public final q()V
    .locals 6

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lg5/q;->D()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lg5/q;->h0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    iget-object v4, p0, Lg5/q;->E:Lb5/l;

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v4, v3}, Lb5/l;->c(Lb5/q;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iput-object v3, p0, Lg5/q;->E:Lb5/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    iput-boolean v2, p0, Lp5/i;->d1:Z

    .line 25
    .line 26
    iput-wide v0, p0, Lp5/i;->z1:J

    .line 27
    .line 28
    iget-object v0, p0, Lp5/i;->g1:Lp5/k;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lp5/k;->release()V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, Lp5/i;->g1:Lp5/k;

    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :catchall_0
    move-exception v4

    .line 39
    goto :goto_1

    .line 40
    :catchall_1
    move-exception v4

    .line 41
    :try_start_2
    iget-object v5, p0, Lg5/q;->E:Lb5/l;

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    invoke-interface {v5, v3}, Lb5/l;->c(Lb5/q;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iput-object v3, p0, Lg5/q;->E:Lb5/l;

    .line 49
    .line 50
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    :goto_1
    iput-boolean v2, p0, Lp5/i;->d1:Z

    .line 52
    .line 53
    iput-wide v0, p0, Lp5/i;->z1:J

    .line 54
    .line 55
    iget-object v0, p0, Lp5/i;->g1:Lp5/k;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Lp5/k;->release()V

    .line 60
    .line 61
    .line 62
    iput-object v3, p0, Lp5/i;->g1:Lp5/k;

    .line 63
    .line 64
    :cond_3
    throw v4
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

.method public final q0(Lg5/r;Lm4/q;)I
    .locals 11

    .line 1
    iget-object v0, p2, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lm4/o0;->o(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1, v1, v1, v1}, Lq/t0;->g(IIII)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    iget-object v0, p2, Lm4/q;->r:Lm4/n;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget-object v3, p0, Lp5/i;->S0:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v3, p1, p2, v0, v1}, Lp5/i;->w0(Landroid/content/Context;Lg5/r;Lm4/q;ZZ)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    invoke-static {v3, p1, p2, v1, v1}, Lp5/i;->w0(Landroid/content/Context;Lg5/r;Lm4/q;ZZ)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_3

    .line 46
    .line 47
    invoke-static {v2, v1, v1, v1}, Lq/t0;->g(IIII)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1

    .line 52
    :cond_3
    iget v5, p2, Lm4/q;->M:I

    .line 53
    .line 54
    if-eqz v5, :cond_5

    .line 55
    .line 56
    const/4 v6, 0x2

    .line 57
    if-ne v5, v6, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    invoke-static {v6, v1, v1, v1}, Lq/t0;->g(IIII)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    return p1

    .line 65
    :cond_5
    :goto_1
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lg5/n;

    .line 70
    .line 71
    invoke-virtual {v5, p2}, Lg5/n;->d(Lm4/q;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_7

    .line 76
    .line 77
    const/4 v7, 0x1

    .line 78
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-ge v7, v8, :cond_7

    .line 83
    .line 84
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    check-cast v8, Lg5/n;

    .line 89
    .line 90
    invoke-virtual {v8, p2}, Lg5/n;->d(Lm4/q;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_6

    .line 95
    .line 96
    move-object v5, v8

    .line 97
    const/4 v4, 0x0

    .line 98
    const/4 v6, 0x1

    .line 99
    goto :goto_3

    .line 100
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    const/4 v4, 0x1

    .line 104
    :goto_3
    if-eqz v6, :cond_8

    .line 105
    .line 106
    const/4 v7, 0x4

    .line 107
    goto :goto_4

    .line 108
    :cond_8
    const/4 v7, 0x3

    .line 109
    :goto_4
    invoke-virtual {v5, p2}, Lg5/n;->e(Lm4/q;)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_9

    .line 114
    .line 115
    const/16 v8, 0x10

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_9
    const/16 v8, 0x8

    .line 119
    .line 120
    :goto_5
    iget-boolean v5, v5, Lg5/n;->g:Z

    .line 121
    .line 122
    if-eqz v5, :cond_a

    .line 123
    .line 124
    const/16 v5, 0x40

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    const/4 v5, 0x0

    .line 128
    :goto_6
    if-eqz v4, :cond_b

    .line 129
    .line 130
    const/16 v4, 0x80

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_b
    const/4 v4, 0x0

    .line 134
    :goto_7
    sget v9, Lp4/c0;->a:I

    .line 135
    .line 136
    const/16 v10, 0x1a

    .line 137
    .line 138
    if-lt v9, v10, :cond_c

    .line 139
    .line 140
    const-string v9, "video/dolby-vision"

    .line 141
    .line 142
    iget-object v10, p2, Lm4/q;->n:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-eqz v9, :cond_c

    .line 149
    .line 150
    invoke-static {v3}, Ln7/b0;->i(Landroid/content/Context;)Z

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-nez v9, :cond_c

    .line 155
    .line 156
    const/16 v4, 0x100

    .line 157
    .line 158
    :cond_c
    if-eqz v6, :cond_d

    .line 159
    .line 160
    invoke-static {v3, p1, p2, v0, v2}, Lp5/i;->w0(Landroid/content/Context;Lg5/r;Lm4/q;ZZ)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_d

    .line 169
    .line 170
    sget-object v0, Lg5/y;->a:Ljava/util/HashMap;

    .line 171
    .line 172
    new-instance v0, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 175
    .line 176
    .line 177
    new-instance p1, Landroidx/media3/exoplayer/offline/g;

    .line 178
    .line 179
    const/16 v2, 0xc

    .line 180
    .line 181
    invoke-direct {p1, v2, p2}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    new-instance v2, Lg5/s;

    .line 185
    .line 186
    invoke-direct {v2, v1, p1}, Lg5/s;-><init>(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Lg5/n;

    .line 197
    .line 198
    invoke-virtual {p1, p2}, Lg5/n;->d(Lm4/q;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_d

    .line 203
    .line 204
    invoke-virtual {p1, p2}, Lg5/n;->e(Lm4/q;)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_d

    .line 209
    .line 210
    const/16 v1, 0x20

    .line 211
    .line 212
    :cond_d
    or-int p1, v7, v8

    .line 213
    .line 214
    or-int/2addr p1, v1

    .line 215
    or-int/2addr p1, v5

    .line 216
    or-int/2addr p1, v4

    .line 217
    return p1
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

.method public final r()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lp5/i;->m1:I

    .line 3
    .line 4
    iget-object v1, p0, Lv4/e;->g:Lp4/v;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, p0, Lp5/i;->l1:J

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    iput-wide v1, p0, Lp5/i;->p1:J

    .line 18
    .line 19
    iput v0, p0, Lp5/i;->q1:I

    .line 20
    .line 21
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Lp5/l;->f:Lp5/p;

    .line 26
    .line 27
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 28
    .line 29
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 30
    .line 31
    invoke-virtual {v0}, Lp5/r;->e()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lp5/i;->X0:Lp5/r;

    .line 36
    .line 37
    invoke-virtual {v0}, Lp5/r;->e()V

    .line 38
    .line 39
    .line 40
    return-void
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

.method public final s()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lp5/i;->A0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lp5/i;->q1:I

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-wide v1, p0, Lp5/i;->p1:J

    .line 9
    .line 10
    iget-object v3, p0, Lp5/i;->U0:Lp5/y;

    .line 11
    .line 12
    iget-object v4, v3, Lp5/y;->b:Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    new-instance v5, Lp5/w;

    .line 17
    .line 18
    invoke-direct {v5, v3, v1, v2, v0}, Lp5/w;-><init>(Lp5/y;JI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    iput-wide v0, p0, Lp5/i;->p1:J

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lp5/i;->q1:I

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lp5/l;->f:Lp5/p;

    .line 36
    .line 37
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 38
    .line 39
    iget-object v0, v0, Lp5/c;->a:Lp5/r;

    .line 40
    .line 41
    invoke-virtual {v0}, Lp5/r;->f()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object v0, p0, Lp5/i;->X0:Lp5/r;

    .line 46
    .line 47
    invoke-virtual {v0}, Lp5/r;->f()V

    .line 48
    .line 49
    .line 50
    return-void
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

.method public final t([Lm4/q;JJLj5/d0;)V
    .locals 3

    .line 1
    invoke-super/range {p0 .. p6}, Lg5/q;->t([Lm4/q;JJLj5/d0;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-wide p4, p1, Lp5/i;->z1:J

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v2, p4, v0

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iput-wide p2, p1, Lp5/i;->z1:J

    .line 17
    .line 18
    :cond_0
    iget-object p2, p1, Lv4/e;->p:Lm4/i1;

    .line 19
    .line 20
    invoke-virtual {p2}, Lm4/i1;->p()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    iput-wide v0, p1, Lp5/i;->A1:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p3, p6, Lj5/d0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance p4, Lm4/f1;

    .line 35
    .line 36
    invoke-direct {p4}, Lm4/f1;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p3, p4}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iget-wide p2, p2, Lm4/f1;->d:J

    .line 44
    .line 45
    iput-wide p2, p1, Lp5/i;->A1:J

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

.method public final v(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v0, Lp5/l;->f:Lp5/p;

    .line 6
    .line 7
    iget-object v0, v0, Lp5/p;->f:Lp5/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Lp5/a0; {:try_start_0 .. :try_end_0} :catch_1

    .line 10
    .line 11
    .line 12
    :try_start_1
    iget-object v1, v0, Lp5/c;->c:Lp5/v;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p2, p3, p4}, Lp5/v;->a(JJ)V
    :try_end_1
    .catch Lv4/m; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lp5/a0; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_2
    new-instance p2, Lp5/a0;

    .line 20
    .line 21
    iget-object p3, v0, Lp5/c;->e:Lm4/q;

    .line 22
    .line 23
    invoke-direct {p2, p1, p3}, Lp5/a0;-><init>(Ljava/lang/Exception;Lm4/q;)V

    .line 24
    .line 25
    .line 26
    throw p2
    :try_end_2
    .catch Lp5/a0; {:try_start_2 .. :try_end_2} :catch_1

    .line 27
    :catch_1
    move-exception p1

    .line 28
    const/16 p2, 0x1b59

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    iget-object p4, p1, Lp5/a0;->a:Lm4/q;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p4, p3, p2}, Lv4/e;->f(Ljava/lang/Exception;Lm4/q;ZI)Lv4/m;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    throw p1

    .line 38
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lg5/q;->v(JJ)V

    .line 39
    .line 40
    .line 41
    return-void
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

.method public final x(FF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lg5/q;->x(FF)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lp5/i;->c1:Lp5/l;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Lp5/l;->f(F)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p2, p0, Lp5/i;->X0:Lp5/r;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lp5/r;->g(F)V

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

.method public final y0(Lg5/n;)Landroid/view/Surface;
    .locals 5

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    iget-object v0, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    sget v0, Lp4/c0;->a:I

    .line 13
    .line 14
    const/16 v3, 0x23

    .line 15
    .line 16
    if-lt v0, v3, :cond_1

    .line 17
    .line 18
    iget-boolean v0, p1, Lg5/n;->j:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Lp5/i;->E0(Lg5/n;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lp5/i;->g1:Lp5/k;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-boolean v3, v0, Lp5/k;->a:Z

    .line 35
    .line 36
    iget-boolean v4, p1, Lg5/n;->f:Z

    .line 37
    .line 38
    if-eq v3, v4, :cond_2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lp5/k;->release()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lp5/i;->g1:Lp5/k;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lp5/i;->g1:Lp5/k;

    .line 48
    .line 49
    if-nez v0, :cond_a

    .line 50
    .line 51
    iget-object v0, p0, Lp5/i;->S0:Landroid/content/Context;

    .line 52
    .line 53
    iget-boolean p1, p1, Lg5/n;->f:Z

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    invoke-static {v0}, Lp5/k;->a(Landroid/content/Context;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v0, 0x0

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    sget v0, Lp5/k;->d:I

    .line 68
    .line 69
    :goto_0
    const/4 v0, 0x1

    .line 70
    :goto_1
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lp5/j;

    .line 74
    .line 75
    const-string v3, "ExoPlayer:PlaceholderSurface"

    .line 76
    .line 77
    invoke-direct {v0, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    sget p1, Lp5/k;->d:I

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    const/4 p1, 0x0

    .line 86
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 87
    .line 88
    .line 89
    new-instance v3, Landroid/os/Handler;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-direct {v3, v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 96
    .line 97
    .line 98
    iput-object v3, v0, Lp5/j;->b:Landroid/os/Handler;

    .line 99
    .line 100
    new-instance v4, Lp4/i;

    .line 101
    .line 102
    invoke-direct {v4, v3}, Lp4/i;-><init>(Landroid/os/Handler;)V

    .line 103
    .line 104
    .line 105
    iput-object v4, v0, Lp5/j;->a:Lp4/i;

    .line 106
    .line 107
    monitor-enter v0

    .line 108
    :try_start_0
    iget-object v3, v0, Lp5/j;->b:Landroid/os/Handler;

    .line 109
    .line 110
    invoke-virtual {v3, v2, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 115
    .line 116
    .line 117
    :goto_3
    iget-object p1, v0, Lp5/j;->e:Lp5/k;

    .line 118
    .line 119
    if-nez p1, :cond_6

    .line 120
    .line 121
    iget-object p1, v0, Lp5/j;->d:Ljava/lang/RuntimeException;

    .line 122
    .line 123
    if-nez p1, :cond_6

    .line 124
    .line 125
    iget-object p1, v0, Lp5/j;->c:Ljava/lang/Error;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    if-nez p1, :cond_6

    .line 128
    .line 129
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :catchall_0
    move-exception p1

    .line 134
    goto :goto_4

    .line 135
    :catch_0
    const/4 v1, 0x1

    .line 136
    goto :goto_3

    .line 137
    :cond_6
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    if-eqz v1, :cond_7

    .line 139
    .line 140
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 145
    .line 146
    .line 147
    :cond_7
    iget-object p1, v0, Lp5/j;->d:Ljava/lang/RuntimeException;

    .line 148
    .line 149
    if-nez p1, :cond_9

    .line 150
    .line 151
    iget-object p1, v0, Lp5/j;->c:Ljava/lang/Error;

    .line 152
    .line 153
    if-nez p1, :cond_8

    .line 154
    .line 155
    iget-object p1, v0, Lp5/j;->e:Lp5/k;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iput-object p1, p0, Lp5/i;->g1:Lp5/k;

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_8
    throw p1

    .line 164
    :cond_9
    throw p1

    .line 165
    :goto_4
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 166
    throw p1

    .line 167
    :cond_a
    :goto_5
    iget-object p1, p0, Lp5/i;->g1:Lp5/k;

    .line 168
    .line 169
    return-object p1

    .line 170
    :cond_b
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 171
    .line 172
    .line 173
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    throw v2
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

.method public final z0(Lg5/n;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/i;->c1:Lp5/l;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lp5/i;->f1:Landroid/view/Surface;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    :cond_0
    sget v0, Lp4/c0;->a:I

    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    if-lt v0, v1, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p1, Lg5/n;->j:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0, p1}, Lp5/i;->E0(Lg5/n;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 36
    return p1
.end method
