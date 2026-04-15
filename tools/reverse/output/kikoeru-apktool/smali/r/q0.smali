.class public final Lr/q0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lr/w0;


# direct methods
.method public synthetic constructor <init>(Lr/w0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr/q0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lr/q0;->c:Lr/w0;

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
    .locals 10

    .line 1
    iget v0, p0, Lr/q0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p0, Lr/q0;->c:Lr/w0;

    .line 13
    .line 14
    iput-wide v0, p1, Lr/w0;->l:J

    .line 15
    .line 16
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object p1, p0, Lr/q0;->c:Lr/w0;

    .line 26
    .line 27
    iget-wide v2, p1, Lr/w0;->l:J

    .line 28
    .line 29
    sub-long v2, v0, v2

    .line 30
    .line 31
    iput-wide v0, p1, Lr/w0;->l:J

    .line 32
    .line 33
    long-to-double v0, v2

    .line 34
    iget v2, p1, Lr/w0;->p:F

    .line 35
    .line 36
    float-to-double v2, v2

    .line 37
    div-double/2addr v0, v2

    .line 38
    invoke-static {v0, v1}, Llc/b;->S(D)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iget-object v2, p1, Lr/w0;->m:Lo/g0;

    .line 43
    .line 44
    invoke-virtual {v2}, Lo/g0;->h()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    iget-object v3, v2, Lo/g0;->a:[Ljava/lang/Object;

    .line 51
    .line 52
    iget v4, v2, Lo/g0;->b:I

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    :goto_0
    if-ge v6, v4, :cond_0

    .line 57
    .line 58
    aget-object v7, v3, v6

    .line 59
    .line 60
    check-cast v7, Lr/p0;

    .line 61
    .line 62
    invoke-static {p1, v7, v0, v1}, Lr/w0;->C1(Lr/w0;Lr/p0;J)V

    .line 63
    .line 64
    .line 65
    const/4 v8, 0x1

    .line 66
    iput-boolean v8, v7, Lr/p0;->c:Z

    .line 67
    .line 68
    add-int/lit8 v6, v6, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v3, p1, Lr/w0;->e:Lr/q1;

    .line 72
    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    invoke-virtual {v3}, Lr/q1;->o()V

    .line 76
    .line 77
    .line 78
    :cond_1
    iget v3, v2, Lo/g0;->b:I

    .line 79
    .line 80
    iget-object v4, v2, Lo/g0;->a:[Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {v5, v3}, Lnh/b;->E(II)Loc/d;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    iget v7, v6, Loc/b;->a:I

    .line 87
    .line 88
    iget v6, v6, Loc/b;->b:I

    .line 89
    .line 90
    if-gt v7, v6, :cond_3

    .line 91
    .line 92
    :goto_1
    sub-int v8, v7, v5

    .line 93
    .line 94
    aget-object v9, v4, v7

    .line 95
    .line 96
    aput-object v9, v4, v8

    .line 97
    .line 98
    aget-object v8, v4, v7

    .line 99
    .line 100
    check-cast v8, Lr/p0;

    .line 101
    .line 102
    iget-boolean v8, v8, Lr/p0;->c:Z

    .line 103
    .line 104
    if-eqz v8, :cond_2

    .line 105
    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    :cond_2
    if-eq v7, v6, :cond_3

    .line 109
    .line 110
    add-int/lit8 v7, v7, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    sub-int v6, v3, v5

    .line 114
    .line 115
    invoke-static {v6, v3, v4}, Lvb/l;->p0(II[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget v3, v2, Lo/g0;->b:I

    .line 119
    .line 120
    sub-int/2addr v3, v5

    .line 121
    iput v3, v2, Lo/g0;->b:I

    .line 122
    .line 123
    :cond_4
    iget-object v2, p1, Lr/w0;->n:Lr/p0;

    .line 124
    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    iget-wide v3, p1, Lr/w0;->f:J

    .line 128
    .line 129
    iput-wide v3, v2, Lr/p0;->g:J

    .line 130
    .line 131
    invoke-static {p1, v2, v0, v1}, Lr/w0;->C1(Lr/w0;Lr/p0;J)V

    .line 132
    .line 133
    .line 134
    iget v0, v2, Lr/p0;->d:F

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lr/w0;->K1(F)V

    .line 137
    .line 138
    .line 139
    iget v0, v2, Lr/p0;->d:F

    .line 140
    .line 141
    const/high16 v1, 0x3f800000    # 1.0f

    .line 142
    .line 143
    cmpg-float v0, v0, v1

    .line 144
    .line 145
    if-nez v0, :cond_5

    .line 146
    .line 147
    const/4 v0, 0x0

    .line 148
    iput-object v0, p1, Lr/w0;->n:Lr/p0;

    .line 149
    .line 150
    :cond_5
    invoke-virtual {p1}, Lr/w0;->J1()V

    .line 151
    .line 152
    .line 153
    :cond_6
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 154
    .line 155
    return-object p1

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
