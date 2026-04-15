.class public final Lm0/i8;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Lic/n;


# direct methods
.method public synthetic constructor <init>(JLic/n;I)V
    .locals 0

    .line 1
    iput p4, p0, Lm0/i8;->a:I

    .line 2
    .line 3
    iput-wide p1, p0, Lm0/i8;->b:J

    .line 4
    .line 5
    iput-object p3, p0, Lm0/i8;->c:Lic/n;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lm0/i8;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    sget-object p2, Lm0/h1;->a:Lx0/z;

    .line 31
    .line 32
    iget-wide v0, p0, Lm0/i8;->b:J

    .line 33
    .line 34
    invoke-static {v0, v1}, Lq1/q;->d(J)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p2, v0}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance v0, Lm0/g0;

    .line 47
    .line 48
    iget-object v1, p0, Lm0/i8;->c:Lic/n;

    .line 49
    .line 50
    check-cast v1, Lf1/f;

    .line 51
    .line 52
    const/4 v2, 0x3

    .line 53
    invoke-direct {v0, v1, v2}, Lm0/g0;-><init>(Lf1/f;I)V

    .line 54
    .line 55
    .line 56
    const v1, -0x3fe9e356

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/16 v1, 0x38

    .line 64
    .line 65
    invoke-static {p2, v0, p1, v1}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 70
    .line 71
    .line 72
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_0
    move-object v4, p1

    .line 76
    check-cast v4, Lx0/o;

    .line 77
    .line 78
    check-cast p2, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    and-int/lit8 p2, p1, 0x3

    .line 85
    .line 86
    const/4 v0, 0x2

    .line 87
    const/4 v1, 0x1

    .line 88
    if-eq p2, v0, :cond_2

    .line 89
    .line 90
    const/4 p2, 0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const/4 p2, 0x0

    .line 93
    :goto_2
    and-int/2addr p1, v1

    .line 94
    invoke-virtual {v4, p1, p2}, Lx0/o;->N(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x6

    .line 102
    iget-wide v0, p0, Lm0/i8;->b:J

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    iget-object v3, p0, Lm0/i8;->c:Lic/n;

    .line 106
    .line 107
    invoke-static/range {v0 .. v6}, Lm0/m8;->b(JLt2/l0;Lic/n;Lx0/o;II)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    invoke-virtual {v4}, Lx0/o;->Q()V

    .line 112
    .line 113
    .line 114
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 115
    .line 116
    return-object p1

    .line 117
    :pswitch_1
    move-object v4, p1

    .line 118
    check-cast v4, Lx0/o;

    .line 119
    .line 120
    check-cast p2, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    and-int/lit8 p2, p1, 0x3

    .line 127
    .line 128
    const/4 v0, 0x2

    .line 129
    const/4 v1, 0x1

    .line 130
    if-eq p2, v0, :cond_4

    .line 131
    .line 132
    const/4 p2, 0x1

    .line 133
    goto :goto_4

    .line 134
    :cond_4
    const/4 p2, 0x0

    .line 135
    :goto_4
    and-int/2addr p1, v1

    .line 136
    invoke-virtual {v4, p1, p2}, Lx0/o;->N(IZ)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_5

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x6

    .line 144
    iget-wide v0, p0, Lm0/i8;->b:J

    .line 145
    .line 146
    const/4 v2, 0x0

    .line 147
    iget-object v3, p0, Lm0/i8;->c:Lic/n;

    .line 148
    .line 149
    invoke-static/range {v0 .. v6}, Lm0/m8;->b(JLt2/l0;Lic/n;Lx0/o;II)V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_5
    invoke-virtual {v4}, Lx0/o;->Q()V

    .line 154
    .line 155
    .line 156
    :goto_5
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 157
    .line 158
    return-object p1

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
