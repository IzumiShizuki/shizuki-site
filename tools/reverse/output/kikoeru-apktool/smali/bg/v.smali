.class public final Lbg/v;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# static fields
.field public static final c:Lbg/v;

.field public static final d:Lbg/v;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbg/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lbg/v;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbg/v;->c:Lbg/v;

    .line 9
    .line 10
    new-instance v0, Lbg/v;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lbg/v;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lbg/v;->d:Lbg/v;

    .line 17
    .line 18
    return-void
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

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lbg/v;->b:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbg/v;->b:I

    .line 4
    .line 5
    const-class v2, Lbg/j0;

    .line 6
    .line 7
    const-class v3, Lbg/g0;

    .line 8
    .line 9
    const-class v4, Lbg/d0;

    .line 10
    .line 11
    const-class v5, Lbg/z;

    .line 12
    .line 13
    const/4 v6, 0x3

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x4

    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    new-instance v11, Lsf/f;

    .line 22
    .line 23
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 24
    .line 25
    const-class v12, Lbg/k0;

    .line 26
    .line 27
    invoke-virtual {v1, v12}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 28
    .line 29
    .line 30
    move-result-object v13

    .line 31
    invoke-virtual {v1, v5}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v1, v4}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v1, v3}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v2}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-array v14, v9, [Lpc/c;

    .line 48
    .line 49
    aput-object v5, v14, v10

    .line 50
    .line 51
    aput-object v4, v14, v8

    .line 52
    .line 53
    aput-object v3, v14, v7

    .line 54
    .line 55
    aput-object v1, v14, v6

    .line 56
    .line 57
    new-array v15, v9, [Lsf/a;

    .line 58
    .line 59
    sget-object v1, Lbg/x;->a:Lbg/x;

    .line 60
    .line 61
    aput-object v1, v15, v10

    .line 62
    .line 63
    sget-object v1, Lbg/b0;->a:Lbg/b0;

    .line 64
    .line 65
    aput-object v1, v15, v8

    .line 66
    .line 67
    sget-object v1, Lbg/e0;->a:Lbg/e0;

    .line 68
    .line 69
    aput-object v1, v15, v7

    .line 70
    .line 71
    sget-object v1, Lbg/h0;->a:Lbg/h0;

    .line 72
    .line 73
    aput-object v1, v15, v6

    .line 74
    .line 75
    new-array v1, v10, [Ljava/lang/annotation/Annotation;

    .line 76
    .line 77
    const-string v12, "loli.ball.asmr.bean.RemoteFile.File"

    .line 78
    .line 79
    move-object/from16 v16, v1

    .line 80
    .line 81
    invoke-direct/range {v11 .. v16}, Lsf/f;-><init>(Ljava/lang/String;Lpc/c;[Lpc/c;[Lsf/a;[Ljava/lang/annotation/Annotation;)V

    .line 82
    .line 83
    .line 84
    return-object v11

    .line 85
    :pswitch_0
    new-instance v1, Lsf/f;

    .line 86
    .line 87
    sget-object v11, Ljc/z;->a:Ljc/a0;

    .line 88
    .line 89
    const-class v12, Lbg/o0;

    .line 90
    .line 91
    invoke-virtual {v11, v12}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    invoke-virtual {v11, v5}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v11, v4}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v11, v3}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v11, v2}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-class v13, Lbg/n0;

    .line 112
    .line 113
    invoke-virtual {v11, v13}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    const/4 v13, 0x5

    .line 118
    move-object v14, v4

    .line 119
    new-array v4, v13, [Lpc/c;

    .line 120
    .line 121
    aput-object v5, v4, v10

    .line 122
    .line 123
    aput-object v14, v4, v8

    .line 124
    .line 125
    aput-object v3, v4, v7

    .line 126
    .line 127
    aput-object v2, v4, v6

    .line 128
    .line 129
    aput-object v11, v4, v9

    .line 130
    .line 131
    new-array v5, v13, [Lsf/a;

    .line 132
    .line 133
    sget-object v2, Lbg/x;->a:Lbg/x;

    .line 134
    .line 135
    aput-object v2, v5, v10

    .line 136
    .line 137
    sget-object v2, Lbg/b0;->a:Lbg/b0;

    .line 138
    .line 139
    aput-object v2, v5, v8

    .line 140
    .line 141
    sget-object v2, Lbg/e0;->a:Lbg/e0;

    .line 142
    .line 143
    aput-object v2, v5, v7

    .line 144
    .line 145
    sget-object v2, Lbg/h0;->a:Lbg/h0;

    .line 146
    .line 147
    aput-object v2, v5, v6

    .line 148
    .line 149
    sget-object v2, Lbg/l0;->a:Lbg/l0;

    .line 150
    .line 151
    aput-object v2, v5, v9

    .line 152
    .line 153
    new-array v6, v10, [Ljava/lang/annotation/Annotation;

    .line 154
    .line 155
    const-string v2, "loli.ball.asmr.bean.RemoteFile"

    .line 156
    .line 157
    move-object v3, v12

    .line 158
    invoke-direct/range {v1 .. v6}, Lsf/f;-><init>(Ljava/lang/String;Lpc/c;[Lpc/c;[Lsf/a;[Ljava/lang/annotation/Annotation;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
