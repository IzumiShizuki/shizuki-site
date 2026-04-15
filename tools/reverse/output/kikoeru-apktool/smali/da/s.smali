.class public final synthetic Lda/s;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhf/y;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lhf/y;JLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Lda/s;->a:I

    iput-object p1, p0, Lda/s;->b:Lhf/y;

    iput-wide p2, p0, Lda/s;->c:J

    iput-object p4, p0, Lda/s;->d:Ljava/lang/Object;

    iput-object p5, p0, Lda/s;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhf/y;Lda/b1;JLx0/w0;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lda/s;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/s;->b:Lhf/y;

    iput-object p2, p0, Lda/s;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lda/s;->c:J

    iput-object p5, p0, Lda/s;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lhf/y;Lda/m0;Lfg/f;J)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lda/s;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/s;->b:Lhf/y;

    iput-object p2, p0, Lda/s;->d:Ljava/lang/Object;

    iput-object p3, p0, Lda/s;->e:Ljava/lang/Object;

    iput-wide p4, p0, Lda/s;->c:J

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lda/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/s;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lda/b1;

    .line 10
    .line 11
    iget-object v0, p0, Lda/s;->e:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Lx0/w0;

    .line 15
    .line 16
    new-instance v1, Lb9/a;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x5

    .line 20
    iget-wide v3, p0, Lda/s;->c:J

    .line 21
    .line 22
    invoke-direct/range {v1 .. v7}, Lb9/a;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lyb/c;I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    iget-object v2, p0, Lda/s;->b:Lhf/y;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v2, v3, v3, v1, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    iget-object v0, p0, Lda/s;->d:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, Lx0/n2;

    .line 39
    .line 40
    iget-object v0, p0, Lda/s;->e:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v5, v0

    .line 43
    check-cast v5, Lx0/w0;

    .line 44
    .line 45
    new-instance v1, Lb9/a;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x3

    .line 49
    iget-wide v2, p0, Lda/s;->c:J

    .line 50
    .line 51
    invoke-direct/range {v1 .. v7}, Lb9/a;-><init>(JLjava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    iget-object v2, p0, Lda/s;->b:Lhf/y;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static {v2, v3, v3, v1, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_1
    iget-object v0, p0, Lda/s;->d:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v4, v0

    .line 65
    check-cast v4, Lbg/p;

    .line 66
    .line 67
    iget-object v0, p0, Lda/s;->e:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v5, v0

    .line 70
    check-cast v5, Lda/b1;

    .line 71
    .line 72
    new-instance v1, Lb9/a;

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v7, 0x4

    .line 76
    iget-wide v2, p0, Lda/s;->c:J

    .line 77
    .line 78
    invoke-direct/range {v1 .. v7}, Lb9/a;-><init>(JLjava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x3

    .line 82
    iget-object v2, p0, Lda/s;->b:Lhf/y;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static {v2, v3, v3, v1, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_2
    iget-object v0, p0, Lda/s;->d:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v2, v0

    .line 92
    check-cast v2, Lda/m0;

    .line 93
    .line 94
    iget-object v0, p0, Lda/s;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lfg/f;

    .line 97
    .line 98
    invoke-virtual {v0}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    xor-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Lda/m;

    .line 118
    .line 119
    const/4 v6, 0x3

    .line 120
    iget-wide v3, p0, Lda/s;->c:J

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    invoke-direct/range {v1 .. v6}, Lda/m;-><init>(Lda/m0;JLyb/c;I)V

    .line 124
    .line 125
    .line 126
    const/4 v0, 0x3

    .line 127
    iget-object v3, p0, Lda/s;->b:Lhf/y;

    .line 128
    .line 129
    invoke-static {v3, v5, v5, v1, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 130
    .line 131
    .line 132
    const/4 v0, 0x0

    .line 133
    invoke-virtual {v2, v0}, Lda/m0;->c0(Z)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
