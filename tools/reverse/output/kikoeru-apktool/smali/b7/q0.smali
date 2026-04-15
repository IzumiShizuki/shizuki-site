.class public final Lb7/q0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lff/h;


# instance fields
.field public final a:J

.field public final b:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-static {v0}, Lp4/c;->c(Z)V

    .line 4
    iput p1, p0, Lb7/q0;->b:I

    .line 5
    iput-wide p2, p0, Lb7/q0;->a:J

    return-void
.end method

.method public synthetic constructor <init>(IZJ)V
    .locals 0

    .line 1
    iput p1, p0, Lb7/q0;->b:I

    iput-wide p3, p0, Lb7/q0;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JI)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lb7/q0;->a:J

    iput p3, p0, Lb7/q0;->b:I

    return-void
.end method

.method public static b(Lr5/o;Lp4/s;)Lb7/q0;
    .locals 3

    .line 1
    iget-object v0, p1, Lp4/s;->a:[B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p0, v0, v2, v1}, Lr5/o;->z([BII)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v2}, Lp4/s;->G(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lp4/s;->g()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {p1}, Lp4/s;->l()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    new-instance p1, Lb7/q0;

    .line 21
    .line 22
    invoke-direct {p1, p0, v2, v0, v1}, Lb7/q0;-><init>(IZJ)V

    .line 23
    .line 24
    .line 25
    return-object p1
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
.method public a()Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lb7/q0;->b:I

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :cond_1
    :goto_0
    return v0
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

.method public toInstant()Lff/d;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lff/d;->c:Lff/d;

    .line 4
    .line 5
    sget-object v1, Lff/d;->c:Lff/d;

    .line 6
    .line 7
    iget-wide v2, v1, Lff/d;->a:J

    .line 8
    .line 9
    iget-wide v4, v0, Lb7/q0;->a:J

    .line 10
    .line 11
    cmp-long v6, v4, v2

    .line 12
    .line 13
    if-ltz v6, :cond_5

    .line 14
    .line 15
    sget-object v2, Lff/d;->d:Lff/d;

    .line 16
    .line 17
    iget-wide v6, v2, Lff/d;->a:J

    .line 18
    .line 19
    cmp-long v3, v4, v6

    .line 20
    .line 21
    if-gtz v3, :cond_5

    .line 22
    .line 23
    iget v3, v0, Lb7/q0;->b:I

    .line 24
    .line 25
    int-to-long v6, v3

    .line 26
    const-wide/32 v8, 0x3b9aca00

    .line 27
    .line 28
    .line 29
    div-long v10, v6, v8

    .line 30
    .line 31
    xor-long v12, v6, v8

    .line 32
    .line 33
    const-wide/16 v14, 0x0

    .line 34
    .line 35
    cmp-long v3, v12, v14

    .line 36
    .line 37
    if-gez v3, :cond_0

    .line 38
    .line 39
    mul-long v12, v10, v8

    .line 40
    .line 41
    cmp-long v3, v12, v6

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    const-wide/16 v12, -0x1

    .line 46
    .line 47
    add-long/2addr v10, v12

    .line 48
    :cond_0
    add-long v12, v4, v10

    .line 49
    .line 50
    xor-long v16, v4, v12

    .line 51
    .line 52
    cmp-long v3, v16, v14

    .line 53
    .line 54
    if-gez v3, :cond_1

    .line 55
    .line 56
    xor-long/2addr v10, v4

    .line 57
    cmp-long v3, v10, v14

    .line 58
    .line 59
    if-ltz v3, :cond_1

    .line 60
    .line 61
    cmp-long v3, v4, v14

    .line 62
    .line 63
    if-lez v3, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const-wide v3, -0x701cefeb9bec00L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    cmp-long v5, v12, v3

    .line 72
    .line 73
    if-gez v5, :cond_3

    .line 74
    .line 75
    :cond_2
    return-object v1

    .line 76
    :cond_3
    const-wide v3, 0x701cd2fa9578ffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    cmp-long v1, v12, v3

    .line 82
    .line 83
    if-lez v1, :cond_4

    .line 84
    .line 85
    :goto_0
    return-object v2

    .line 86
    :cond_4
    rem-long/2addr v6, v8

    .line 87
    xor-long v1, v6, v8

    .line 88
    .line 89
    neg-long v3, v6

    .line 90
    or-long/2addr v3, v6

    .line 91
    and-long/2addr v1, v3

    .line 92
    const/16 v3, 0x3f

    .line 93
    .line 94
    shr-long/2addr v1, v3

    .line 95
    and-long/2addr v1, v8

    .line 96
    add-long/2addr v6, v1

    .line 97
    long-to-int v1, v6

    .line 98
    new-instance v2, Lff/d;

    .line 99
    .line 100
    invoke-direct {v2, v12, v13, v1}, Lff/d;-><init>(JI)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :cond_5
    new-instance v1, Lff/e;

    .line 105
    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v3, "The parsed date is outside the range representable by Instant (Unix epoch second "

    .line 109
    .line 110
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v3, 0x29

    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const/4 v3, 0x0

    .line 126
    invoke-direct {v1, v3, v2}, Lff/e;-><init>(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1
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
