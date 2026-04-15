.class public final La0/k;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lb0/n0;


# direct methods
.method public synthetic constructor <init>(Lb0/n0;II)V
    .locals 0

    .line 1
    iput p3, p0, La0/k;->b:I

    .line 2
    .line 3
    iput-object p1, p0, La0/k;->d:Lb0/n0;

    .line 4
    .line 5
    iput p2, p0, La0/k;->c:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
    .locals 4

    .line 1
    iget v0, p0, La0/k;->b:I

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
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    and-int/2addr p2, v3

    .line 25
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iget-object p2, p0, La0/k;->d:Lb0/n0;

    .line 32
    .line 33
    check-cast p2, Ld0/t;

    .line 34
    .line 35
    iget-object p2, p2, Ld0/t;->b:Lb0/g0;

    .line 36
    .line 37
    invoke-virtual {p2}, Lb0/g0;->j()Lah/j;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget v0, p0, La0/k;->c:I

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Lah/j;->p(I)Lb0/i;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget v1, p2, Lb0/i;->a:I

    .line 48
    .line 49
    sub-int/2addr v0, v1

    .line 50
    iget-object p2, p2, Lb0/i;->c:Lb0/t;

    .line 51
    .line 52
    check-cast p2, Ld0/n;

    .line 53
    .line 54
    iget-object p2, p2, Ld0/n;->b:Lic/p;

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, Ld0/x;->a:Ld0/x;

    .line 65
    .line 66
    invoke-interface {p2, v2, v0, p1, v1}, Lic/p;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_0
    check-cast p1, Lx0/o;

    .line 77
    .line 78
    check-cast p2, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    and-int/lit8 v0, p2, 0x3

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    const/4 v2, 0x1

    .line 88
    if-eq v0, v1, :cond_2

    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const/4 v0, 0x0

    .line 93
    :goto_2
    and-int/2addr p2, v2

    .line 94
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_3

    .line 99
    .line 100
    iget-object p2, p0, La0/k;->d:Lb0/n0;

    .line 101
    .line 102
    check-cast p2, Lc0/g;

    .line 103
    .line 104
    iget-object p2, p2, Lc0/g;->b:Lc0/f;

    .line 105
    .line 106
    iget-object p2, p2, Lc0/f;->c:Lah/j;

    .line 107
    .line 108
    iget v0, p0, La0/k;->c:I

    .line 109
    .line 110
    invoke-virtual {p2, v0}, Lah/j;->p(I)Lb0/i;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    iget v1, p2, Lb0/i;->a:I

    .line 115
    .line 116
    sub-int/2addr v0, v1

    .line 117
    iget-object p2, p2, Lb0/i;->c:Lb0/t;

    .line 118
    .line 119
    check-cast p2, Lc0/d;

    .line 120
    .line 121
    iget-object p2, p2, Lc0/d;->d:Lf1/f;

    .line 122
    .line 123
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/4 v1, 0x6

    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v2, Lc0/h;->a:Lc0/h;

    .line 133
    .line 134
    invoke-virtual {p2, v2, v0, p1, v1}, Lf1/f;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 139
    .line 140
    .line 141
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_1
    check-cast p1, Lx0/o;

    .line 145
    .line 146
    check-cast p2, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    and-int/lit8 v0, p2, 0x3

    .line 153
    .line 154
    const/4 v1, 0x2

    .line 155
    const/4 v2, 0x0

    .line 156
    const/4 v3, 0x1

    .line 157
    if-eq v0, v1, :cond_4

    .line 158
    .line 159
    const/4 v0, 0x1

    .line 160
    goto :goto_4

    .line 161
    :cond_4
    const/4 v0, 0x0

    .line 162
    :goto_4
    and-int/2addr p2, v3

    .line 163
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-eqz p2, :cond_5

    .line 168
    .line 169
    iget-object p2, p0, La0/k;->d:Lb0/n0;

    .line 170
    .line 171
    check-cast p2, La0/l;

    .line 172
    .line 173
    iget-object v0, p2, La0/l;->b:La0/j;

    .line 174
    .line 175
    iget-object v0, v0, La0/j;->c:Lah/j;

    .line 176
    .line 177
    iget v1, p0, La0/k;->c:I

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Lah/j;->p(I)Lb0/i;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget v3, v0, Lb0/i;->a:I

    .line 184
    .line 185
    sub-int/2addr v1, v3

    .line 186
    iget-object v0, v0, Lb0/i;->c:Lb0/t;

    .line 187
    .line 188
    check-cast v0, La0/g;

    .line 189
    .line 190
    iget-object v0, v0, La0/g;->c:Lf1/f;

    .line 191
    .line 192
    iget-object p2, p2, La0/l;->c:La0/d;

    .line 193
    .line 194
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v0, p2, v1, p1, v2}, Lf1/f;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_5
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 207
    .line 208
    .line 209
    :goto_5
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 210
    .line 211
    return-object p1

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 214
.end method
