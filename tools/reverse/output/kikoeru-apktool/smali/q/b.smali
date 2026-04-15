.class public abstract Lq/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:[F


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    const/16 v0, 0x65

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    sput-object v1, Lq/b;->a:[F

    .line 6
    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    :goto_0
    const/16 v5, 0x64

    .line 14
    .line 15
    const/high16 v6, 0x3f800000    # 1.0f

    .line 16
    .line 17
    if-ge v4, v5, :cond_4

    .line 18
    .line 19
    int-to-float v7, v4

    .line 20
    int-to-float v5, v5

    .line 21
    div-float/2addr v7, v5

    .line 22
    const/high16 v5, 0x3f800000    # 1.0f

    .line 23
    .line 24
    :goto_1
    sub-float v8, v5, v2

    .line 25
    .line 26
    const/high16 v9, 0x40000000    # 2.0f

    .line 27
    .line 28
    div-float/2addr v8, v9

    .line 29
    add-float/2addr v8, v2

    .line 30
    const/high16 v10, 0x40400000    # 3.0f

    .line 31
    .line 32
    mul-float v11, v8, v10

    .line 33
    .line 34
    sub-float v12, v6, v8

    .line 35
    .line 36
    mul-float v11, v11, v12

    .line 37
    .line 38
    const v13, 0x3e333333    # 0.175f

    .line 39
    .line 40
    .line 41
    mul-float v14, v12, v13

    .line 42
    .line 43
    const v15, 0x3eb33334    # 0.35000002f

    .line 44
    .line 45
    .line 46
    mul-float v16, v8, v15

    .line 47
    .line 48
    add-float v16, v16, v14

    .line 49
    .line 50
    mul-float v16, v16, v11

    .line 51
    .line 52
    mul-float v14, v8, v8

    .line 53
    .line 54
    mul-float v14, v14, v8

    .line 55
    .line 56
    add-float v16, v16, v14

    .line 57
    .line 58
    sub-float v17, v16, v7

    .line 59
    .line 60
    const/high16 v18, 0x3f800000    # 1.0f

    .line 61
    .line 62
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    const/high16 v17, 0x40000000    # 2.0f

    .line 67
    .line 68
    const/high16 v19, 0x40400000    # 3.0f

    .line 69
    .line 70
    float-to-double v9, v6

    .line 71
    const-wide v20, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    cmpg-double v6, v9, v20

    .line 77
    .line 78
    if-ltz v6, :cond_1

    .line 79
    .line 80
    cmpl-float v6, v16, v7

    .line 81
    .line 82
    if-lez v6, :cond_0

    .line 83
    .line 84
    move v5, v8

    .line 85
    :goto_2
    const/high16 v6, 0x3f800000    # 1.0f

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_0
    move v2, v8

    .line 89
    goto :goto_2

    .line 90
    :cond_1
    const/high16 v5, 0x3f000000    # 0.5f

    .line 91
    .line 92
    mul-float v12, v12, v5

    .line 93
    .line 94
    add-float/2addr v12, v8

    .line 95
    mul-float v12, v12, v11

    .line 96
    .line 97
    add-float/2addr v12, v14

    .line 98
    aput v12, v1, v4

    .line 99
    .line 100
    const/high16 v6, 0x3f800000    # 1.0f

    .line 101
    .line 102
    :goto_3
    sub-float v8, v6, v3

    .line 103
    .line 104
    div-float v8, v8, v17

    .line 105
    .line 106
    add-float/2addr v8, v3

    .line 107
    mul-float v10, v8, v19

    .line 108
    .line 109
    sub-float v9, v18, v8

    .line 110
    .line 111
    mul-float v10, v10, v9

    .line 112
    .line 113
    mul-float v11, v9, v5

    .line 114
    .line 115
    add-float/2addr v11, v8

    .line 116
    mul-float v11, v11, v10

    .line 117
    .line 118
    mul-float v12, v8, v8

    .line 119
    .line 120
    mul-float v12, v12, v8

    .line 121
    .line 122
    add-float/2addr v11, v12

    .line 123
    sub-float v14, v11, v7

    .line 124
    .line 125
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    move/from16 v22, v6

    .line 130
    .line 131
    float-to-double v5, v14

    .line 132
    cmpg-double v14, v5, v20

    .line 133
    .line 134
    if-ltz v14, :cond_3

    .line 135
    .line 136
    cmpl-float v5, v11, v7

    .line 137
    .line 138
    if-lez v5, :cond_2

    .line 139
    .line 140
    move v6, v8

    .line 141
    :goto_4
    const/high16 v5, 0x3f000000    # 0.5f

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_2
    move v3, v8

    .line 145
    move/from16 v6, v22

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_3
    mul-float v9, v9, v13

    .line 149
    .line 150
    mul-float v8, v8, v15

    .line 151
    .line 152
    add-float/2addr v8, v9

    .line 153
    mul-float v8, v8, v10

    .line 154
    .line 155
    add-float/2addr v8, v12

    .line 156
    aput v8, v0, v4

    .line 157
    .line 158
    add-int/lit8 v4, v4, 0x1

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_4
    const/high16 v18, 0x3f800000    # 1.0f

    .line 163
    .line 164
    aput v18, v0, v5

    .line 165
    .line 166
    aput v18, v1, v5

    .line 167
    .line 168
    return-void
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

.method public static a(F)Lq/a;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, Lnh/b;->j(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/16 v2, 0x64

    .line 9
    .line 10
    int-to-float v3, v2

    .line 11
    mul-float v4, v3, p0

    .line 12
    .line 13
    float-to-int v4, v4

    .line 14
    if-ge v4, v2, :cond_0

    .line 15
    .line 16
    int-to-float v0, v4

    .line 17
    div-float/2addr v0, v3

    .line 18
    add-int/lit8 v1, v4, 0x1

    .line 19
    .line 20
    int-to-float v2, v1

    .line 21
    div-float/2addr v2, v3

    .line 22
    sget-object v3, Lq/b;->a:[F

    .line 23
    .line 24
    aget v4, v3, v4

    .line 25
    .line 26
    aget v1, v3, v1

    .line 27
    .line 28
    sub-float/2addr v1, v4

    .line 29
    sub-float/2addr v2, v0

    .line 30
    div-float/2addr v1, v2

    .line 31
    sub-float/2addr p0, v0

    .line 32
    mul-float p0, p0, v1

    .line 33
    .line 34
    add-float/2addr p0, v4

    .line 35
    move v0, v1

    .line 36
    move v1, p0

    .line 37
    :cond_0
    new-instance p0, Lq/a;

    .line 38
    .line 39
    invoke-direct {p0, v1, v0}, Lq/a;-><init>(FF)V

    .line 40
    .line 41
    .line 42
    return-object p0
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
