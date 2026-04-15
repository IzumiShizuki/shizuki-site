.class public final Lcg/l;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj1/q;Lic/a;ZI)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcg/l;->b:I

    .line 1
    iput-object p1, p0, Lcg/l;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcg/l;->f:Ljava/lang/Object;

    iput-boolean p3, p0, Lcg/l;->d:Z

    iput p4, p0, Lcg/l;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ly/k1;ZLjc/m;II)V
    .locals 0

    .line 2
    iput p5, p0, Lcg/l;->b:I

    iput-object p1, p0, Lcg/l;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lcg/l;->d:Z

    iput-object p3, p0, Lcg/l;->f:Ljava/lang/Object;

    iput p4, p0, Lcg/l;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZLe3/j;Ll0/l1;I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcg/l;->b:I

    .line 3
    iput-boolean p1, p0, Lcg/l;->d:Z

    iput-object p2, p0, Lcg/l;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcg/l;->f:Ljava/lang/Object;

    iput p4, p0, Lcg/l;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcg/l;->b:I

    .line 2
    .line 3
    check-cast p1, Lx0/o;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lcg/l;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Le3/j;

    .line 16
    .line 17
    iget-object v0, p0, Lcg/l;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ll0/l1;

    .line 20
    .line 21
    iget v1, p0, Lcg/l;->e:I

    .line 22
    .line 23
    or-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-boolean v2, p0, Lcg/l;->d:Z

    .line 30
    .line 31
    invoke-static {v2, p2, v0, p1, v1}, Ll0/u0;->g(ZLe3/j;Ll0/l1;Lx0/o;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_0
    iget-object p2, p0, Lcg/l;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Lj1/q;

    .line 40
    .line 41
    iget-object v0, p0, Lcg/l;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lic/a;

    .line 44
    .line 45
    iget v1, p0, Lcg/l;->e:I

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget-boolean v2, p0, Lcg/l;->d:Z

    .line 54
    .line 55
    invoke-static {p2, v0, v2, p1, v1}, Ll0/u0;->e(Lj1/q;Lic/a;ZLx0/o;I)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_1
    iget-object p2, p0, Lcg/l;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p2, Ly/k1;

    .line 64
    .line 65
    iget-object v0, p0, Lcg/l;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lcg/b0;

    .line 68
    .line 69
    iget v1, p0, Lcg/l;->e:I

    .line 70
    .line 71
    or-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-boolean v2, p0, Lcg/l;->d:Z

    .line 78
    .line 79
    invoke-static {p2, v2, v0, p1, v1}, La/a;->j(Ly/k1;ZLcg/b0;Lx0/o;I)V

    .line 80
    .line 81
    .line 82
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_2
    iget-object p2, p0, Lcg/l;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ly/k1;

    .line 88
    .line 89
    iget-object v0, p0, Lcg/l;->f:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lcg/c0;

    .line 92
    .line 93
    iget v1, p0, Lcg/l;->e:I

    .line 94
    .line 95
    or-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    iget-boolean v2, p0, Lcg/l;->d:Z

    .line 102
    .line 103
    invoke-static {p2, v2, v0, p1, v1}, La/a;->f(Ly/k1;ZLcg/c0;Lx0/o;I)V

    .line 104
    .line 105
    .line 106
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 107
    .line 108
    return-object p1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
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
.end method
