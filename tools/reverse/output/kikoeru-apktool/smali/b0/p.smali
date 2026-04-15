.class public final Lb0/p;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lg2/g1;


# direct methods
.method public synthetic constructor <init>(Lg2/g1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb0/p;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/p;->c:Lg2/g1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lb0/p;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg2/f1;

    .line 7
    .line 8
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    check-cast p1, Lg2/f1;

    .line 18
    .line 19
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    check-cast p1, Lg2/f1;

    .line 29
    .line 30
    invoke-virtual {p1}, Lg2/f1;->f()Lf3/m;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lf3/m;->a:Lf3/m;

    .line 35
    .line 36
    iget-object v2, p0, Lb0/p;->c:Lg2/g1;

    .line 37
    .line 38
    const-wide/16 v3, 0x0

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    if-eq v0, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lg2/f1;->g()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p1}, Lg2/f1;->g()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v1, v2, Lg2/g1;->a:I

    .line 56
    .line 57
    sub-int/2addr v0, v1

    .line 58
    long-to-int v1, v3

    .line 59
    sub-int/2addr v0, v1

    .line 60
    int-to-long v3, v0

    .line 61
    const/16 v0, 0x20

    .line 62
    .line 63
    shl-long/2addr v3, v0

    .line 64
    int-to-long v0, v1

    .line 65
    const-wide v7, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v0, v7

    .line 71
    or-long/2addr v0, v3

    .line 72
    invoke-static {p1, v2}, Lg2/f1;->b(Lg2/f1;Lg2/g1;)V

    .line 73
    .line 74
    .line 75
    iget-wide v3, v2, Lg2/g1;->e:J

    .line 76
    .line 77
    invoke-static {v0, v1, v3, v4}, Lf3/j;->d(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    invoke-virtual {v2, v0, v1, v5, v6}, Lg2/g1;->Y(JFLic/k;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    :goto_0
    invoke-static {p1, v2}, Lg2/f1;->b(Lg2/f1;Lg2/g1;)V

    .line 86
    .line 87
    .line 88
    iget-wide v0, v2, Lg2/g1;->e:J

    .line 89
    .line 90
    invoke-static {v3, v4, v0, v1}, Lf3/j;->d(JJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    invoke-virtual {v2, v0, v1, v5, v6}, Lg2/g1;->Y(JFLic/k;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 98
    .line 99
    return-object p1

    .line 100
    :pswitch_2
    check-cast p1, Lg2/f1;

    .line 101
    .line 102
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_3
    check-cast p1, Lg2/f1;

    .line 112
    .line 113
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 117
    .line 118
    .line 119
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 120
    .line 121
    return-object p1

    .line 122
    :pswitch_4
    check-cast p1, Lg2/f1;

    .line 123
    .line 124
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 125
    .line 126
    const/4 v1, 0x0

    .line 127
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 128
    .line 129
    .line 130
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 131
    .line 132
    return-object p1

    .line 133
    :pswitch_5
    check-cast p1, Lg2/f1;

    .line 134
    .line 135
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 139
    .line 140
    .line 141
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_6
    check-cast p1, Lg2/f1;

    .line 145
    .line 146
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 147
    .line 148
    const/4 v1, 0x0

    .line 149
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 150
    .line 151
    .line 152
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 153
    .line 154
    return-object p1

    .line 155
    :pswitch_7
    check-cast p1, Lg2/f1;

    .line 156
    .line 157
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 158
    .line 159
    const/4 v1, 0x0

    .line 160
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 161
    .line 162
    .line 163
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 164
    .line 165
    return-object p1

    .line 166
    :pswitch_8
    check-cast p1, Lg2/f1;

    .line 167
    .line 168
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 172
    .line 173
    .line 174
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 175
    .line 176
    return-object p1

    .line 177
    :pswitch_9
    check-cast p1, Lg2/f1;

    .line 178
    .line 179
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 183
    .line 184
    .line 185
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 186
    .line 187
    return-object p1

    .line 188
    :pswitch_a
    check-cast p1, Lg2/f1;

    .line 189
    .line 190
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 191
    .line 192
    const/4 v1, 0x0

    .line 193
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 194
    .line 195
    .line 196
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 197
    .line 198
    return-object p1

    .line 199
    :pswitch_b
    check-cast p1, Lg2/f1;

    .line 200
    .line 201
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 202
    .line 203
    const/4 v1, 0x0

    .line 204
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 205
    .line 206
    .line 207
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 208
    .line 209
    return-object p1

    .line 210
    :pswitch_c
    check-cast p1, Lg2/f1;

    .line 211
    .line 212
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 213
    .line 214
    const/4 v1, 0x0

    .line 215
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 216
    .line 217
    .line 218
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 219
    .line 220
    return-object p1

    .line 221
    :pswitch_d
    check-cast p1, Lg2/f1;

    .line 222
    .line 223
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 224
    .line 225
    const/4 v1, 0x0

    .line 226
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 227
    .line 228
    .line 229
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 230
    .line 231
    return-object p1

    .line 232
    :pswitch_e
    check-cast p1, Lg2/f1;

    .line 233
    .line 234
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 235
    .line 236
    const/4 v1, 0x0

    .line 237
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->l(Lg2/f1;Lg2/g1;II)V

    .line 238
    .line 239
    .line 240
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 241
    .line 242
    return-object p1

    .line 243
    :pswitch_f
    check-cast p1, Lg2/f1;

    .line 244
    .line 245
    iget-object v0, p0, Lb0/p;->c:Lg2/g1;

    .line 246
    .line 247
    const/4 v1, 0x0

    .line 248
    invoke-static {p1, v0, v1, v1}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 249
    .line 250
    .line 251
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 252
    .line 253
    return-object p1

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
