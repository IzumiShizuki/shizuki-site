.class public final synthetic Lba/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhf/y;


# direct methods
.method public synthetic constructor <init>(Lhf/y;I)V
    .locals 0

    .line 1
    iput p2, p0, Lba/d;->a:I

    packed-switch p2, :pswitch_data_0

    sget-object p2, Lj9/u;->a:Lj9/u;

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/d;->b:Lhf/y;

    return-void

    :goto_1
    :pswitch_0
    sget-object p2, Lfa/v;->a:Lfa/v;

    goto :goto_0

    :pswitch_1
    sget-object p2, Lj9/u;->a:Lj9/u;

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Lhf/y;IZ)V
    .locals 0

    .line 2
    iput p2, p0, Lba/d;->a:I

    iput-object p1, p0, Lba/d;->b:Lhf/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lba/d;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x7

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    sget-object v5, Lub/a0;->a:Lub/a0;

    .line 8
    .line 9
    iget-object v6, p0, Lba/d;->b:Lhf/y;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const v0, 0x7f0c0060

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Laa/e;

    .line 22
    .line 23
    invoke-direct {v1, v6, v2}, Laa/e;-><init>(Lhf/y;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lka/j;->b(Ljava/lang/String;Lic/k;)V

    .line 27
    .line 28
    .line 29
    return-object v5

    .line 30
    :pswitch_0
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 31
    .line 32
    sget-object v0, Lpf/d;->c:Lpf/d;

    .line 33
    .line 34
    new-instance v2, La0/c0;

    .line 35
    .line 36
    const/16 v3, 0xf

    .line 37
    .line 38
    invoke-direct {v2, v1, v4, v3}, La0/c0;-><init>(ILyb/c;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v6, v0, v4, v2, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 42
    .line 43
    .line 44
    return-object v5

    .line 45
    :pswitch_1
    const v0, 0x7f0c0058

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Laa/e;

    .line 53
    .line 54
    const/4 v2, 0x4

    .line 55
    invoke-direct {v1, v6, v2}, Laa/e;-><init>(Lhf/y;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Lka/j;->b(Ljava/lang/String;Lic/k;)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :pswitch_2
    const v0, 0x7f0c005d

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, Laa/e;

    .line 70
    .line 71
    invoke-direct {v1, v6, v3}, Laa/e;-><init>(Lhf/y;I)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lka/j;->b(Ljava/lang/String;Lic/k;)V

    .line 75
    .line 76
    .line 77
    return-object v5

    .line 78
    :pswitch_3
    sget-object v0, Lfa/v;->a:Lfa/v;

    .line 79
    .line 80
    new-instance v0, Lba/t;

    .line 81
    .line 82
    const/16 v1, 0x9

    .line 83
    .line 84
    invoke-direct {v0, v1, v4}, Lba/t;-><init>(ILyb/c;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v6, v4, v4, v0, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 88
    .line 89
    .line 90
    return-object v5

    .line 91
    :pswitch_4
    sget-object v0, Lj9/u;->a:Lj9/u;

    .line 92
    .line 93
    sget-object v0, Lfa/v;->a:Lfa/v;

    .line 94
    .line 95
    sget-object v0, Lj9/u;->c:Lx0/e1;

    .line 96
    .line 97
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_0

    .line 108
    .line 109
    const v0, 0x7f0c0156

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    const/4 v10, 0x0

    .line 117
    const/16 v11, 0x1ff

    .line 118
    .line 119
    const-wide/16 v7, 0x0

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    invoke-static/range {v6 .. v11}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    new-instance v0, Lba/t;

    .line 127
    .line 128
    const/16 v1, 0x8

    .line 129
    .line 130
    invoke-direct {v0, v1, v4}, Lba/t;-><init>(ILyb/c;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v6, v4, v4, v0, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 134
    .line 135
    .line 136
    :goto_0
    return-object v5

    .line 137
    :pswitch_5
    sget-object v0, Lj9/u;->a:Lj9/u;

    .line 138
    .line 139
    new-instance v0, Lba/t;

    .line 140
    .line 141
    invoke-direct {v0, v2, v4}, Lba/t;-><init>(ILyb/c;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v6, v4, v4, v0, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 145
    .line 146
    .line 147
    return-object v5

    .line 148
    :pswitch_6
    new-instance v0, Lba/t;

    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    invoke-direct {v0, v1, v4, v2}, Lba/t;-><init>(ILyb/c;I)V

    .line 152
    .line 153
    .line 154
    invoke-static {v6, v4, v4, v0, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 155
    .line 156
    .line 157
    return-object v5

    .line 158
    :pswitch_7
    const v0, 0x7f0c005f

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v1, Laa/e;

    .line 166
    .line 167
    const/4 v2, 0x1

    .line 168
    invoke-direct {v1, v6, v2}, Laa/e;-><init>(Lhf/y;I)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Lka/j;->b(Ljava/lang/String;Lic/k;)V

    .line 172
    .line 173
    .line 174
    return-object v5

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
