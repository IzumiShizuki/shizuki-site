.class public final Lx6/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/CharSequence;

.field public d:I

.field public e:F

.field public f:I

.field public g:I

.field public h:F

.field public i:I

.field public j:F

.field public k:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lx6/g;->a:J

    .line 7
    .line 8
    iput-wide v0, p0, Lx6/g;->b:J

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    iput v0, p0, Lx6/g;->d:I

    .line 12
    .line 13
    const v0, -0x800001

    .line 14
    .line 15
    .line 16
    iput v0, p0, Lx6/g;->e:F

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput v1, p0, Lx6/g;->f:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput v1, p0, Lx6/g;->g:I

    .line 23
    .line 24
    iput v0, p0, Lx6/g;->h:F

    .line 25
    .line 26
    const/high16 v0, -0x80000000

    .line 27
    .line 28
    iput v0, p0, Lx6/g;->i:I

    .line 29
    .line 30
    const/high16 v1, 0x3f800000    # 1.0f

    .line 31
    .line 32
    iput v1, p0, Lx6/g;->j:F

    .line 33
    .line 34
    iput v0, p0, Lx6/g;->k:I

    .line 35
    .line 36
    return-void
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


# virtual methods
.method public final a()Lo4/a;
    .locals 13

    .line 1
    iget v0, p0, Lx6/g;->h:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f000000    # 0.5f

    .line 5
    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const/4 v4, 0x5

    .line 9
    const/4 v5, 0x4

    .line 10
    const v6, -0x800001

    .line 11
    .line 12
    .line 13
    cmpl-float v7, v0, v6

    .line 14
    .line 15
    if-eqz v7, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget v0, p0, Lx6/g;->d:I

    .line 19
    .line 20
    if-eq v0, v5, :cond_2

    .line 21
    .line 22
    if-eq v0, v4, :cond_1

    .line 23
    .line 24
    const/high16 v0, 0x3f000000    # 0.5f

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_0
    iget v7, p0, Lx6/g;->i:I

    .line 32
    .line 33
    const/high16 v8, -0x80000000

    .line 34
    .line 35
    const/4 v9, 0x3

    .line 36
    const/4 v10, 0x2

    .line 37
    const/4 v11, 0x1

    .line 38
    if-eq v7, v8, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget v7, p0, Lx6/g;->d:I

    .line 42
    .line 43
    if-eq v7, v11, :cond_5

    .line 44
    .line 45
    if-eq v7, v9, :cond_4

    .line 46
    .line 47
    if-eq v7, v5, :cond_5

    .line 48
    .line 49
    if-eq v7, v4, :cond_4

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    const/4 v7, 0x2

    .line 54
    goto :goto_1

    .line 55
    :cond_5
    const/4 v7, 0x0

    .line 56
    :goto_1
    new-instance v8, Lo4/a;

    .line 57
    .line 58
    invoke-direct {v8}, Lo4/a;-><init>()V

    .line 59
    .line 60
    .line 61
    iget v12, p0, Lx6/g;->d:I

    .line 62
    .line 63
    if-eq v12, v11, :cond_8

    .line 64
    .line 65
    if-eq v12, v10, :cond_7

    .line 66
    .line 67
    if-eq v12, v9, :cond_6

    .line 68
    .line 69
    if-eq v12, v5, :cond_8

    .line 70
    .line 71
    if-eq v12, v4, :cond_6

    .line 72
    .line 73
    const-string v4, "WebvttCueParser"

    .line 74
    .line 75
    const-string v5, "Unknown textAlignment: "

    .line 76
    .line 77
    invoke-static {v12, v5, v4}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    goto :goto_2

    .line 82
    :cond_6
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_7
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_8
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 89
    .line 90
    :goto_2
    iput-object v4, v8, Lo4/a;->c:Landroid/text/Layout$Alignment;

    .line 91
    .line 92
    iget v4, p0, Lx6/g;->e:F

    .line 93
    .line 94
    iget v5, p0, Lx6/g;->f:I

    .line 95
    .line 96
    cmpl-float v9, v4, v6

    .line 97
    .line 98
    if-eqz v9, :cond_a

    .line 99
    .line 100
    if-nez v5, :cond_a

    .line 101
    .line 102
    cmpg-float v1, v4, v1

    .line 103
    .line 104
    if-ltz v1, :cond_9

    .line 105
    .line 106
    cmpl-float v1, v4, v3

    .line 107
    .line 108
    if-lez v1, :cond_a

    .line 109
    .line 110
    :cond_9
    :goto_3
    const/high16 v6, 0x3f800000    # 1.0f

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_a
    if-eqz v9, :cond_b

    .line 114
    .line 115
    move v6, v4

    .line 116
    goto :goto_4

    .line 117
    :cond_b
    if-nez v5, :cond_c

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_c
    :goto_4
    iput v6, v8, Lo4/a;->e:F

    .line 121
    .line 122
    iput v5, v8, Lo4/a;->f:I

    .line 123
    .line 124
    iget v1, p0, Lx6/g;->g:I

    .line 125
    .line 126
    iput v1, v8, Lo4/a;->g:I

    .line 127
    .line 128
    iput v0, v8, Lo4/a;->h:F

    .line 129
    .line 130
    iput v7, v8, Lo4/a;->i:I

    .line 131
    .line 132
    iget v1, p0, Lx6/g;->j:F

    .line 133
    .line 134
    if-eqz v7, :cond_10

    .line 135
    .line 136
    if-eq v7, v11, :cond_e

    .line 137
    .line 138
    if-ne v7, v10, :cond_d

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v0

    .line 151
    :cond_e
    const/high16 v4, 0x40000000    # 2.0f

    .line 152
    .line 153
    cmpg-float v2, v0, v2

    .line 154
    .line 155
    if-gtz v2, :cond_f

    .line 156
    .line 157
    mul-float v0, v0, v4

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_f
    sub-float/2addr v3, v0

    .line 161
    mul-float v0, v3, v4

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_10
    sub-float v0, v3, v0

    .line 165
    .line 166
    :goto_5
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iput v0, v8, Lo4/a;->l:F

    .line 171
    .line 172
    iget v0, p0, Lx6/g;->k:I

    .line 173
    .line 174
    iput v0, v8, Lo4/a;->p:I

    .line 175
    .line 176
    iget-object v0, p0, Lx6/g;->c:Ljava/lang/CharSequence;

    .line 177
    .line 178
    if-eqz v0, :cond_11

    .line 179
    .line 180
    iput-object v0, v8, Lo4/a;->a:Ljava/lang/CharSequence;

    .line 181
    .line 182
    :cond_11
    return-object v8
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
