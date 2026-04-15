.class public final Ly6/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ly6/h;


# static fields
.field public static final r:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lr5/h0;

.field public final c:Lv2/e;

.field public final d:Ljava/lang/String;

.field public final e:Lp4/s;

.field public final f:Lv4/z;

.field public final g:[Z

.field public final h:Ly6/i;

.field public i:J

.field public j:Z

.field public k:Z

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:Z

.field public q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ly6/j;->r:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
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

.method public constructor <init>(Lv2/e;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly6/j;->c:Lv2/e;

    .line 5
    .line 6
    iput-object p2, p0, Ly6/j;->d:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p2, 0x4

    .line 9
    new-array p2, p2, [Z

    .line 10
    .line 11
    iput-object p2, p0, Ly6/j;->g:[Z

    .line 12
    .line 13
    new-instance p2, Ly6/i;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0x80

    .line 19
    .line 20
    new-array v0, v0, [B

    .line 21
    .line 22
    iput-object v0, p2, Ly6/i;->d:[B

    .line 23
    .line 24
    iput-object p2, p0, Ly6/j;->h:Ly6/i;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    new-instance p1, Lv4/z;

    .line 29
    .line 30
    const/16 p2, 0xb2

    .line 31
    .line 32
    invoke-direct {p1, p2}, Lv4/z;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ly6/j;->f:Lv4/z;

    .line 36
    .line 37
    new-instance p1, Lp4/s;

    .line 38
    .line 39
    invoke-direct {p1}, Lp4/s;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Ly6/j;->e:Lp4/s;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ly6/j;->f:Lv4/z;

    .line 47
    .line 48
    iput-object p1, p0, Ly6/j;->e:Lp4/s;

    .line 49
    .line 50
    :goto_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    iput-wide p1, p0, Ly6/j;->m:J

    .line 56
    .line 57
    iput-wide p1, p0, Ly6/j;->o:J

    .line 58
    .line 59
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


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly6/j;->g:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lq4/p;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly6/j;->h:Ly6/i;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Ly6/i;->a:Z

    .line 10
    .line 11
    iput v1, v0, Ly6/i;->b:I

    .line 12
    .line 13
    iput v1, v0, Ly6/i;->c:I

    .line 14
    .line 15
    iget-object v0, p0, Ly6/j;->f:Lv4/z;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lv4/z;->d()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    iput-wide v2, p0, Ly6/j;->i:J

    .line 25
    .line 26
    iput-boolean v1, p0, Ly6/j;->j:Z

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, Ly6/j;->m:J

    .line 34
    .line 35
    iput-wide v0, p0, Ly6/j;->o:J

    .line 36
    .line 37
    return-void
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

.method public final b(Lp4/s;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ly6/j;->b:Lr5/h0;

    .line 6
    .line 7
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget v2, v1, Lp4/s;->b:I

    .line 11
    .line 12
    iget v3, v1, Lp4/s;->c:I

    .line 13
    .line 14
    iget-object v4, v1, Lp4/s;->a:[B

    .line 15
    .line 16
    iget-wide v5, v0, Ly6/j;->i:J

    .line 17
    .line 18
    invoke-virtual {v1}, Lp4/s;->a()I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    int-to-long v7, v7

    .line 23
    add-long/2addr v5, v7

    .line 24
    iput-wide v5, v0, Ly6/j;->i:J

    .line 25
    .line 26
    iget-object v5, v0, Ly6/j;->b:Lr5/h0;

    .line 27
    .line 28
    invoke-virtual {v1}, Lp4/s;->a()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-interface {v5, v6, v1}, Lr5/h0;->e(ILp4/s;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v5, v0, Ly6/j;->g:[Z

    .line 36
    .line 37
    invoke-static {v4, v2, v3, v5}, Lq4/p;->b([BII[Z)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    iget-object v6, v0, Ly6/j;->h:Ly6/i;

    .line 42
    .line 43
    iget-object v7, v0, Ly6/j;->f:Lv4/z;

    .line 44
    .line 45
    if-ne v5, v3, :cond_2

    .line 46
    .line 47
    iget-boolean v1, v0, Ly6/j;->k:Z

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v6, v4, v2, v3}, Ly6/i;->a([BII)V

    .line 52
    .line 53
    .line 54
    :cond_0
    if-eqz v7, :cond_1

    .line 55
    .line 56
    invoke-virtual {v7, v4, v2, v3}, Lv4/z;->a([BII)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :cond_2
    iget-object v8, v1, Lp4/s;->a:[B

    .line 61
    .line 62
    add-int/lit8 v9, v5, 0x3

    .line 63
    .line 64
    aget-byte v8, v8, v9

    .line 65
    .line 66
    and-int/lit16 v8, v8, 0xff

    .line 67
    .line 68
    sub-int v10, v5, v2

    .line 69
    .line 70
    iget-boolean v11, v0, Ly6/j;->k:Z

    .line 71
    .line 72
    const/4 v13, 0x0

    .line 73
    if-nez v11, :cond_d

    .line 74
    .line 75
    if-lez v10, :cond_3

    .line 76
    .line 77
    invoke-virtual {v6, v4, v2, v5}, Ly6/i;->a([BII)V

    .line 78
    .line 79
    .line 80
    :cond_3
    if-gez v10, :cond_4

    .line 81
    .line 82
    neg-int v11, v10

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const/4 v11, 0x0

    .line 85
    :goto_1
    iget-boolean v15, v6, Ly6/i;->a:Z

    .line 86
    .line 87
    if-eqz v15, :cond_b

    .line 88
    .line 89
    iget v15, v6, Ly6/i;->b:I

    .line 90
    .line 91
    sub-int/2addr v15, v11

    .line 92
    iput v15, v6, Ly6/i;->b:I

    .line 93
    .line 94
    iget v11, v6, Ly6/i;->c:I

    .line 95
    .line 96
    if-nez v11, :cond_5

    .line 97
    .line 98
    const/16 v11, 0xb5

    .line 99
    .line 100
    if-ne v8, v11, :cond_5

    .line 101
    .line 102
    iput v15, v6, Ly6/i;->c:I

    .line 103
    .line 104
    move/from16 v21, v3

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_5
    iput-boolean v13, v6, Ly6/i;->a:Z

    .line 109
    .line 110
    iget-object v11, v0, Ly6/j;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v15, v6, Ly6/i;->d:[B

    .line 116
    .line 117
    iget v13, v6, Ly6/i;->b:I

    .line 118
    .line 119
    invoke-static {v15, v13}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    const/4 v15, 0x4

    .line 124
    const/16 v17, 0x1

    .line 125
    .line 126
    aget-byte v14, v13, v15

    .line 127
    .line 128
    and-int/lit16 v14, v14, 0xff

    .line 129
    .line 130
    const/16 v18, 0x5

    .line 131
    .line 132
    const/16 v19, 0x4

    .line 133
    .line 134
    aget-byte v15, v13, v18

    .line 135
    .line 136
    and-int/lit16 v12, v15, 0xff

    .line 137
    .line 138
    const/16 v20, 0x6

    .line 139
    .line 140
    move/from16 v21, v3

    .line 141
    .line 142
    aget-byte v3, v13, v20

    .line 143
    .line 144
    and-int/lit16 v3, v3, 0xff

    .line 145
    .line 146
    shl-int/lit8 v14, v14, 0x4

    .line 147
    .line 148
    shr-int/lit8 v12, v12, 0x4

    .line 149
    .line 150
    or-int/2addr v12, v14

    .line 151
    and-int/lit8 v14, v15, 0xf

    .line 152
    .line 153
    const/16 v15, 0x8

    .line 154
    .line 155
    shl-int/2addr v14, v15

    .line 156
    or-int/2addr v3, v14

    .line 157
    const/16 v20, 0x7

    .line 158
    .line 159
    aget-byte v14, v13, v20

    .line 160
    .line 161
    and-int/lit16 v14, v14, 0xf0

    .line 162
    .line 163
    shr-int/lit8 v14, v14, 0x4

    .line 164
    .line 165
    const/4 v15, 0x2

    .line 166
    if-eq v14, v15, :cond_8

    .line 167
    .line 168
    const/4 v15, 0x3

    .line 169
    if-eq v14, v15, :cond_7

    .line 170
    .line 171
    const/4 v15, 0x4

    .line 172
    if-eq v14, v15, :cond_6

    .line 173
    .line 174
    const/high16 v14, 0x3f800000    # 1.0f

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_6
    mul-int/lit8 v14, v3, 0x79

    .line 178
    .line 179
    int-to-float v14, v14

    .line 180
    mul-int/lit8 v15, v12, 0x64

    .line 181
    .line 182
    :goto_2
    int-to-float v15, v15

    .line 183
    div-float/2addr v14, v15

    .line 184
    goto :goto_3

    .line 185
    :cond_7
    mul-int/lit8 v14, v3, 0x10

    .line 186
    .line 187
    int-to-float v14, v14

    .line 188
    mul-int/lit8 v15, v12, 0x9

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_8
    mul-int/lit8 v14, v3, 0x4

    .line 192
    .line 193
    int-to-float v14, v14

    .line 194
    mul-int/lit8 v15, v12, 0x3

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :goto_3
    new-instance v15, Lm4/p;

    .line 198
    .line 199
    invoke-direct {v15}, Lm4/p;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-object v11, v15, Lm4/p;->a:Ljava/lang/String;

    .line 203
    .line 204
    iget-object v11, v0, Ly6/j;->d:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v11}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    iput-object v11, v15, Lm4/p;->l:Ljava/lang/String;

    .line 211
    .line 212
    const-string v11, "video/mpeg2"

    .line 213
    .line 214
    invoke-static {v11}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    iput-object v11, v15, Lm4/p;->m:Ljava/lang/String;

    .line 219
    .line 220
    iput v12, v15, Lm4/p;->t:I

    .line 221
    .line 222
    iput v3, v15, Lm4/p;->u:I

    .line 223
    .line 224
    iput v14, v15, Lm4/p;->x:F

    .line 225
    .line 226
    invoke-static {v13}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    iput-object v3, v15, Lm4/p;->p:Ljava/util/List;

    .line 231
    .line 232
    new-instance v3, Lm4/q;

    .line 233
    .line 234
    invoke-direct {v3, v15}, Lm4/q;-><init>(Lm4/p;)V

    .line 235
    .line 236
    .line 237
    aget-byte v11, v13, v20

    .line 238
    .line 239
    and-int/lit8 v11, v11, 0xf

    .line 240
    .line 241
    add-int/lit8 v11, v11, -0x1

    .line 242
    .line 243
    if-ltz v11, :cond_a

    .line 244
    .line 245
    const/16 v12, 0x8

    .line 246
    .line 247
    if-ge v11, v12, :cond_a

    .line 248
    .line 249
    sget-object v12, Ly6/j;->r:[D

    .line 250
    .line 251
    aget-wide v11, v12, v11

    .line 252
    .line 253
    iget v6, v6, Ly6/i;->c:I

    .line 254
    .line 255
    add-int/lit8 v6, v6, 0x9

    .line 256
    .line 257
    aget-byte v6, v13, v6

    .line 258
    .line 259
    and-int/lit8 v13, v6, 0x60

    .line 260
    .line 261
    shr-int/lit8 v13, v13, 0x5

    .line 262
    .line 263
    and-int/lit8 v6, v6, 0x1f

    .line 264
    .line 265
    if-eq v13, v6, :cond_9

    .line 266
    .line 267
    int-to-double v13, v13

    .line 268
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 269
    .line 270
    add-double v13, v13, v18

    .line 271
    .line 272
    add-int/lit8 v6, v6, 0x1

    .line 273
    .line 274
    move-wide/from16 v18, v11

    .line 275
    .line 276
    int-to-double v11, v6

    .line 277
    div-double/2addr v13, v11

    .line 278
    mul-double v11, v13, v18

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_9
    move-wide/from16 v18, v11

    .line 282
    .line 283
    :goto_4
    const-wide v13, 0x412e848000000000L    # 1000000.0

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    div-double/2addr v13, v11

    .line 289
    double-to-long v11, v13

    .line 290
    goto :goto_5

    .line 291
    :cond_a
    const-wide/16 v11, 0x0

    .line 292
    .line 293
    :goto_5
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    invoke-static {v3, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    iget-object v6, v0, Ly6/j;->b:Lr5/h0;

    .line 302
    .line 303
    iget-object v11, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v11, Lm4/q;

    .line 306
    .line 307
    invoke-interface {v6, v11}, Lr5/h0;->b(Lm4/q;)V

    .line 308
    .line 309
    .line 310
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v3, Ljava/lang/Long;

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 315
    .line 316
    .line 317
    move-result-wide v11

    .line 318
    iput-wide v11, v0, Ly6/j;->l:J

    .line 319
    .line 320
    const/4 v3, 0x1

    .line 321
    iput-boolean v3, v0, Ly6/j;->k:Z

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_b
    move/from16 v21, v3

    .line 325
    .line 326
    const/4 v3, 0x1

    .line 327
    const/16 v11, 0xb3

    .line 328
    .line 329
    if-ne v8, v11, :cond_c

    .line 330
    .line 331
    iput-boolean v3, v6, Ly6/i;->a:Z

    .line 332
    .line 333
    :cond_c
    :goto_6
    sget-object v3, Ly6/i;->e:[B

    .line 334
    .line 335
    const/4 v11, 0x0

    .line 336
    const/4 v15, 0x3

    .line 337
    invoke-virtual {v6, v3, v11, v15}, Ly6/i;->a([BII)V

    .line 338
    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_d
    move/from16 v21, v3

    .line 342
    .line 343
    :goto_7
    if-eqz v7, :cond_10

    .line 344
    .line 345
    if-lez v10, :cond_e

    .line 346
    .line 347
    invoke-virtual {v7, v4, v2, v5}, Lv4/z;->a([BII)V

    .line 348
    .line 349
    .line 350
    const/4 v11, 0x0

    .line 351
    goto :goto_8

    .line 352
    :cond_e
    neg-int v11, v10

    .line 353
    :goto_8
    invoke-virtual {v7, v11}, Lv4/z;->b(I)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_f

    .line 358
    .line 359
    iget-object v2, v7, Lv4/z;->e:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v2, [B

    .line 362
    .line 363
    iget v3, v7, Lv4/z;->d:I

    .line 364
    .line 365
    invoke-static {v2, v3}, Lq4/p;->l([BI)I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    sget v3, Lp4/c0;->a:I

    .line 370
    .line 371
    iget-object v3, v7, Lv4/z;->e:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v3, [B

    .line 374
    .line 375
    iget-object v6, v0, Ly6/j;->e:Lp4/s;

    .line 376
    .line 377
    invoke-virtual {v6, v3, v2}, Lp4/s;->E([BI)V

    .line 378
    .line 379
    .line 380
    iget-object v2, v0, Ly6/j;->c:Lv2/e;

    .line 381
    .line 382
    iget-wide v10, v0, Ly6/j;->o:J

    .line 383
    .line 384
    invoke-virtual {v2, v10, v11, v6}, Lv2/e;->o(JLp4/s;)V

    .line 385
    .line 386
    .line 387
    :cond_f
    const/16 v2, 0xb2

    .line 388
    .line 389
    if-ne v8, v2, :cond_10

    .line 390
    .line 391
    iget-object v2, v1, Lp4/s;->a:[B

    .line 392
    .line 393
    add-int/lit8 v3, v5, 0x2

    .line 394
    .line 395
    aget-byte v2, v2, v3

    .line 396
    .line 397
    const/4 v3, 0x1

    .line 398
    if-ne v2, v3, :cond_11

    .line 399
    .line 400
    invoke-virtual {v7, v8}, Lv4/z;->e(I)V

    .line 401
    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_10
    const/4 v3, 0x1

    .line 405
    :cond_11
    :goto_9
    if-eqz v8, :cond_13

    .line 406
    .line 407
    const/16 v11, 0xb3

    .line 408
    .line 409
    if-ne v8, v11, :cond_12

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_12
    const/16 v2, 0xb8

    .line 413
    .line 414
    if-ne v8, v2, :cond_1a

    .line 415
    .line 416
    iput-boolean v3, v0, Ly6/j;->p:Z

    .line 417
    .line 418
    goto :goto_10

    .line 419
    :cond_13
    :goto_a
    sub-int v15, v21, v5

    .line 420
    .line 421
    iget-boolean v2, v0, Ly6/j;->q:Z

    .line 422
    .line 423
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    if-eqz v2, :cond_14

    .line 429
    .line 430
    iget-boolean v2, v0, Ly6/j;->k:Z

    .line 431
    .line 432
    if-eqz v2, :cond_14

    .line 433
    .line 434
    iget-wide v11, v0, Ly6/j;->o:J

    .line 435
    .line 436
    cmp-long v2, v11, v5

    .line 437
    .line 438
    if-eqz v2, :cond_14

    .line 439
    .line 440
    iget-boolean v13, v0, Ly6/j;->p:Z

    .line 441
    .line 442
    iget-wide v2, v0, Ly6/j;->i:J

    .line 443
    .line 444
    move-wide/from16 v18, v5

    .line 445
    .line 446
    iget-wide v5, v0, Ly6/j;->n:J

    .line 447
    .line 448
    sub-long/2addr v2, v5

    .line 449
    long-to-int v3, v2

    .line 450
    sub-int v14, v3, v15

    .line 451
    .line 452
    iget-object v10, v0, Ly6/j;->b:Lr5/h0;

    .line 453
    .line 454
    const/16 v16, 0x0

    .line 455
    .line 456
    invoke-interface/range {v10 .. v16}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 457
    .line 458
    .line 459
    goto :goto_b

    .line 460
    :cond_14
    move-wide/from16 v18, v5

    .line 461
    .line 462
    :goto_b
    iget-boolean v2, v0, Ly6/j;->j:Z

    .line 463
    .line 464
    if-eqz v2, :cond_16

    .line 465
    .line 466
    iget-boolean v2, v0, Ly6/j;->q:Z

    .line 467
    .line 468
    if-eqz v2, :cond_15

    .line 469
    .line 470
    goto :goto_c

    .line 471
    :cond_15
    const/4 v3, 0x1

    .line 472
    const/4 v11, 0x0

    .line 473
    goto :goto_e

    .line 474
    :cond_16
    :goto_c
    iget-wide v2, v0, Ly6/j;->i:J

    .line 475
    .line 476
    int-to-long v5, v15

    .line 477
    sub-long/2addr v2, v5

    .line 478
    iput-wide v2, v0, Ly6/j;->n:J

    .line 479
    .line 480
    iget-wide v2, v0, Ly6/j;->m:J

    .line 481
    .line 482
    cmp-long v5, v2, v18

    .line 483
    .line 484
    if-eqz v5, :cond_17

    .line 485
    .line 486
    goto :goto_d

    .line 487
    :cond_17
    iget-wide v2, v0, Ly6/j;->o:J

    .line 488
    .line 489
    cmp-long v5, v2, v18

    .line 490
    .line 491
    if-eqz v5, :cond_18

    .line 492
    .line 493
    iget-wide v5, v0, Ly6/j;->l:J

    .line 494
    .line 495
    add-long/2addr v2, v5

    .line 496
    goto :goto_d

    .line 497
    :cond_18
    move-wide/from16 v2, v18

    .line 498
    .line 499
    :goto_d
    iput-wide v2, v0, Ly6/j;->o:J

    .line 500
    .line 501
    const/4 v11, 0x0

    .line 502
    iput-boolean v11, v0, Ly6/j;->p:Z

    .line 503
    .line 504
    move-wide/from16 v2, v18

    .line 505
    .line 506
    iput-wide v2, v0, Ly6/j;->m:J

    .line 507
    .line 508
    const/4 v3, 0x1

    .line 509
    iput-boolean v3, v0, Ly6/j;->j:Z

    .line 510
    .line 511
    :goto_e
    if-nez v8, :cond_19

    .line 512
    .line 513
    const/4 v13, 0x1

    .line 514
    goto :goto_f

    .line 515
    :cond_19
    const/4 v13, 0x0

    .line 516
    :goto_f
    iput-boolean v13, v0, Ly6/j;->q:Z

    .line 517
    .line 518
    :cond_1a
    :goto_10
    move v2, v9

    .line 519
    move/from16 v3, v21

    .line 520
    .line 521
    goto/16 :goto_0
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

.method public final c(Lr5/q;Lm7/k0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lm7/k0;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lm7/k0;->d()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lm7/k0;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Ly6/j;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Lm7/k0;->d()V

    .line 14
    .line 15
    .line 16
    iget v0, p2, Lm7/k0;->c:I

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-interface {p1, v0, v1}, Lr5/q;->u(II)Lr5/h0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ly6/j;->b:Lr5/h0;

    .line 24
    .line 25
    iget-object v0, p0, Ly6/j;->c:Lv2/e;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lv2/e;->q(Lr5/q;Lm7/k0;)V

    .line 30
    .line 31
    .line 32
    :cond_0
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
.end method

.method public final d(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Ly6/j;->b:Lr5/h0;

    .line 2
    .line 3
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean v4, p0, Ly6/j;->p:Z

    .line 9
    .line 10
    iget-wide v0, p0, Ly6/j;->i:J

    .line 11
    .line 12
    iget-wide v2, p0, Ly6/j;->n:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    long-to-int v5, v0

    .line 16
    iget-object v1, p0, Ly6/j;->b:Lr5/h0;

    .line 17
    .line 18
    iget-wide v2, p0, Ly6/j;->o:J

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-interface/range {v1 .. v7}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 23
    .line 24
    .line 25
    :cond_0
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

.method public final e(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Ly6/j;->m:J

    .line 2
    .line 3
    return-void
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
