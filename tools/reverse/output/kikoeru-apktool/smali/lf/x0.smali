.class public final Llf/x0;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public e:I

.field public synthetic f:Llf/g;

.field public synthetic g:I

.field public final synthetic h:Llf/y0;


# direct methods
.method public constructor <init>(Llf/y0;Lyb/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llf/x0;->h:Llf/y0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    .line 5
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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Llf/g;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Lyb/c;

    .line 10
    .line 11
    new-instance v0, Llf/x0;

    .line 12
    .line 13
    iget-object v1, p0, Llf/x0;->h:Llf/y0;

    .line 14
    .line 15
    invoke-direct {v0, v1, p3}, Llf/x0;-><init>(Llf/y0;Lyb/c;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, Llf/x0;->f:Llf/g;

    .line 19
    .line 20
    iput p2, v0, Llf/x0;->g:I

    .line 21
    .line 22
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Llf/x0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Llf/x0;->e:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    sget-object v6, Lzb/a;->a:Lzb/a;

    .line 9
    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    if-eq v0, v5, :cond_4

    .line 13
    .line 14
    if-eq v0, v4, :cond_3

    .line 15
    .line 16
    if-eq v0, v3, :cond_2

    .line 17
    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v0, p0, Llf/x0;->f:Llf/g;

    .line 32
    .line 33
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_2
    iget-object v0, p0, Llf/x0;->f:Llf/g;

    .line 38
    .line 39
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    iget-object v0, p0, Llf/x0;->f:Llf/g;

    .line 44
    .line 45
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    :goto_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_5

    .line 53
    :cond_5
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Llf/x0;->f:Llf/g;

    .line 57
    .line 58
    iget p1, p0, Llf/x0;->g:I

    .line 59
    .line 60
    if-lez p1, :cond_6

    .line 61
    .line 62
    iput v5, p0, Llf/x0;->e:I

    .line 63
    .line 64
    sget-object p1, Llf/r0;->a:Llf/r0;

    .line 65
    .line 66
    invoke-interface {v0, p1, p0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v6, :cond_a

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_6
    iget-object p1, p0, Llf/x0;->h:Llf/y0;

    .line 74
    .line 75
    iget-wide v7, p1, Llf/y0;->a:J

    .line 76
    .line 77
    iput-object v0, p0, Llf/x0;->f:Llf/g;

    .line 78
    .line 79
    iput v4, p0, Llf/x0;->e:I

    .line 80
    .line 81
    invoke-static {v7, v8, p0}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v6, :cond_7

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_7
    :goto_1
    iput-object v0, p0, Llf/x0;->f:Llf/g;

    .line 89
    .line 90
    iput v3, p0, Llf/x0;->e:I

    .line 91
    .line 92
    sget-object p1, Llf/r0;->b:Llf/r0;

    .line 93
    .line 94
    invoke-interface {v0, p1, p0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v6, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    :goto_2
    iput-object v0, p0, Llf/x0;->f:Llf/g;

    .line 102
    .line 103
    iput v2, p0, Llf/x0;->e:I

    .line 104
    .line 105
    const-wide v2, 0x7fffffffffffffffL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v2, v3, p0}, Lhf/a0;->l(JLyb/c;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v6, :cond_9

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_9
    :goto_3
    const/4 p1, 0x0

    .line 118
    iput-object p1, p0, Llf/x0;->f:Llf/g;

    .line 119
    .line 120
    iput v1, p0, Llf/x0;->e:I

    .line 121
    .line 122
    sget-object p1, Llf/r0;->c:Llf/r0;

    .line 123
    .line 124
    invoke-interface {v0, p1, p0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v6, :cond_a

    .line 129
    .line 130
    :goto_4
    return-object v6

    .line 131
    :cond_a
    :goto_5
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 132
    .line 133
    return-object p1
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
